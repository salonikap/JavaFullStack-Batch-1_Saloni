package com.tms.interfaces;

import com.verizon.vehicleLoan;

public class LoanTest {
	public static void main(String[] args) {
		Loan l;
		HousingLoan hl=new HousingLoan();
		l=hl;
		l.applyLoan("ram",2000000.00);
        l.submitDocs();
        System.out.println(l.getEmi());
        Surity sl=hl;
        sl.submitDocs2();
        vehicleLoan vl=new vehicleLoan();
        l=vl;
        l.applyLoan("raj",10000.00);
        l.submitDocs();
        System.out.println(l.getEmi());
        sl=vl;
        sl.submitDocs2();

	}

}
