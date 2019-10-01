import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://serenitybddpractice.com')

WebUI.click(findTestObject('Registration/Page_Ecommerse/span_Sign in'))

WebUI.setText(findTestObject('Login/Page_Login/input_Email_email'), 'phamthuy2001@yahoo.com')

WebUI.setText(findTestObject('Login/Page_Login/input_Password_password'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.click(findTestObject('Login/Page_Login/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Login/Page_My account/span_account'), 3000)

WebUI.verifyElementText(findTestObject('Login/Page_My account/span_account'), 'Thuy Pham')

not_run: WebUI.closeBrowser()

WebUI.getAlertText()

