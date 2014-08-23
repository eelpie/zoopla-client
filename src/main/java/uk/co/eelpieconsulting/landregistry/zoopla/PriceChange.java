package uk.co.eelpieconsulting.landregistry.zoopla;

import java.math.BigDecimal;

public class PriceChange {

	private String date;
	private BigDecimal price;
	
	public String getDate() {
		return date;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "PriceChange [date=" + date + ", price=" + price + "]";
	}
	
}
