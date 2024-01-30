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

WebUI.selectOptionByLabel(findTestObject('Amazon_Category validation_OR/Amazon_Category_Validation_Excel_OR/Page_Amazon.com. Spend less. Smile more/CategoryElement'), 
    'Books', false)

WebUI.setText(findTestObject('Amazon_Category validation_OR/Amazon_Category_Validation_Excel_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'Da vinci code')

WebUI.click(findTestObject('Amazon_Category validation_OR/Amazon_Category_Validation_Excel_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

//WebUI.click(findTestObject('Object Repository/OR_Amazon/Page_Amazon.com  da vinci code/li_Dan Brown'))
unchecked = WebUI.verifyElementNotChecked(findTestObject('OR_Amazon/Page_Amazon.com  da vinci code/i_a-icon a-icon-checkbox'), 
    30)

if (unchecked == true) {
    System.out.println('element not checkeck')

    WebUI.check(findTestObject('Object Repository/OR_Amazon/OR_Checkbox Validation/Page_Amazon.com  da vinci code/i_Language_a-icon a-icon-checkbox'))

    System.out.println('element checkeck')
}

//WebUI.check(findTestObject('OR_Amazon/Page_Amazon.com  da vinci code/i_a-icon a-icon-checkbox'))
//System.out.println('element checkeck')
//WebUI.delay(10)
//WebUI.verifyElementChecked(findTestObject('OR_Amazon/Page_Amazon.com  da vinci code/li_Dan Brown'), 30)

WebUI.closeBrowser()

