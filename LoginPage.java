package com.FacebookPages;

import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class LoginPage extends BaseTest{
	
	
	   
		 public void clickSVGToggleIcon() {
		      driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		 }      
	         
		 public void checkDesktopCheckBox() {
			 driver.findElement(By.xpath("//input[@id='tree-node-desktop']/parent::label/span[@class='rct-checkbox']")).click();
		 }
		 public void checkDocumentCheckBox() {
			 driver.findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']")).click();
		 }          
	           
		 public void checkDownloadsCheckBox() {
			 driver.findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']")).click();     
		 }     
	        
		 public void checkRadioButton() {
			WebElement radio = driver.findElement(By.id("//input[@id='yesRadio'] "));
			 radio.click();
			  WebElement radio1 = driver.findElement(By.id("//input[@id='impressiveRadio']"));
			 radio1.click();
			
		 }
		 public void webTableInfo() {
			WebElement  e = getDriver().findElement(By.xpath("//"));
		 }
		  public void checkButtons() {
        	 
        			Actions action = new Actions(getDriver());
        			
        			WebElement element = getDriver().findElement(By.xpath("//button[@id='doubleClickBtn']"));
        	        action.doubleClick(element).perform();		
        		}
        		
        		public void checkRightClickkButtons() {
        	        Actions action = new Actions(getDriver());
        			
        			WebElement element = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        	        action.contextClick(element).perform();		
        		}
        		public void checkClickButtons() {
        	        Actions action = new Actions(getDriver());
        			
        			WebElement element = getDriver().findElement(By.xpath("//button[@id='ffrYB']"));
        	        action.click().perform();		
        		}	
         
        		public void verifyTheImages() {
        			WebElement element = getDriver().findElement(By.tagName("img"));
        			element.getSize();
        			System.out.println(element.getSize());	
        		}		
        		
       public void checkDynamicProperties() {
	      driver.findElement(By.xpath("//button[@id='enableAfter']")).click();
	      driver.findElement(By.xpath("//button[@id='colorChange']")).click();
	      driver.findElement(By.xpath("//button[@id='visibleAfter']")).click();
      }
       public void checkPrintAllLinks() {
		      List<WebElement> alltags = (List<WebElement>) driver.findElement(By.tagName("a"));
		      System.out.println("Total tags are : "+alltags.size());
		       
		      for(int i=0;i<alltags.size();i++)  {
                System.out.println("Links on page are "+alltags.get(i).getAttribute("href"));
                System.out.println("Links on page are "+alltags.get(i).getText());
		      }
		 }
		     public void checkBrokenLinks() {
		    	 Set<String>brokenlinkurls = new Set<String>();
		    	List<WebElement> links =driver.findElements(By.tagName("a"));
		    	System.out.println(links.size());
		    	
		  for(WebElement link : links) {
			   String linkURL  =link.getAttribute("href");
			   Proxy proxy = new  Proxy();
			   URL url = new URL(linkURL);
			   URLConnection urlConnection = url.openConnection();
			   HttpURLConnection httpURLConnection =(HttpURLConnection) urlConnection;
			   httpURLConnection.setConnectTimeout(3000);
			   httpURLConnection.connect();
			   if(httpURLConnection.getResponseCode() == 200)
				   System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
			   else
				   System.out.println(linkURL + " - " + httpURLConnection.getResponseCode());
		     }
		 }

              public void checkDownload() {
	            getDriver().findElement(By.xpath("//a[@id='downloadButton']")).click();
}

              }             
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

