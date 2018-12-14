package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void TestPMT() {
		int ytw = 40;
		int yr= 20; 
		double arw = 0.07;
		double arr = 0.02;
		double ri = 10000;
		double ssi = 2642;
		double ExpectedPayment = 554.13;
		double ExpectedSaving = 1454485.55;


		Retirement rtm = new Retirement(ytw, arw, 
				yr, arr, ri, ssi);
		
		double PV = rtm.TotalAmountSaved();
		double PMT = rtm.AmountToSave();
		
		assertEquals(ExpectedSaving, Math.abs(PV), 0.01);
		assertEquals(ExpectedPayment, Math.abs(PMT), 0.01);
		
		System.out.println(PV);
		System.out.println(PMT);
	}
	
	
}
