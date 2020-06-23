package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class LoginData {
	int a=2;
	@DataProvider
	public Object[][] negativeLogin(){
		return ExcelUtils.getData("TestData.xls", "NegativeLogin");
	}
	
	//Test Case - UNF_078
	
	@DataProvider
	public Object[][] createCategory(){
		return ExcelUtils.getData("TestData.xls", "CreateCategory");
	}
		
	//Test Case - UNF_079
	@DataProvider
	public Object[][] negativeTest(){
		return ExcelUtils.getData("TestData.xls","NegativeTest");
			
			
	}
	
	
	@DataProvider
	public Object[][] CreatePatient(){
		return new Object[][] { 
			new Object[] {
			ExcelUtils.data("SuiteData.xls", "Sheet1", "createPatient").toArray() }
			};
	}
	
	@DataProvider
	public Object[][] SearchPatient(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "searchPatient").toArray() };
	}
}
