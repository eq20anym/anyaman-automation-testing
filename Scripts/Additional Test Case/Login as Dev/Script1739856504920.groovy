import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

'Go to url: hmsqa.anyaman.co.id'
WebUI.navigateToUrl(GlobalVariable.url_anyaman)

WebUI.maximizeWindow()

'Input username'
WebUI.setText(findTestObject('Login Page/txt_username'), GlobalVariable.username)

'Input password'
WebUI.setText(findTestObject('Login Page/txt_password'), GlobalVariable.password)

WebUI.takeScreenshot()

'Click login button'
WebUI.click(findTestObject('Login Page/btn_login'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Reservation FIT/kuretakeso'), 5)

'Choose Property'
WebUI.click(findTestObject('Reservation FIT/kuretakeso'))

