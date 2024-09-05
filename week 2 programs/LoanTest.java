package com.verizon;

public class LoanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Loan l;
        // HousingLoan hl=new HousingLoan();
		//h=l=hl;
         Loan l=new HousingLoan();
         l.applyLoan("ram",2000000.00);
         l.submitDocs();
         System.out.println(l.getEmi());
         
         l=new vehicleLoan();
         l.applyLoan("raj",10000.00);
         l.submitDocs();
         System.out.println(l.getEmi());
         
	}
	

}
