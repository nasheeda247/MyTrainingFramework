package com.clearcode.po;

import org.openqa.selenium.By;

public class CategoryPage {
	
	//public static By Catalog_icon = By.xpath("//*[@id=\"catalog\"]/a"); 
	public static By Catalog_icon = By.id("catalog"); 
	public static By Catagories_link = By.xpath("//*[@id=\"catalog\"]/ul/li[1]/a");
	//public static By Catagories_link = By.partialLinkText("Catagories");
	public static By Add_btn = By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[1]");
	//public static By Add_btn = By.linkText("Add New");
	public static By Category_name = By.id("input-name1");
	public static By Category_desc = By.xpath("//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]");
	public static By Category_meta_title = By.id("input-meta-title1");
	public static By Category_meta_desc = By.id("input-meta-description1");
	public static By Category_Save_Btn = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
	public static By Success_Msg = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
	public static By Products_link = By.xpath("//*[@id=\"catalog\"]/ul/li[2]/a");
	public static By Prod_Links_Tab = By.partialLinkText("Links");
    public static By Prod_Categories = By.id("input-category");
    public static By Prod_Save = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
    public static By Home_Link = By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]/a");
    public static By DashBoard_Link = By.id("//*[@id=\"dashboard\"]");
    public static By Logout_link = By.xpath("//*[@id=\"header\"]/ul/li[4]/a/span");
    public static By Prod_Data_Tab = By.xpath("//*[@id=\"form-product\"]/ul/li[2]/a");
    public static By Prod_Model =  By.id("input-model");
    public static By Error_Msg = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
    		
			
}
