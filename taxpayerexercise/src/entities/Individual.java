package entities;

public class Individual extends TaxPayer {
	private Double healthExpeditures;
	
	public Individual(String name, Double anualIncome, Double healthExpeditures) {
		super(name, anualIncome);
		this.healthExpeditures = healthExpeditures;
	}

	@Override
	public Double tax() {
		if(getAnualIncome() < 20000.00) {
			return (getAnualIncome() * 0.15) - (healthExpeditures * 0.5);
		} else if (getAnualIncome() >= 20000.00) {
			return (getAnualIncome() * 0.25) - (healthExpeditures * 0.5);
		}
		
		return null;
	}

}
