
public class StockFundamental {
	private double pE;
	private double pCash;
	private double EPS5yrs;
	private double returnOnEquity;
	private double debtEquity;
	private double insiderOwn;

	private double forwardpE;
	private double pFreeCashFlow;
	private double salesG5yrs;
	private double returnOnInvest;
	private double grossMargin;
	private double insiderTrans;

	private double PEG;
	private double EPSgrowthThisYr;
	private double EPSgrowthQtr;
	private double currentRatio;
	private double OperMargin;
	private double InsOwnership;

	private double pS;
	private double EPSgrowthNextYr;
	private double salesGrowthQtr;
	private double quickRatio;
	private double netProfitMargin;
	private double InsTrans;

	public StockFundamental(double pE, double pCash, double EPS5yrs, double returnOnEquity, double debtEquity,
			double insiderOwn, double forwardpE, double pFreeCashFlow, double salesG5yrs, double returnOnInvest,
			double grossMargin, double insiderTrans, double PEG, double EPSgrowthThisYr, double EPSgrowthQtr,
			double currentRatio, double OperMargin, double InsOwnership, double pS, double EPSgrowthNextYr,
			double salesGrowthQtr, double quickRatio, double netProfitMargin, double InsTrans) {

		this.pE = pE;
		this.pCash = pCash;
		this.EPS5yrs = EPS5yrs;
		this.returnOnEquity = returnOnEquity;
		this.debtEquity = debtEquity;
		this.insiderOwn = insiderOwn;

		this.forwardpE = forwardpE;
		this.pFreeCashFlow = pFreeCashFlow;
		this.salesG5yrs = salesG5yrs;
		this.returnOnInvest = returnOnInvest;
		this.grossMargin = grossMargin;
		this.insiderTrans = insiderTrans;

		this.PEG = PEG;
		this.EPSgrowthThisYr = EPSgrowthThisYr;
		this.EPSgrowthQtr = EPSgrowthQtr;
		this.currentRatio = currentRatio;
		this.OperMargin = OperMargin;
		this.InsOwnership = InsOwnership;

		this.pS = pS;
		this.EPSgrowthNextYr = EPSgrowthNextYr;
		this.salesGrowthQtr = salesGrowthQtr;
		this.quickRatio = quickRatio;
		this.netProfitMargin = netProfitMargin;
		this.InsTrans = InsTrans;

	}

}
