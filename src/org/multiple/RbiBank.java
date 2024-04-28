package org.multiple;

public class RbiBank implements CanBank,AxisBank {

	private void home() {
		System.out.println("my home");

	}
	
	@Override
	public void homeLoan() {
		System.out.println("home loan 9%");
	}

	@Override
	public void GoldLoan() {
		System.out.println("goldloan 5%");
		
	}

	@Override
	public void CarLoan() {
		System.out.println("carloan 11%");
		
	}

	@Override
	public void savings() {
		System.out.println("savings 4%");
		
	}

	@Override
	public void current() {
		System.out.println("current 5% ");
		
	}

	@Override
	public void fixed() {
		System.out.println("fixed 7%");
		
	}

	@Override
	public void recurring() {
		System.out.println("recurring 6%");
		
	}
	
	public static void main(String[] args) {
		
		RbiBank r=new RbiBank();
		
		r.savings();
		r.current();
		r.fixed();
		r.recurring();
		r.homeLoan();
		r.GoldLoan();
		r.CarLoan();
		r.home();
		
	//upcasting
		System.out.println("------>upcasting-----<");
		
		CanBank c=new RbiBank();
		c.savings();
		c.current();
		c.fixed();
		c.recurring();
		c.homeLoan();
		c.GoldLoan();
		c.CarLoan();
		
		
	}

}
