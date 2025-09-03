package com.java.oops.polyDemo;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi=new RBI();
		rbi.getInterestRate();//6 - 12 %

		RBI sbi=new SBI();
		sbi.getInterestRate();//6%
		
		RBI iob=new IOB();
		iob.getInterestRate();//8%
		
		RBI kvb=new KVB();
		kvb.getInterestRate();//10%
	}

}
