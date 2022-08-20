package org.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	Select select;
	Actions act;
	Alert alert;
	JavascriptExecutor jse;
	TakesScreenshot tS;
	Robot rob;
	WebElement web;
	String a="KeyEvent.VK_";
	
	
	
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public WebElement idValue(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement nameValue(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
		}
	public WebElement xPath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public void send(WebElement findElement, String value) {
		findElement.sendKeys(value);
	}
	public void click(WebElement findElement) {
		findElement.click();
	}
	public void clear(WebElement findElement) {
		findElement.clear();
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
		}
	public String getText() {
		String text = web.getText();
		return text;
	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	public String getWindowHandle () {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
		}
	public Set<String> getWindowHandles () {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public String takeScreenshot (String n) throws IOException {
		File source = tS.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\java\\"+ n);
		FileUtils.copyFile(source, target);
		return n;
	}
	public String takeSmallScreenShot(String xPath, String location) throws IOException {
		WebElement source =  (WebElement) driver.findElement(By.xpath(xPath)).getScreenshotAs(OutputType.FILE);
		File target =new File("D:\\java\\"+location);
		FileUtils.copyFile(  (File) source, target);
		return location;
	}
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public void mouseOver(String xPath) {
		WebElement cursor = driver.findElement(By.xpath(xPath));
		act.moveToElement(cursor).perform();
	}
	public void dragAndDrop(String srcid, String tarid) {
		WebElement source = driver.findElement(By.id(srcid));
		WebElement target = driver.findElement(By.id(tarid));
		act.dragAndDrop(source, target).perform();
	}
	public void doubleClick(String id) {
		WebElement iD = driver.findElement(By.id(id));
		act.doubleClick(iD).perform();
	}
	public void rightClick(String id) {
		WebElement iD = driver.findElement(By.id(id));
		act.contextClick(iD).perform();
	}
	public void keyS(String key) {
		if (key=="a") {
			rob.keyPress(KeyEvent.VK_A);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="b") {
			rob.keyPress(KeyEvent.VK_B);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="C") {
			rob.keyPress(KeyEvent.VK_C);
			rob.keyRelease(KeyEvent.VK_C);
		}if (key=="D") {
			rob.keyPress(KeyEvent.VK_D);
			rob.keyRelease(KeyEvent.VK_D);	
		}if (key=="E") {
			rob.keyPress(KeyEvent.VK_E);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F") {
			rob.keyPress(KeyEvent.VK_F);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="G") {
			rob.keyPress(KeyEvent.VK_G);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="H") {
			rob.keyPress(KeyEvent.VK_H);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="I") {
			rob.keyPress(KeyEvent.VK_I);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="J") {
			rob.keyPress(KeyEvent.VK_J);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="K") {
			rob.keyPress(KeyEvent.VK_K);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="L") {
			rob.keyPress(KeyEvent.VK_L);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="M") {
			rob.keyPress(KeyEvent.VK_M);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="N") {
			rob.keyPress(KeyEvent.VK_N);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="O") {
			rob.keyPress(KeyEvent.VK_O);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="P") {
			rob.keyPress(KeyEvent.VK_P);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Q") {
			rob.keyPress(KeyEvent.VK_Q);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="R") {
			rob.keyPress(KeyEvent.VK_R);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="S") {
			rob.keyPress(KeyEvent.VK_S);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="T") {
			rob.keyPress(KeyEvent.VK_T);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="U") {
			rob.keyPress(KeyEvent.VK_U);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="V") {
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="W") {
			rob.keyPress(KeyEvent.VK_W);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="X") {
			rob.keyPress(KeyEvent.VK_X);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Y") {
			rob.keyPress(KeyEvent.VK_Y);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Z") {
			rob.keyPress(KeyEvent.VK_Z);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Caps") {
			rob.keyPress(KeyEvent.VK_CAPS_LOCK);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Tab") {
			rob.keyPress(KeyEvent.VK_TAB);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Shift") {
			rob.keyPress(KeyEvent.VK_SHIFT);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Control") {
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Alt") {
			rob.keyPress(KeyEvent.VK_ALT);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Esc") {
			rob.keyPress(KeyEvent.VK_ESCAPE);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="1") {
			rob.keyPress(KeyEvent.VK_1);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="2") {
			rob.keyPress(KeyEvent.VK_2);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="3") {
			rob.keyPress(KeyEvent.VK_3);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="4") {
			rob.keyPress(KeyEvent.VK_4);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="5") {
			rob.keyPress(KeyEvent.VK_5);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="6") {
			rob.keyPress(KeyEvent.VK_6);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="7") {
			rob.keyPress(KeyEvent.VK_7);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="8") {
			rob.keyPress(KeyEvent.VK_8);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="9") {
			rob.keyPress(KeyEvent.VK_9);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="0") {
			rob.keyPress(KeyEvent.VK_0);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F1") {
			rob.keyPress(KeyEvent.VK_F1);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F2") {
			rob.keyPress(KeyEvent.VK_F2);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F3") {
			rob.keyPress(KeyEvent.VK_F3);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F4") {
			rob.keyPress(KeyEvent.VK_F4);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F5") {
			rob.keyPress(KeyEvent.VK_F5);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F6") {
			rob.keyPress(KeyEvent.VK_F6);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F7") {
			rob.keyPress(KeyEvent.VK_F7);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F8") {
			rob.keyPress(KeyEvent.VK_F8);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F9") {
			rob.keyPress(KeyEvent.VK_F9);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="bF10") {
			rob.keyPress(KeyEvent.VK_F10);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="F11") {
			rob.keyPress(KeyEvent.VK_F11);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="F12") {
			rob.keyPress(KeyEvent.VK_F12);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Insert") {
			rob.keyPress(KeyEvent.VK_INSERT);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Home") {
			rob.keyPress(KeyEvent.VK_HOME);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="PrintScreen") {
			rob.keyPress(KeyEvent.VK_PRINTSCREEN);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Delete") {
			rob.keyPress(KeyEvent.VK_DELETE);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="BackSpace") {
			rob.keyPress(KeyEvent.VK_BACK_SPACE);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="At") {
			rob.keyPress(KeyEvent.VK_AT);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Comma") {
			rob.keyPress(KeyEvent.VK_COMMA);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Down") {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Up") {
			rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Right") {
			rob.keyPress(KeyEvent.VK_RIGHT);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Left") {
			rob.keyPress(KeyEvent.VK_LEFT);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Windows") {
			rob.keyPress(KeyEvent.VK_WINDOWS);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="CloseBracket") {
			rob.keyPress(KeyEvent.VK_CLOSE_BRACKET);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="OpenBracket") {
			rob.keyPress(KeyEvent.VK_OPEN_BRACKET);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="Dollar") {
			rob.keyPress(KeyEvent.VK_DOLLAR);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="LeftPara") {
			rob.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
			rob.keyRelease(KeyEvent.VK_B);	
		}if (key=="RightPara") {
			rob.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
			rob.keyRelease(KeyEvent.VK_A);
		}if (key=="Plus") {
			rob.keyPress(KeyEvent.VK_PLUS);
			rob.keyRelease(KeyEvent.VK_B);	
		}
	}
	public void scrolltoElement(String xPath) {
		WebElement element = driver.findElement(By.xpath(xPath));
		jse.executeScript("argument[0]scrollIntoView()", element);
		}
	public void sendValue(String xPath, String value) {
		WebElement element = driver.findElement(By.xpath(xPath));
		jse.executeScript("argument[0].setAttribute('value',"+"'"+value+"')", element);
	}
	public void highLight(String xPath, String bG, String border) {
		WebElement element = driver.findElement(By.xpath(xPath));
		jse.executeScript("arguments[0].setAttribute('style','background: "+bG+";border:"+border+"')", element);
	}
	public void simpleAlertAccept() {
		Alert simple = driver.switchTo().alert();
		simple.accept();
	}
	public void simpleAlertDismiss() {
		Alert simple1 = driver.switchTo().alert();
		simple1.dismiss();
	}
	public void promptAlertAccept(String answer) {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(answer);
		prompt.accept();
	}
	public void promptAlertDissmiss(String answer) {
		Alert promptd = driver.switchTo().alert();
		promptd.sendKeys(answer);
		promptd.dismiss();
	}
	
	public void close(){
		driver.close();
	}

}
