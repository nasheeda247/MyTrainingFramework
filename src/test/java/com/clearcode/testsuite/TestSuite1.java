package com.clearcode.testsuite;

import org.testng.annotations.Test;
import com.clearcode.po.CategoryPage;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.RegisterPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{
	
   //Positive Test Case "UNF_078" - To verify whether application allows admin to create multiple category & 
  // add product on the created category
	
   @Test(priority=1,dataProvider="createCategory",dataProviderClass=LoginData.class)
	public void addCategory(String cat_name, String desc, String meta_title, String meta_desc, String prod_name, String prod_meta_title, String cat, String prod_model) {	
		
	    wdu.type(HomePage.user_ip, "admin");
		wdu.type(HomePage.pass_ip, "admin@123");
		wdu.click(HomePage.login_Btn);
		wdu.mouseOver(CategoryPage.Catalog_icon);
		wdu.click(CategoryPage.Catagories_link);
		wdu.assertTitle("Categories");
		wdu.click(CategoryPage.Add_btn);
		wdu.type(CategoryPage.Category_name, cat_name);
		wdu.type(CategoryPage.Category_desc, desc);
		wdu.type(CategoryPage.Category_meta_title, meta_title);
		wdu.type(CategoryPage.Category_meta_desc, meta_desc);
		wdu.click(CategoryPage.Category_Save_Btn);
		wdu.mouseOver(CategoryPage.Catalog_icon);
		wdu.click(CategoryPage.Products_link);
		wdu.assertTitle("Products");
		wdu.click(CategoryPage.Add_btn);
		wdu.type(CategoryPage.Category_name, prod_name);
		wdu.type(CategoryPage.Category_meta_title, prod_meta_title);
		wdu.click(CategoryPage.Prod_Data_Tab);
		wdu.type(CategoryPage.Prod_Model, prod_model);
		wdu.click(CategoryPage.Prod_Links_Tab);
		wdu.type(CategoryPage.Prod_Categories, cat);
		wdu.click(CategoryPage.Prod_Save);
		wdu.assertText(CategoryPage.Success_Msg, "Success: You have modified products!" +"\n"+ "×");
		wdu.click(CategoryPage.Logout_link);
		
							
	}
   
   // Negative Test Case "UNF_078" - To verify whether application displays error message upon entering invalid 
   //details while creating product based on the category
   
   @Test(priority=2,dataProvider="negativeTest",dataProviderClass=LoginData.class)
   public void negativeAddTest(String[] data) throws InterruptedException {	
		wdu.type(HomePage.user_ip, "admin");
		wdu.type(HomePage.pass_ip, "admin@123");
		wdu.click(HomePage.login_Btn);
		wdu.mouseOver(CategoryPage.Catalog_icon);
		wdu.click(CategoryPage.Catagories_link);
		wdu.assertTitle("Categories");
		wdu.click(CategoryPage.Add_btn);
		wdu.type(CategoryPage.Category_name, data[0]);
		wdu.type(CategoryPage.Category_desc, data[1]);
		wdu.type(CategoryPage.Category_meta_title, data[2]);
		wdu.type(CategoryPage.Category_meta_desc, data[3]);
		wdu.click(CategoryPage.Category_Save_Btn);
		
		if (data[0] ==""|| data[2]=="") {
			
			wdu.assertText(CategoryPage.Error_Msg, "Warning: Please check the form carefully for errors!" +"\n"+ "×");
		} else {
			
			wdu.assertText(CategoryPage.Success_Msg, "Success: You have modified categories!" +"\n"+ "×");
				
			}
		wdu.mouseOver(CategoryPage.Catalog_icon);
		wdu.click(CategoryPage.Products_link);
		wdu.assertTitle("Products");
		wdu.click(CategoryPage.Add_btn);
		wdu.type(CategoryPage.Category_name, data[4]);
		wdu.type(CategoryPage.Category_meta_title, data[5]);
		wdu.click(CategoryPage.Prod_Data_Tab);
		wdu.type(CategoryPage.Prod_Model, data[6]);
		wdu.click(CategoryPage.Prod_Links_Tab);
		wdu.type(CategoryPage.Prod_Categories, data[7]);
		wdu.click(CategoryPage.Prod_Save);
		if (data[4] ==""|| data[5]==""||data[6]=="") {
			
			wdu.assertText(CategoryPage.Error_Msg, "Warning: Please check the form carefully for errors!" +"\n"+ "×");
			
		 } else {
			 
			wdu.assertText(CategoryPage.Success_Msg, "Success: You have modified products!" +"\n"+ "×");	
			
			}
		
		wdu.click(CategoryPage.Logout_link);
		
								
	}
   
        
//	@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
//	
//	public void createStudent(String[] data) throws InterruptedException {
//		wdu.type(HomePage.username_ip, data[0]);
//		wdu.type(HomePage.pwd_ip, data[1]);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
//		wdu.type(PatientPage.fname_ip, data[3]);
//		wdu.type(PatientPage.lname_ip, data[4]);
//		wdu.enableCheckbox(RegisterPage.student_rbutton);
//		wdu.type(RegisterPage.fname_ip, data[3]);
//		
//	}
   
	
//	@Test(enabled=false,dataProvider="SearchPatient",dataProviderClass=LoginData.class)
//	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
//		wdu.type(HomePage.username_ip, user);
//		wdu.type(HomePage.pwd_ip, pwd);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
//	}
	
   
   
}
