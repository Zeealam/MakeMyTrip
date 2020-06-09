package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlight extends BasePage {

	public BookFlight(WebDriver driver) {
		super(driver);

	}

	private By Toclick = By.xpath("//input[@id=\"toCity\"]");

	private By EnterCity = By.xpath("//input[@placeholder=\"To\"]");

	private By ClickBangalore = By.xpath("//p[@class=\"font14 appendBottom5 blackText\"][contains(text(),'Bengaluru, India')]");

	private By Departure = By.xpath("//input[@id=\"departure\"]");

	private By date = By.xpath("//div[@aria-label='Tue Jul 07 2020']/div");

	private By Searchbutton = By.xpath("//a[contains(text(),'Search')]");

	/**
	 * @return the from
	 */
	public WebElement getFrom() {
		return getElements(Toclick);
	}

	public WebElement enterCity() {
		return getElements(EnterCity);
	}

	public void doSearch(String Tocity) throws InterruptedException {

		doClick(Toclick);

		enterCity().sendKeys(Tocity);

		doClick(ClickBangalore);

		doClick(Departure);
		doClick(date);
		System.out.println("Test");

		doClick(Searchbutton);
		System.out.println("Test1");
	}

	public void selectDate(WebDriver driver, WebElement element, String dateVal) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);

	}

}
