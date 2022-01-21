package com.homepage;

import com.ijmeet.cofig.BaseFrame;
import com.ijmeet.pages.Homepage;
import com.ijmeet.pages.JoinMeetingPage;

import static com.ijmeet.util.KeywordIjmeet.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
public class JoinMeeting extends BaseFrame {
	
	@Test
	public void verifyClickOnJoinMeeting() {
		Homepage home=new Homepage();
				home.cilckOnJoinMeeting();
		waitForElement(3000);
		JoinMeetingPage joinMeeting=PageFactory.initElements(driver, JoinMeetingPage.class);
		String actual=joinMeeting.getPageHeading();
		Assert.assertEquals(actual, "Quick Join a Meeting");
		
	}

}
