package org.fully;

public class SbiBank implements RbiBank {
	
	private void homeLoan() {
		System.out.println("homeloan intrest rate is 10%");

	}

	@Override
	public void savings() {
		System.out.println("savings intrest rate is 4%");
		
	}

	@Override
	public void current() {
		System.out.println("current intrest rate is 5%");
		
	}

	@Override
	public void fixed() {
		System.out.println("fixed intrest rate is 6%");
		
	}

	@Override
	public void od() {
		System.out.println("od intrest rate is 8%");
		
	}
	public static void main(String[] args) {
		SbiBank s=new SbiBank();
		s.homeLoan();
		s.savings();
		s.current();
		s.od();
		s.fixed();
		
		RbiBank r=new SbiBank();
		r.savings();
		r.current();
		r.od();
		r.fixed();
		System.out.println("done");
	}

}
