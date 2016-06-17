/**
 *
 */
package com.asianpaints.core.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.util.CSVWriter;
import de.hybris.platform.util.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.asianpaints.core.model.DetailsComingSoonModel;


/**
 * @author roalex
 *
 */
public class ExportCustomerCronJob extends AbstractJobPerformable<CronJobModel>
{

	private static final Logger LOG = Logger.getLogger(ExportCustomerCronJob.class);
	private static final String ENCODING = "UTF-8";
	private static final String TEMPEXT = ".txt";
	private static final String FILENAME = "CustomerData";
	private static final String FILENAMEDATEFORMAT = "yyyyMMddHHmmss";



	@SuppressWarnings("boxing")
	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		LOG.info("==========Inside Perform method ExportCustomerCronjob==========");

		try
		{
			final String queryString = new StringBuilder("SELECT {PK} FROM {DetailsComingSoon} where {isExportedCustomer}=false")
					.toString();
			final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
			final SearchResult searchResult = flexibleSearchService.search(query);
			final List<DetailsComingSoonModel> customerList = searchResult.getResult();

			if (customerList != null && !customerList.isEmpty())
			{
				final String basePath = Config.getParameter("acceleratorservices.export.basefolder");
				final String stamp = new SimpleDateFormat(FILENAMEDATEFORMAT).format(new Date());
				final String filename = basePath + File.separator + FILENAME + "-" + stamp;

				final File csvFile = new File(filename + TEMPEXT);

				final CSVWriter writer = new CSVWriter(csvFile, ENCODING);

				try
				{
					//export
					for (final DetailsComingSoonModel customerExport : customerList)
					{
						exportCustomer(customerExport, writer);

						//mark as exported true
						customerExport.setIsExportedCustomer(true);
						modelService.save(customerExport);
					}

					//unlock (rename) file
					writer.close();
					csvFile.renameTo(new File(filename + ".csv"));
				}
				catch (final Exception e)
				{
					writer.close();
					csvFile.delete();
					throw e;
				}
			}

		}
		catch (final FileNotFoundException fnfe)
		{
			LOG.error("Could not write file for CSV export ", fnfe);
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}
		catch (final UnsupportedEncodingException e)
		{
			LOG.error(e.getMessage(), e);
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}
		catch (final IOException e)
		{
			LOG.error(e.getMessage(), e);
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}



	/**
	 * @param customerExport
	 * @param writer
	 */
	private void exportCustomer(final DetailsComingSoonModel customerExport, final CSVWriter writer) throws IOException
	{
		LOG.info("Exporting Customer == " + customerExport.getEmailid());

		final Map<Integer, String> values = new HashMap();

		values.put(Integer.valueOf(0), customerExport.getFirstname());
		values.put(Integer.valueOf(1), customerExport.getLastname());
		values.put(Integer.valueOf(2), customerExport.getEmailid());
		values.put(Integer.valueOf(3), customerExport.getProductCode());
		values.put(Integer.valueOf(4), customerExport.getProductName());

		writer.write(values);


	}

}
