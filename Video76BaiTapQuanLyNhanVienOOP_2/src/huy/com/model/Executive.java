package huy.com.model;

public class Executive extends Employee {
	private double bonus;
	
	public void awardBonus(double bonus) {
		this.bonus = bonus;
		System.out.println("Lanh bonus = "+bonus);
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay() + this.bonus;
	}
}
