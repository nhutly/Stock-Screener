
public class Stock {
	private String ticker;

	private long marketCap;
	private double pE;
	private double divYield;
	private int volume;

	private double eps;
	private double curRatio;
	private double quickRatio;
	private double beta;
	private double price;

	public Stock(String ticker, long marketCap, double pE, double divYield, int volume, double eps, double curRatio,
			double quickRatio, double beta, double price) {
		this.ticker = ticker;
		this.marketCap = marketCap;
		this.pE = pE;
		this.divYield = divYield;
		this.volume = volume;

		this.eps = eps;
		this.curRatio = curRatio;
		this.quickRatio = quickRatio;
		this.beta = beta;
		this.price = price;

	}

	public Stock(String ticker) {
		this.ticker = ticker;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}

	public void setPE(double pE) {
		this.pE = pE;
	}

	public void setDivYield(double divYield) {
		this.divYield = divYield;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setEps(double eps) {
		this.eps = eps;
	}

	public void setCurRatio(double curRatio) {
		this.curRatio = curRatio;
	}

	public void setQuickRatio(double quickRatio) {
		this.quickRatio = quickRatio;
	}
	
	public void setBeta (double beta) {
		this.beta = beta;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
}
