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

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Rate Management/Yield Management/Yield Management'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Rate Management/Yield Management/Yield Management'))

WebUI.takeScreenshot()

'Klik Search'
WebUI.click(findTestObject('Rate Management/Yield Management/Edit/txt_search'))

'Input Keyword'
WebUI.setText(findTestObject('Rate Management/Yield Management/Edit/txt_keyword'), '')

'Klik tombol search'
WebUI.click(findTestObject('Rate Management/Yield Management/Edit/btn_search'))

WebUI.takeScreenshot()

'Klik tombol edit'
WebUI.click(findTestObject('Rate Management/Yield Management/Edit/edit'))

WebUI.takeFullPageScreenshot()


'Klik tombol save'
WebUI.click(findTestObject('Rate Management/Yield Management/Edit/btn_save'))

saveSuccessfully = WebUI.getText(findTestObject('Rate Management/Yield Management/txt_success'))


if (saveSuccessfully.contains(saveSuccessfully)) {
	WebUI.takeScreenshot()

	WebUI.comment(saveSuccessfully)

	WebUI.comment('Berhasil Menyimpan')

	WebUI.delay(3)

	WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}


