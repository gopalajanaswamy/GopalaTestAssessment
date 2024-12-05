package pageobject;

import org.openqa.selenium.By;

public class NewsAndFeaturesPage {

	//public By timeValuesOfVideos = By.cssSelector(
			//"div[class='ColumnsComponents_container__YMzra'] ~ div[class='ColumnsComponents_container__YMzra'] div[class='text-sm flex items-center lowercase post-meta']");
	public By timeValuesOfVideos =	By.xpath("//time[@datetime and @aria-label]/span[@aria-hidden='true']");
	
}