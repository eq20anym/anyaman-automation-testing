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

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Rate Management/Yield Management/Yield Management'), 2)

'Klik Sub Menu Yield Management'
WebUI.click(findTestObject('Rate Management/Yield Management/Yield Management'))

WebUI.takeScreenshot()

'Klik tombol Add'
WebUI.click(findTestObject('Rate Management/Yield Management/btn_add'))

WebUI.takeScreenshot()

'Enable toggle: Status'
WebUI.click(findTestObject('Rate Management/Yield Management/toggle_status'))

WebUI.scrollToElement(findTestObject('Rate Management/Yield Management/btn_add'), 0)

'Enable toggle: Is General'
WebUI.enhancedClick(findTestObject('Rate Management/Yield Management/toggle_isGeneral'))

WebUI.scrollToElement(findTestObject('Rate Management/Yield Management/btn_add'), 0)

'Pilih Room Type'
WebUI.click(findTestObject('Rate Management/Yield Management/slc_roomType'))

WebUI.click(findTestObject('Rate Management/Yield Management/MJS'))

'Input start date'
WebUI.setText(findTestObject('Rate Management/Yield Management/txt_startDate'), '19/03/2025')

'Input end date'
WebUI.setText(findTestObject('Rate Management/Yield Management/txt_endDate'), '19/03/2026')

'Input minimum rate'
WebUI.setText(findTestObject('Rate Management/Yield Management/txt_minRate'), '1')

'Input Occupancy From'
WebUI.setText(findTestObject('Rate Management/Yield Management/txt_occupancyFrom'), '1')

'Input Occupancy To'
WebUI.setText(findTestObject('Rate Management/Yield Management/txt_occupancyTo'), '1')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Rate Management/Yield Management/btn_save'))

saveSuccessfully = WebUI.getText(findTestObject('Rate Management/Yield Management/txt_success'))

if (saveSuccessfully.contains(saveSuccessfully)) {
    WebUI.takeScreenshot()

    WebUI.comment(saveSuccessfully)

    WebUI.comment('Berhasil Menyimpan')

    WebUI.delay(3)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

