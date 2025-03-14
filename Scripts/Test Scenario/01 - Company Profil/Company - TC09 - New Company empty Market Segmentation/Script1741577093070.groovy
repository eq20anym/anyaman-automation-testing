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

WebUI.takeScreenshot()

'Click Menu Profil'
WebUI.click(findTestObject('Profil/Guest/Profil'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Profil/Company/Company'), 5)

'Klik Sub Menu Company'
WebUI.click(findTestObject('Profil/Company/Company'))

WebUI.takeScreenshot()

'Klik tombol Add'
WebUI.click(findTestObject('Profil/Company/btn_add'))

WebUI.takeScreenshot()

'Input Short Code'
WebUI.setText(findTestObject('Profil/Company/txt_shortCode'), 'PT1112')

'Input Nama Company'
WebUI.setText(findTestObject('Profil/Company/txt_name'), 'NEW COMPANY')

'Input Business Registration'
WebUI.setText(findTestObject('Profil/Company/txt_businessRegistration'), 'A33')

'Input IATA'
WebUI.setText(findTestObject('Profil/Company/txt_IATA'), 'IATA')

'Input Nomor Telepon'
WebUI.setText(findTestObject('Profil/Company/txt_phoneNumber'), '08129291992')

'Input Email'
WebUI.setText(findTestObject('Profil/Company/txt_email'), 'hahha2@gmail.com')

'Input Website'
WebUI.setText(findTestObject('Profil/Company/txt_website'), 'www.haha11.com')

'Input FAX'
WebUI.setText(findTestObject('Profil/Company/txt_fax'), '08129291992')

WebUI.scrollToElement(findTestObject('Profil/Company/slc_staffInCharge'), 5)

'Pilih Drop Down Staff In Charge'
WebUI.click(findTestObject('Profil/Company/slc_staffInCharge'))

WebUI.click(findTestObject('Profil/Company/Developer'))

'Pilih Drop Down Source'
WebUI.click(findTestObject('Profil/Company/slc_source'))

WebUI.click(findTestObject('Profil/Company/Direct Booking'))

'Input Alamat'
WebUI.setText(findTestObject('Profil/Company/ta_address'), 'Jl. ABC Block B No. 9')

'Input Credit Limit'
WebUI.setText(findTestObject('Profil/Company/txt_creditLimit'), '100.000.000')

WebUI.takeFullPageScreenshot()

'Klik tombol save change'
WebUI.click(findTestObject('Profil/Company/btn_saveChange'))

theMarketSegmentationFieldIsRequired = WebUI.getText(findTestObject('Profil/Company/txt_the Market Segmentation field is required'))

if (theMarketSegmentationFieldIsRequired.contains(theMarketSegmentationFieldIsRequired)) {
    WebUI.takeScreenshot()

    WebUI.comment(theMarketSegmentationFieldIsRequired)
	
    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

