package com.Tests;

import org.testng.annotations.Test;

import com.mypage.BookFlight;

public class BookFlightTest extends BaseTest {
	@Test
	public void bookFlight() throws InterruptedException {
		page.getInstance(BookFlight.class).doSearch(pro.getProperty("Tocity"));

	}

}
