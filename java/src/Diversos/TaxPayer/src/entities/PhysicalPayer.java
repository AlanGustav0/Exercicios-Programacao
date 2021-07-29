package entities;

public class PhysicalPayer extends TaxPayer {

	private Double healthSpending;

	public PhysicalPayer() {
		super();
	}

	public PhysicalPayer(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double taxCalc() {

		double spendings = 0.0;

		if (getAnnualIncome() > 20000.00 && healthSpending > 0) {
			spendings = (getAnnualIncome() * 0.25) - (healthSpending * 0.5);
			
		} else if (getAnnualIncome() < 20000 && healthSpending > 0) {
			spendings = (getAnnualIncome() * 0.15) - (healthSpending * 0.5);
			
		} else if (getAnnualIncome() > 20000 && healthSpending <= 0) {
			
			spendings = getAnnualIncome() * 0.25;
			
		} else {
			spendings = getAnnualIncome() * 0.15;
		}
		return spendings;
	}

}
