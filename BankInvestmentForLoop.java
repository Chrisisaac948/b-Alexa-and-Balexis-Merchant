
package vu.bukotovillagebanklimitedsystem;

import java.util.Scanner;

public class BankInvestmentForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of members: ");
        int numMembers = scanner.nextInt();

        double[] principalAmounts = new double[numMembers];
        double[] interestRates = new double[numMembers];
        int[] timeFrames = new int[numMembers];

        for (int i = 0; i < numMembers; i++) {
            System.out.print("Enter principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();

            System.out.print("Enter interest rate for member " + (i + 1) + " (%): ");
            interestRates[i] = scanner.nextDouble() / 100;

            System.out.print("Enter time frame for member " + (i + 1) + " (years): ");
            timeFrames[i] = scanner.nextInt();
        }

        for (int i = 0; i < numMembers; i++) {
            double investmentValue = principalAmounts[i] * Math.pow(1 + interestRates[i], timeFrames[i]);
            System.out.println("Investment value for member " + (i + 1) + ": " + investmentValue);
        }
    }
}

