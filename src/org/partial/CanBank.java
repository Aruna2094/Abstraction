package org.partial;

public class CanBank extends RbiBank {
	
	private void homeLoan() {
		System.out.println("Home loan intrest rate is 10%");
	}

	@Override
	void savings() {
		System.out.println("savings account intrest rate is 4%");
		
	}

	@Override
	void current() {
		System.out.println("current account intrest rate is 5%");
		
	}

	@Override
	void fixed() {
		System.out.println("fixed account intrest rate is 7%");
	}

	
	public static void main(String[] args) {
		CanBank c=new CanBank();
		c.homeLoan();
		c.savings();
		c.current();
		c.fixed();
		c.od();
		
		RbiBank r=new CanBank();
		r.savings();
		r.current();
		r.fixed();
		r.od();
	}
	
	
	
	
}
