package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vijay {
	@Test(groups = { "KFI","Pan india"})
	public void vj() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Vijay_(actor)#1984%E2%80%932003:_Debut_and_transition_to_lead_roles");
	driver.quit();
	}
}
