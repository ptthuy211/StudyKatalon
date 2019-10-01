import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	def response
	@Given("I am a user")
	def I_am_a_user() {
		println "Given clause"
	}
	@Given("I am on login page")
	def I_am_on_login_page() {
		println "Given clause"
		WebUI.openBrowser("http://serenitybddpractice.com")
		WebUI.click(findTestObject('Registration/Page_Ecommerse/span_Sign in'))
	}

	@When("I enter {string}, {string}")
	def I_enter_email_password(String email, String password) {
		println email
		println password
		WebUI.setText(findTestObject('Login/Page_Login/input_Email_email'), email)

		WebUI.setText(findTestObject('Login/Page_Login/input_Password_password'), password)
	}

	@When("Hit login button")
	def Hit_login_button(){
		WebUI.click(findTestObject('Login/Page_Login/button_Sign in'))
	}


	@Then("I am able to see {string}")
	def I_am_able_to_see(String status) {
		println status
		WebUI.verifyElementPresent(findTestObject('Login/Page_My account/span_account'), 3000)

		WebUI.verifyElementText(findTestObject('Login/Page_My account/span_account'), status)
	}
}