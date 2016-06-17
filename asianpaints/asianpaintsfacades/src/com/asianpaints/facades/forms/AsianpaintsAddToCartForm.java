/**
 *
 */
package com.asianpaints.facades.forms;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @author roalex
 *
 */
public class AsianpaintsAddToCartForm
{
	@NotNull(message = "{basket.error.quantity.notNull}")
	@Min(value = 0, message = "{basket.error.quantity.invalid}")
	@Digits(fraction = 0, integer = 10, message = "{basket.error.quantity.invalid}")
	private long qty = 1L;
	private List<String> extras;

	public void setQty(final long quantity)
	{
		this.qty = quantity;
	}

	public long getQty()
	{
		return qty;
	}

	/**
	 * @return the extras
	 */
	public List<String> getExtras()
	{
		return extras;
	}

	/**
	 * @param extras
	 *           the extras to set
	 */
	public void setExtras(final List<String> extras)
	{
		this.extras = extras;
	}

}
