package org.partial;

public abstract class RbiBank {
	
	  // abstract
	abstract void savings();
	abstract void current();
	
	abstract void fixed();
	    
	     //non abstract
	public void od() {
		System.out.println("od account intrest rate is 6%");

	}
	
	
}