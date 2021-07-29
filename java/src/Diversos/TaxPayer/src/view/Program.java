package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPayer;
import entities.PhysicalPayer;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.print("Tax payer # " + i + " data");
			System.out.println("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (ch == 'c') {
				System.out.println("Number of employees: ");
				int employeeNumber = sc.nextInt();
				list.add(new LegalPayer(name, annualIncome, employeeNumber));
			} else {
				System.out.println("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new PhysicalPayer(name, annualIncome, healthSpending));
			}
		}

		System.out.println("");
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for (TaxPayer payer : list) {
			System.out.printf("%s $ %.2f%n", payer.getName(), payer.taxCalc());
			totalTaxes += payer.taxCalc();
		}

		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

		sc.close();

	}

}
