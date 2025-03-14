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

WebUI.takeScreenshot()

'Klik Menu Rate Management'
WebUI.click(findTestObject('Rate Management/Rate Setup/Rate Management'))

WebUI.takeScreenshot()

'Klik Sub Menu Allotment'
WebUI.click(findTestObject('Rate Management/Allotment/div_Allotment'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Rate Management/Allotment/New/button_Add'))

'Enable Toggle'

WebElement enable_toggle = WebUiCommonHelper.findWebElement(findTestObject('Rate Management/Allotment/New/toggle_enable'),	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(enable_toggle))

//WebUI.click(findTestObject('Rate Management/Allotment/New/toggle_enable'))

'Input Start Date'
WebUI.setText(findTestObject('Rate Management/Allotment/New/input__name-company'), 'Guesta')

WebUI.delay(5)

WebUI.click(findTestObject('Rate Management/Allotment/New/choose Profil'))

'Input Start Date'
WebUI.setText(findTestObject('Rate Management/Allotment/New/textarea_Description_description'), 'Test')

WebUI.takeScreenshot()

'Input Start Date'
WebUI.setText(findTestObject('Rate Management/Allotment/txt_startDate'), '03/04/2025')

'Input End Date'
WebUI.setText(findTestObject('Rate Management/Allotment/txt_endDate'), '03/04/2029')

WebUI.setText(findTestObject('Rate Management/Allotment/New/txt_releaseAllotmentBefore'), '2')

'Klik tombol save change'
WebUI.click(findTestObject('Rate Management/Allotment/New/btn_saveChange'))

success = WebUI.getText(findTestObject('Rate Management/Allotment/txt_success'))

if (success.contains(success)) {
    WebUI.takeScreenshot()

    WebUI.comment(success)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

