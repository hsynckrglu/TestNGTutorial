package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	/* ITestListener interfacesini implement ettim. daha sonra testng.xml dosyasında
	 *  listeners bloğunu tanımladım suite den sonra. 
	 *  syntax-->
	 *   <listeners>
		      <listener class-name="test.Listeners"></listener>
	     </listeners> 
	     -->ayrıca test.Listeners ise test packageName listeners ise bulunduğu classın adı
	     şeklindedir xml dosyasında. classes bloğunun dışında tanımlanıyor.*/

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listeners başarıyla yürütüldü");
		/* aynı şekilde her test başarılı geçtiğinde ne yaptırmak istersem onu yazıyorum bu bloğa
		 * ne yaptırmak istersem gereksinimw  göre */
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Listeners hatayla yürütüldü"+result.getName());
		/* diyelimki ben her hata çıktığında screenshot almak istiyorum o mhatayı
		 * buraya kodu yazarım her hatayı kendi bulduğunda bu bloğa gelir ss alır. */
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
