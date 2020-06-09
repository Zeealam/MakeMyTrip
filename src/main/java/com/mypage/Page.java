package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;

	public Page(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);

	}

	public abstract WebElement getElements(By locator);

	public abstract void waitForElementPresent(By locator);

	public abstract void doClick(By locator);

	public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
