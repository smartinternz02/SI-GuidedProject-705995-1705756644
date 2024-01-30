package myPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyClass {
	@Keyword
	def addToCart() {
		WebUI.navigateToUrl('https://www.amazon.com/AmazonBasics-Speed-Air-Circulator-7-Inch/dp/B082MY2MX3/ref=sr_1_1_ffob_sspa?crid=36RLKD1IAET7Z&keywords=fan&qid=1706507362&s=electronics&sprefix=fan%2Celectronics-intl-ship%2C772&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1')

		WebUI.click(findTestObject('OR_AddToCart/Page_Amazon.com Amazon Basics 3 Speed Small Room Air Circulator Fan, 7-Inch Blade, Black, 6.3D x 11.1W x 10.9H  Home  Kitchen/span_Add to Cart'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_AddToCart/Page_Amazon.com Shopping Cart/div_Added to Cart'),
				'Added to Cart')
	}
}

