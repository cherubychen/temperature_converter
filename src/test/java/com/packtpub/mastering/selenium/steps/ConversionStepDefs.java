package com.packtpub.mastering.selenium.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.packtpub.mastering.selenium.page.Google;
import com.packtpub.mastering.selenium.page.TemperatureConverterPage;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.assertEquals;

public class ConversionStepDefs {
	
	private WebDriver driver;
	public Google googlePage;
	public TemperatureConverterPage temperatureConverterPage;
	
	@Before 
	public void setup() throws Exception {
		/*
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "localhost");
		profile.setPreference("network.proxy.socks_port", 8888);
		driver = new FirefoxDriver(profile);
		*/
		URL url = new URL("http://cherubychen:94f73e0e-bbce-4706-81b8-a9a51db043e6@ondemand.saucelabs.com:80/wd/hub"); 
		Capabilities capabilities = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(url, capabilities);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After 
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Given("^I want to convert (\\d+).(\\d+) degree Fahrenheit to Celsius$")
	public void I_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
		googlePage = new Google(driver);
		temperatureConverterPage = googlePage.goToTemperatureConversionPage();
	}

	@When("^I input the value of Fahrenheit as (\\d+).(\\d+) in text$")
	public void I_input_the_value_of_Fahrenheit_as_in_text(int arg1, int arg2) throws Throwable {
		temperatureConverterPage.inputFahrenheit(98.6);
	}

	@Then("^It should be converted to Celsius as (\\d+) degree$")
	public void It_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
		System.out.println("arg1: " + arg1);
		System.out.println("actualResult: " + temperatureConverterPage.actualResult());
		assertEquals(temperatureConverterPage.actualResult(), Integer.toString(arg1));
	}


}
