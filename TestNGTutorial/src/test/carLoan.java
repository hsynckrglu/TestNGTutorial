package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carLoan {
	/* gruplandırma işlemi şu şekildedir. Diyelimki bi rkredi çekildikten sonra bir bir metodu test
	 * etmek istiyoruz. ama bir sürü java classı var bunların içinden belirli metodları test etmek isteniliyo.
	 * Diyelimki 100 tane classımız var ve her class içinden belirli metodlar test edilecek bunu groups ile test
	 * deceğiz. Syntax --> @Test(groups={"groupName"}) 
	 * testng3.xml dosyasında tanımlaması var */
	
	/* @Test(enabled=false) ifadesiyle daha önceden hatalı bir test var diyelim 
	 * ve bunu koşturmadan atlamak istiyorum bu şekilde kullanarak kullanmadan koşturulmadan
	 * bu testi atlar.  */
	
	/* @Test(enabled=false) neden kullanırım? 
	 *uygulamamda bir kaç hatanın olduğunu biliyorum ve çerçevemin bunları koşturmasını istemiyorm. */
	
	/* @Test(dependsOnMethods={"bağlıOlduğuMetodunAdı"}) bağlı olduğu metodu yazılır. o teste  bağımlı olur   */
	
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlName) {
		//selenium
		System.out.println("webLoginCar");
		System.out.println(urlName);
	}
	@Test(enabled=false)
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("mobileLoginCar");
	}
	@Test(dependsOnMethods={"WebLoginCarLoan"})
	public void LoginAPICarLoan() {
		//Rest API automation
		System.out.println("APILoginCar");
	}
	@BeforeTest
	public void BeforeTestDeneme() {
		System.out.println("En ilk ben yürütüleceğim test xml classının içinde ");
		/* xml dosyasının içinde test classlarının içinde en ilk yürütülür test edilir. */
	}
	@BeforeSuite
	public void bfSuite() {
		System.out.println("suite nin içinde ilk ben yürütüleceğim");
	}
	
	@Test(groups= {"Smoke"})
	public void gruplanmısTest() {
		System.out.println("carLoan içindeki gruplanmış Test");
	}

}
