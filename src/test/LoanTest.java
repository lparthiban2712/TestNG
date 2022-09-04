package test;

import org.testng.annotations.Test;


@Test(groups= {"regression"})
public class LoanTest extends BaseClass{
	
	@Test(priority=1)
	public void HomeLoanTest()
	{
		System.out.println("Inside HomeLoanTest");
	}
	
	@Test(priority=0)
	public void PersonalLoanTest()
	{
		System.out.println("Inside PersonalLoanTest");
	}
	
	@Test(priority=2,enabled=true)
	public void PersonalLoanTest1()
	{
		System.out.println("Inside PersonalLoanTest1");
	}
	
	
}
