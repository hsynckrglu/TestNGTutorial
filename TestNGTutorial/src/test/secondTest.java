package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class secondTest {
	/* beforMethod ve AfterMethod sadece bu class içindeki her metoddan önce ve sonra yürütülür!
	beforeTest ve AfterTest gibi xmldeki class klasörü içinde değil bulunduğu class içindeki metodları bağlar  */ 
	
	
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("her fonksiyondan önce yürütülürüm tek tek");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("her fonksiyondan sonra yürütülürüm tek tek");
	}

	@Test(dataProvider="getData")
	public void test1(String username, String password) {
		System.out.println("second test");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void test2() {
		System.out.println("third test");
	}
	
	@Test
	public void test3() {
		System.out.println("fourth test");
	}
	
	@Test
	public void test4() {
		System.out.println("fifth test");
	}
	@Test(groups= {"Smoke"})
	public void gruplanmısTest3() {
		System.out.println("secondTest içindeki gruplanmış Test");
	}
	
	@DataProvider
	public Object[][] getData() {
		/* üç kombinasyonumuz var diyelim.
		 * 1st combination -> username, password -> good credit history =row 
		 * 2nd -> username, password -> no credit history
		 * 3th -> username, password -> fraudelent credit history(hileli)  */
		
		/* array oluşturucam satır ve sütundan oluşan
		 * satırlara kaç kombinasyon varsa onu yazıcam(3)
		 * sütunlara ise kaç değişken varsa onu yazıcam(2) */
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]="firstSetUsername";
		data[0][1]="firstSetPassword";
		//2nd set
		data[1][0]="secondSetUsername";
		data[1][1]="secondSetUsername";
		//3th set
		data[2][0]="thirdSetUsername";
		data[2][1]="thirdSetUsername";
		
		return data;
		
	}

	
	
}
