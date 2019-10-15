import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject


import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Payment {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//	def response
	//	@Given("I am a user")
	//	def I_am_a_user() {
	//		println "Given clause"
	//	}
	//	@Given("I am on login page")
	//	def I_am_on_login_page() {
	//		println "Given clause"
	//		WebUI.openBrowser("http://serenitybddpractice.com")
	//		WebUI.click(findTestObject('Registration/Page_Ecommerse/span_Sign in'))
	//	}
	//
	//	@When("I enter {string}, {string}")
	//	def I_enter_email_password(String email, String password) {
	//		println email
	//		println password
	//		WebUI.setText(findTestObject('Login/Page_Login/input_Email_email'), email)
	//
	//		WebUI.setText(findTestObject('Login/Page_Login/input_Password_password'), password)
	//	}
	//
	//	@When("Hit login button")
	//	def Hit_login_button(){
	//		WebUI.click(findTestObject('Login/Page_Login/button_Sign in'))
	//	}
	//
	//
	//	@Then("I am able to see {string}")
	//	def I_am_able_to_see(String status) {
	//		println status
	//		WebUI.verifyElementPresent(findTestObject('Login/Page_My account/span_account'), 3000)
	//
	//		WebUI.verifyElementText(findTestObject('Login/Page_My account/span_account'), status)
	//	}

	@When("I search for {string}")
	def I_search_for(String searchProduct){
		println searchProduct
		WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_My account/input_Art_s'), 3000)
		WebUI.setText(findTestObject('Page_Payment/Page_My account/input_Art_s'), searchProduct)

		WebUI.click(findTestObject('Page_Payment/Page_My account/i_'))
	}



	@Then("I select to buy item")
	def I_select_to_buy_item(){

		//		WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_My account/i_'), 3000)
		//		WebUI.mouseOver(findTestObject('Page_Payment/Page_Search/img'));
		WebUI.click(findTestObject('Page_Payment/Page_Search/img'))

		//		WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_Search/img'), 3000)
		//		WebUI.click(findTestObject('Page_Payment/Page_Customizable mug/button_    Add to cart'))
		WebUI.click(findTestObject('Object Repository/Page_Mug The best is yet to come/button_Add to cart'))
		println "debug"
	}

	@Then("I move to checkout from cart")
	def I_move_to_checkout_from_cart(){
		println "Checkout from cart"
		//		WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_Customizable mug/button_            Add to cart'), 3000)
		WebUI.click(findTestObject('Page_Payment/Page_Customizable mug/a_Proceed to checkout'))

		//		WebUI.verifyElementPresent(findTestObject('Page_Payment/a_Proceed to checkout'), 3000)
		WebUI.click(findTestObject('Object Repository/Page_Payment/Page_Cart/a_Proceed to checkout'))
		//
		//		WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_Cart/a_Proceed to checkout'), 3000)
		WebUI.click(findTestObject('Page_Payment/Page_Ecommerse/button_Continue'))
		//
		WebUI.click(findTestObject('Page_Payment/Page_Ecommerse/button_Continue_1'))

	}
	

	@When("I add a product into shopping cart")
	def I_add_a_product_into_shopping_cart(List<Map<String, String>> product){
		Map<String, String> productPrice = new HashMap<>();
		for(int i=0; i<product.size(); i++) {
			String productName = product.get(i).get("name")
			WebUI.verifyElementPresent(findTestObject('Page_Payment/Page_My account/input_Art_s'), 3000)
			WebUI.setText(findTestObject('Page_Payment/Page_My account/input_Art_s'), productName)
			WebUI.click(findTestObject('Page_Payment/Page_My account/i_'))
			
//			String xpath = '//div[@id="' + dynamicId + '"]'
			String xpath = '//a[contains(text(),\''+productName+'\')]';
			TestObject to = new TestObject("objectName");
			to.addProperty("xpath", ConditionType.EQUALS, xpath)
			String titleProduct = WebUI.getText(to);
			println titleProduct;
			WebUI.closeBrowser();
//			WebUI.click(to)
			

			//			String productPosition = "productPosition" + (i+1).toString();
			//			productPrice.put(productPosition, price);
			//			productPrice.get("product1");
			//					System.out.println(product.get(i).get("price"));


		}


		//WebUI.click(findTestObject('Page_Payment/Page_My account/i_'))
	}
}