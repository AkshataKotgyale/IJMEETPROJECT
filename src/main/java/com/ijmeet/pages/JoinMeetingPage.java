package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetingPage {
	
	@FindBy(css="h2.m-txt")
	public WebElement quickJoinMeetingNxt;

	/**
	 * This method will return "Quick Join Meeting" if join meeting loads successfully
	 */
	public String getPageHeading() {
		return quickJoinMeetingNxt.getText();

	}
}
