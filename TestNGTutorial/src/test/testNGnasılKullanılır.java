package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGnasılKullanılır {
	
	@Test
	public void Demo() {
		System.out.println("Hello World!");
		Assert.assertTrue(false); // ITestListener interfacesi hata bulsun diye yazdığım bir kod.
	}
	
	@Test(groups= {"Smoke"})
	public void gruplanmısTest() {
		System.out.println("testNGnasılKullanılır içindeki gruplanmış Test");
	}

	
	
	/* Projeyi sağ tık yaptığımızda TestNG seçeneğini sonrasında Convert to TestNG
	 * seçeneğini seç. xml dosyası oluşuyor.
	 * yapı kabaca şu şekildedir; */
	
/* <suite name="Loan Department"> -->İstediğini ver
	<test name="Personal Loan"> -->Test ismi istediğini ver
		<classes>
			<class name="test.secondTest"> --> "packageName.ClassName"
				<methods>
					<include name="test1"></include> -->classın içindeki testlerden hangisini koşmak istiyorsan 
				</methods>
			</class>
			<class name="test.testNGnasılKullanılır" />
			<class name="test.homeLoan" />
		</classes>
	</test>
   </suite>	
		*/
	
	
	
	/* <suite name="Loan Department">
	 * <test name="Car Loan" > 
	 * 
	 *    <classes>
	 *       <class>
	 *          <methods>
	 *              <exclude name="Mobile.*"> -->koşulmasını istemediğin metodu buraya yazarsan koşmaz
	 *                                           diyelimki 30 tane Mobile ile alakalı test var classs içinde adam da diyoki
	 *                                           mibile testlerini koşma e ne yapıca tek tek eklemek uzun sürer
	 *                                           "Mobile.*" ismin sonuna (.*) koyuyorum ve tüm mobilleri anlıyor.
	 *              </exclude>
	 *          </methods> 
	 *       </class>
	 *    </classes>
	 * </test>
	 * 
	 * */
	
	
 
}
