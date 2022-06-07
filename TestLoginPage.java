package com.facebookTest;

import com.FacebookPages.LoginPage;

import generic.BaseTest;

public class TestLoginPage extends BaseTest{

	public static void main(String[] args) {
		LoginPage objLoginPage =new LoginPage();
		
	objLoginPage.initilizeWebDriver("https://demoqa.com/checkbox");
		  objLoginPage.clickSVGToggleIcon();
		  objLoginPage.checkDesktopCheckBox();
		  objLoginPage.checkDocumentCheckBox();
		  objLoginPage.checkDownloadsCheckBox();
		
   objLoginPage.initilizeWebDriver("https://demoqa.com/radio-button");
           objLoginPage.checkRadioButton();
        
   objLoginPage.initilizeWebDriver("https://demoqa.com/webtables");
   
   objLoginPage.initilizeWebDriver("https://demoqa.com/links");
        objLoginPage.checkPrintAllLinks();
        
   objLoginPage.initilizeWebDriver("https://demoqa.com/broken");
        objLoginPage.checkBrokenLinks();
   
    objLoginPage.initilizeWebDriver("https://demoqa.com/buttons");
        objLoginPage.checkButtons();
        objLoginPage.checkRightClickkButtons();
        objLoginPage.checkClickButtons();
  
    
    objLoginPage.initilizeWebDriver("https://demoqa.com/upload-download");
       objLoginPage.checkDownload();

    objLoginPage.initilizeWebDriver("https://demoqa.com/dynamic-properties");
        objLoginPage.checkDynamicProperties();
      
	}
    
}
	
	
	
	
