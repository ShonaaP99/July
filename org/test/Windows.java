package org.test;

import java.util.Set;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Shonaa-Eclipsce\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
WebElement searchBox=driver.findElement(By.xpath("//input[@id=''inputValEnter]"));
searchBox.sendKeys("mac lipstick");
WebElement searchIcon=driver.findElement(By.xpath("//span[text()='search]"));
searchIcon.click();
WebElement macLipstick=driver.findElement(By.xpath("//img[text()='Mac Matte (Set Of 5) Combo Lipstick Multicolor 3 gm']"));
		macLipstick.click();
		String par=driver.getWindowHandle();
	Set<String>All=driver.getWindowHandles();
	System.out.println(par="\n"+All);
	for(String x:All) {
		if(!x.equals(par)) {
	driver.switchTo().window(x);
		}
			WebElement add=driver.findElement(By.xpath("//span[text()='add to cart']"));
				add.click();
		}
	}
}

