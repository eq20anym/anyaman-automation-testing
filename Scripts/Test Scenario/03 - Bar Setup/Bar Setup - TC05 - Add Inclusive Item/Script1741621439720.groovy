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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('Additional Test Case/Login as Dev'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Menu Rate Management'
WebUI.click(findTestObject('Rate Management/Rate Setup/Rate Management'))

WebUI.takeScreenshot()

'Klik Sub Menu BAR Setup'
WebUI.click(findTestObject('Rate Management/Bar Setup/Bar Setup'))

WebUI.takeScreenshot()

'Klik text search'
WebUI.click(findTestObject('Rate Management/Bar Setup/Search/txt_search'))

WebUI.takeScreenshot()

'Input Bar Code'
WebUI.setText(findTestObject('Rate Management/Bar Setup/Search/txt_searchBarCode'), 'BAR BAR 2029')

WebUI.takeScreenshot()

'Klik tombol search'
WebUI.click(findTestObject('Rate Management/Bar Setup/Search/btn_search'))

WebUI.takeScreenshot()

'Klik Bar Code'
WebUI.click(findTestObject('Rate Management/Bar Setup/Search/barCode'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Rate Management/Bar Setup/btn_addInclusiveItems'))

WebUI.click(findTestObject('Rate Management/Bar Setup/slc_stock'))

WebUI.click(findTestObject('Rate Management/Bar Setup/Breakfast 50'))

WebUI.click(findTestObject('Rate Management/Bar Setup/btn_saveInclusiveItems'))

saveSuccessfully = WebUI.getText(findTestObject('Rate Management/Bar Setup/Minimum Rate/txt_success'))

if (saveSuccessfully.contains(saveSuccessfully)) {
	WebUI.takeScreenshot()

	WebUI.comment(saveSuccessfully)

	WebUI.comment('Berhasil Menyimpan Minimum BAR Setup')

	WebUI.delay(3)

	WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}