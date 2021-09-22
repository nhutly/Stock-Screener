
public class StockTechnical {
	private double performance;
	private double t20DaySimpleMA;
	private double t20DayHL;
	private double beta;

	private double prform2;
	private double t50DaySimpleMA;
	private double t50DayHL;
	private double avgTrueRange;

	private double voltaility;
	private double t200DaySimpleMA;
	private double t52WeekHL;
	private double afterHrClose;

	private int RSI;
	private double change;
	private String pattern;
	private double afterHrChange;

	private double gap;
	private double changeFromOpen;
	private String candleStick;

	public StockTechnical(double performance, double t20DaySimpleMA, double t20DayHL, double beta, double prform2,
			double t50DaySimpleMA, double t50DayHL, double avgTrueRange, double voltaility, double t200DaySimpleMA,
			double t52WeekHL, double afterHrClose, int RSI, double change, String pattern, double afterHrChange,
			double gap, double changeFromOpen, String candleStick) {

		this.performance = performance;
		this.t20DaySimpleMA = t20DaySimpleMA;
		this.t20DayHL = t20DayHL;
		this.beta = beta;

		this.prform2 = prform2;
		this.t50DaySimpleMA = t50DaySimpleMA;
		this.t50DayHL = t50DayHL;
		this.avgTrueRange = avgTrueRange;

		this.voltaility = voltaility;
		this.t200DaySimpleMA = t200DaySimpleMA;
		this.t52WeekHL = t52WeekHL;
		this.afterHrClose = afterHrClose;

		this.RSI = RSI;
		this.change = change;
		this.pattern = pattern;
		this.afterHrChange = afterHrChange;

		this.gap = gap;
		this.changeFromOpen = changeFromOpen;
		this.candleStick = candleStick;

	}

}
