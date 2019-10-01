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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://serenitybddpractice.com/')

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Ecommerse/span_Sign in'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Payment/Page_Ecommerse/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Payment/Page_Login/input_Email_email'), 'phamthuy2001@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Login/div_Password                                                                                            Show'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Payment/Page_Login/input_Password_password'), 'QiSJ97h5SFoc0BxXoWr1aUaTy+6yi+Dq8URI45JGbGk=')

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Login/button_Show'))

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Login/button_Sign in'))

WebUI.setText(findTestObject('Page_Payment/Page_My account/input_Art_s'), 'Customizable Mug')

WebUI.click(findTestObject('Page_Payment/Page_My account/i_'))

WebUI.click(findTestObject('Page_Payment/Page_Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Customizable mug/button_Save Customization'))

WebUI.setText(findTestObject('Object Repository/Page_Payment/Page_Customizable mug/textarea_Type your text here_textField1'), 
    'Thuy')

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Customizable mug/button_Save Customization'))

WebUI.click(findTestObject('Page_Payment/Page_Customizable mug/button_            Add to cart'))

WebUI.click(findTestObject('Page_Payment/Page_Customizable mug/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Cart/a_Proceed to checkout'))

WebUI.click(findTestObject('Page_Payment/Page_Ecommerse/button_Continue'))

WebUI.click(findTestObject('Page_Payment/Page_Ecommerse/button_Continue_1'))

