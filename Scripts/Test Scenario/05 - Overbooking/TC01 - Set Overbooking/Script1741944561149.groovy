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

WebUI.callTestCase(findTestCase('Additional Test Case/Login as Dev'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Menu Rate Management'
WebUI.click(findTestObject('Rate Management/Rate Setup/Rate Management'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Rate Management/Overbooking/Overbooking'))

WebUI.click(findTestObject('Rate Management/Overbooking/edit'))

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_mjs'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_ext'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_dld'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_dlh'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_dlt'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_tat'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_exd'), '1')

WebUI.setText(findTestObject('Rate Management/Overbooking/txt_tah'), '1')

WebUI.click(findTestObject('Rate Management/Overbooking/btn_save'))

success = WebUI.getText(findTestObject('Rate Management/Overbooking/txt_success'))

if (success.contains(success)) {
	
	WebUI.comment('sukses')
    WebUI.takeScreenshot()

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

