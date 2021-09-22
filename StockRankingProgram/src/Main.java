import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// creates file and file reader
		File file = new File("Stock Ranking Program - Sheet1.csv");
		Scanner inputFile = new Scanner(file);
		inputFile.nextLine();

		// creates array of 30 stocks in Dow Jones
		Stock[] stocks = new Stock[30];

		for (int i = 0; i < stocks.length; i++) {
			String line = inputFile.nextLine();
			String[] info = line.split(",");

			// create a new Stock with its ticker
			stocks[i] = new Stock(info[1]);

			// set market cap
			double mCap = 0;
			if (info[2].contains("B")) {
				mCap = Double.parseDouble(info[2].substring(0, info[2].length() - 1)) * 1000000000000L;
			}
			stocks[i].setMarketCap((long) mCap);

			// set PE
			double pE = 0;
			if (info[3].equals("-")) {
				pE = -1;
			} else {
				pE = Double.parseDouble(info[3]);
			}
			stocks[i].setPE(pE);

			// set dividend yield
			double divY = 0;
			if (info[4].equals("-")) {
				divY = -1;
			} else {
				divY = Double.parseDouble(info[4]);
			}
			stocks[i].setDivYield(divY);

			// set volume
			int vol = 0;
			vol = Integer.parseInt(info[5].substring(0, info[5].length() - 1));
			stocks[i].setVolume(vol);

			// set EPS
			double eps = 0;
			eps = Double.parseDouble(info[6]);
			stocks[i].setEps(eps);

			// set curRatio
			double curRatio = 0;
			if (info[7].equals("-")) {
				curRatio = -1;
			} else {
				curRatio = Double.parseDouble(info[7]);
			}
			stocks[i].setCurRatio(curRatio);

			// set quickRatio
			double quickRatio = 0;
			if (info[8].equals("-")) {
				quickRatio = -1;
			} else {
				quickRatio = Double.parseDouble(info[8]);
			}
			stocks[i].setQuickRatio(quickRatio);

			// set beta
			double beta = 0;
			if (info[9].equals("-")) {
				beta = -1;
			} else {
				beta = Double.parseDouble(info[9]);
			}
			stocks[i].setBeta(beta);
			
			// set double
			double price = 0;
			price = Double.parseDouble(info[10]);
			stocks[i].setPrice(price);

		}

		inputFile.close();

	}
}
