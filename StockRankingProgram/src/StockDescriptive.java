
public class StockDescriptive {
	private String exchange;
	private long marketCap;
	private String earningsDate;
	private double targetPrice;

	private String index;
	private double dividendYield;
	private long averageVolume;
	private String IPODate;

	private String sector;
	private double floatShort;
	private double relativeVolume;
	private long sharesOutstanding;

	private String industry;
	private String analystRec;
	private long currentVolume;
	private long floatOfStock;

	private String country;
	private String opSh;
	private int price;

	public StockDescriptive(String exchange, long marketCap, String earningsDate, double targetPrice, String index,
			double dividendYield, long averageVolume, String IPODate, String sector, double floatShort,
			double relativeVolume, long sharesOutstanding, String industry, String analystRec, long currentVolume,
			long floatOfStock, String country, String opSh, int price) {
		this.exchange = exchange;
		this.marketCap = marketCap;
		this.earningsDate = earningsDate;
		this.targetPrice = targetPrice;

		this.index = index;
		this.dividendYield = dividendYield;
		this.averageVolume = averageVolume;
		this.IPODate = IPODate;

		this.sector = sector;
		this.floatShort = floatShort;
		this.relativeVolume = relativeVolume;
		this.sharesOutstanding = sharesOutstanding;

		this.industry = industry;
		this.analystRec = analystRec;
		this.currentVolume = currentVolume;
		this.floatOfStock = floatOfStock;

		this.country = country;
		this.opSh = opSh;
		this.price = price;
	}

}
