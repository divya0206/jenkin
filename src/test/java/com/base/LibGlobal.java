package com.base;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "divyam9";
	public static final String AUTOMATE_ACCESS_KEY = "pe1vpEYgJwpQQanmSZhy";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriverCloud() throws MalformedURLException {
		if (driver == null) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "10");
			caps.setCapability("resolution", "1920x1080");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "latest");
			caps.setCapability("os", "Windows");
			driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			
		}
		return driver;
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\CucumberTask\\driver\\chromedriverr.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		return driver;

	}

	public WebDriver getdriver(String browsername) throws Throwable {

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();
			Thread.sleep(5000);

		} else if (browsername.equals("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			Thread.sleep(5000);
		} else if (browsername.equals("internetexplorer")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\driver\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			Thread.sleep(5000);
		} else {
			System.out.println("not matched");
		}
		return driver;

	}

	public String getData(int rowNo, int collNo) throws Exception {

		String name = null;

		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\ExcelSheet\\adac.xlsx");

		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(rowNo);

		Cell c = r.getCell(collNo);

		int i = c.getCellType();
		if (i == 1) {

			name = c.getStringCellValue();

		} else if (i == 0) {

			if (DateUtil.isCellDateFormatted(c)) {

				Date date = c.getDateCellValue();
				SimpleDateFormat fr = new SimpleDateFormat("dd-MMM-yy");
				name = fr.format(date);

			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				name = String.valueOf(l);

			}

		}

		return name;

	}

	public void print(int rowNo, int collNo, String str) throws Exception {

		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\FacebookFramework\\ExcelSheet\\adac.xlsx");

		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(rowNo);
		Cell c = r.getCell(collNo);
		c.setCellValue(str);

		FileOutputStream f = new FileOutputStream(loc);
		w.write(f);

	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String data) {

		element.sendKeys(data);

	}

	public void btnclick(WebElement element) {

		element.click();

	}

	public static void quit() {

		driver.quit();
	}

	public void close() {

		driver.close();

	}

	public WebElement byId(WebElement element, String name) {

		WebElement refname = driver.findElement(By.id(name));
		return refname;

	}

	public WebElement byname(String str) {

		WebElement refname = driver.findElement(By.name(str));
		return refname;

	}

	public WebElement byClassname(String st) {
		WebElement refname = driver.findElement(By.className(st));
		return refname;

	}

	public WebElement xpath(String str) {
		WebElement refname = driver.findElement(By.xpath(str));
		return refname;

	}

	public void moveTo(WebElement web) {
		Actions acc = new Actions(driver);
		acc.moveToElement(web).perform();

	}

	public void doubleClick(WebElement web) {
		Actions acc = new Actions(driver);

		acc.doubleClick(web).perform();

	}

	public void context(WebElement element) {
		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();

	}

	public static void accept()

	{
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	public WebElement prompt(WebElement w, String str) {

		WebElement refname = driver.findElement(By.id(str));
		Alert a = driver.switchTo().alert();
		a.sendKeys(str);
		a.accept();
		return refname;

	}

	public String getTitle() {

		String name = driver.getTitle();
		return name;

	}

	public String getCurrent() {

		String str = driver.getCurrentUrl();
		return str;

	}

	public void jsUser(WebElement web, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value',' " + data + "')", web);
	}

	public void jsclick(WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", web);

	}

	public void scrollUp(WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].ScrollIntoView(false)", web);

	}

	public void scrollDown(WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].ScrollIntoView(true)", web);

	}

	public void draganddrop(WebElement Sour, WebElement dest) {
		Actions acc = new Actions(driver);
		acc.dragAndDrop(Sour, dest);

	}

	public String gettext(WebElement web) {

		String text = web.getText();
		return text;

	}

	public void print(String s) {

		System.out.println(s);

	}

	public File destfile(String data) {

		File destFile = new File(data);
		return destFile;

	}

	public File srcfile() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcfile = tk.getScreenshotAs(OutputType.FILE);
		return srcfile;

	}

	public void copyFiles(File srcfile, File destFile) throws IOException {

		FileUtils.copyFile(srcfile, destFile);

	}

	public void frameid(int i) {

		driver.switchTo().frame(i);

	}

	public void framename(String fr) {
		driver.switchTo().frame(fr);

	}

	public void name(WebElement web) {

		driver.switchTo().frame(web);

	}

	public void defaultcontent() {

		driver.switchTo().defaultContent();

	}

	public void parentframe() {

		driver.switchTo().parentFrame();

	}

	public void selindex(WebElement element, int i) {

		Select s = new Select(element);
		s.selectByIndex(i);

	}

	public void selectvalue(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByValue(str);

	}

	public void selvisible(WebElement element, String str) {
		Select s = new Select(element);

		s.selectByVisibleText(str);
	}

	public String getallselected(WebElement element) {
		Select s = new Select(element);

		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webele : all) {

			String text = webele.getText();
			return text;

		}

		return null;
	}

	public String getoptions(WebElement element) {
		Select s = new Select(element);

		List<WebElement> ls = s.getOptions();
		for (WebElement webe : ls) {
			String str = webe.getText();
			return str;

		}

		return null;

	}

	public WebElement getFirstSelected(WebElement element) {
		Select s = new Select(element);

		element = s.getFirstSelectedOption();
		return element;

	}

	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);

		boolean b = s.isMultiple();
		return b;

	}

	public void deindex(WebElement element, int n) {
		Select s = new Select(element);
		s.deselectByIndex(n);

	}

	public void devalue(WebElement element, String str) {
		Select s = new Select(element);

		s.deselectByValue(str);

	}

	public void devisible(WebElement element, String str) {
		Select s = new Select(element);
		s.deselectByVisibleText(str);

	}

	public void deselectall(WebElement element, String str) {
		Select s = new Select(element);

		s.deselectAll();

	}

	public String parentwindow() {

		String pId = driver.getWindowHandle();
		return pId;

	}

	public Set<String> allwindow() {

		Set<String> window = driver.getWindowHandles();
		return window;

	}

	public void toChildwindow(String pId, Set<String> window) {

		for (String st : window) {

			driver.switchTo().window(st);

		}

	}

	public void specificwindow(String pId, Set<String> window, int i) {

		List<String> l = new ArrayList<String>();
		l.addAll(window);
		l.get(i);

	}

	public String getAttribute(WebElement element, String value) {

		String s = element.getAttribute(value);
		return s;

	}

	public void waitmethod() throws InterruptedException {

		driver.wait();

	}

	public void clear(WebElement element) {

		element.clear();

	}

	public void sleep(long l) throws InterruptedException {

		Thread.sleep(l);

	}

}
