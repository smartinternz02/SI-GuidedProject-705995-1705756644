import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByLabel(findTestObject('Object Repository/OR_AddToCart/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'Electronics', true)

//WebUI.setText(findTestObject('OR_AddToCart/Page_Amazon.com  fan/img_Best Seller_s-image'), 'fan')
WebUI.setText(findTestObject('Amazon_Category validation_OR/Amazon_Category_Validation_Excel_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'fan')

WebUI.click(findTestObject('Object Repository/OR_AddToCart/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

CustomKeywords.'myPackage.MyClass.addToCart'()

/*
WebUI.navigateToUrl('https://www.amazon.com/AmazonBasics-Speed-Air-Circulator-7-Inch/dp/B082MY2MX3/ref=sr_1_1_ffob_sspa?crid=36RLKD1IAET7Z&keywords=fan&qid=1706507362&s=electronics&sprefix=fan%2Celectronics-intl-ship%2C772&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1')

WebUI.click(findTestObject('OR_AddToCart/Page_Amazon.com Amazon Basics 3 Speed Small Room Air Circulator Fan, 7-Inch Blade, Black, 6.3D x 11.1W x 10.9H  Home  Kitchen/span_Add to Cart'))
WebUI.verifyElementText(findTestObject('Object Repository/OR_AddToCart/Page_Amazon.com Shopping Cart/div_Added to Cart'), 
    'Added to Cart')
    */
WebUI.closeBrowser()

