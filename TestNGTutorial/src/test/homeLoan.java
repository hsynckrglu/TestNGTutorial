package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homeLoan{
	
	/* beforeClass ve afterClass metodları kullanıldığında
	 * bulunduğu class içinde ilk test eder class içindeki diğer testleri ise alfabetik bir şekilde test eder.*/
	
	@Test
	public void WebLoginHomeLoan() {
		//selenium
		System.out.println("webLoginHome");
	}
	@Test
	public void MobileLoginHomeLoan() {
		//appium
		System.out.println("mobileLoginHome");
	}
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API automation
		System.out.println("APILoginHome");
	}
	
	@AfterTest
	public void AfterTestDeneme() {
		System.out.println("En son ben yürütüleceğim test xml classının içinde");
		/* xml dosyasının içinde test classlarının içinde en son yürütülür test edilir. */
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("suite içinde en son ben yürütüleceğim");
	}
	
	@BeforeClass
	public void bfClass() {
		System.out.println("bulunduğum class içinde ilk ben yürütülürüm");
	}
	
	@Test(groups= {"Smoke"})
	public void gruplanmısTest2() {
		System.out.println("homeLoan içindeki gruplanmış Test");
	}


}
