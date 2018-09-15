package com.magento.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.qa.base.TestBase;

public class ShoppingCartPage extends TestBase {

	
	String basepath="//tr[@class='first last odd']//td[@class='product-cart-image']//a[@title='Sony Xperia']";
	String input_qty="//parent::td/following-sibling::td[3]//input[@title='Qty']";
	
	ShoppingCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyErrorMessage()
	{
		driver.findElement(By.xpath(basepath+input_qty)).sendKeys("1000");
		driver.findElement(By.xpath(basepath+input_qty+"/following-sibling::button")).click();
		return driver.findElement(By.xpath(basepath+"//parent::td/following-sibling::td[1]//p[@class='item-msg error']")).getText();
	}
}
