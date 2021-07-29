package entities;

public class LegalPayer extends TaxPayer {

	private Integer employeeNumber;

	public LegalPayer() {
		super();
	}

	public LegalPayer(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double taxCalc() {
		
		double spendings = 0.0;
		
		if(employeeNumber <= 10) {
			spendings = getAnnualIncome() * 0.16;
		}else {
			spendings = getAnnualIncome() * 0.14;
		}

		return spendings;
	}

}
