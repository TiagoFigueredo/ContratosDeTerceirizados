package entities;

public class OutsourcedEmployee extends Employee {
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addiotionalCharge) {
		super(name, hours, valuePerHour);
		this.addiotionalCharge = addiotionalCharge;
	}

	private Double addiotionalCharge;

	public Double getAddiotionalCharge() {
		return addiotionalCharge;
	}
	public void setAddiotionalCharge(Double addiotionalCharge) {
		this.addiotionalCharge = addiotionalCharge;
	}
	
	@Override
	public Double payment(){
		return super.payment() + 1.1*addiotionalCharge; 
	}
}

