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

'klik menu profil'
WebUI.click(findTestObject('Profil/Guest/Profil'))

WebUI.takeScreenshot()

'klik sub menu guest profil'
WebUI.click(findTestObject('Profil/Guest/guestProfil'))

WebUI.takeScreenshot()

//edit guest profile
'klik tombol new'
WebUI.click(findTestObject('Profil/Guest/Edit/txt_search'))

'input short code'
WebUI.setText(findTestObject('Profil/Guest/Edit/txt_keyword'), 'A4')

WebUI.delay(3)

'klik tombol new'
WebUI.click(findTestObject('Profil/Guest/Edit/btn_search'))

WebUI.delay(3)

'klik tombol new'
WebUI.click(findTestObject('Profil/Guest/Edit/edit'))

not_run: WebUI.scrollToElement(findTestObject('Profil/Guest/slc_title_edit'), 0)

'pilih title'
WebUI.click(findTestObject('Profil/Guest/slc_title_edit'))

WebUI.click(findTestObject('Profil/Guest/MRS'))

WebUI.takeScreenshot()

'Input nama depan'
WebUI.setText(findTestObject('Profil/Guest/txt_firstName'), 'Guesti')

'Input nama belakang'
WebUI.setText(findTestObject('Profil/Guest/txt_lastName'), 'Priorita 1')

'Input no identitas'
WebUI.click(findTestObject('Profil/Guest/NRIC'))

WebUI.click(findTestObject('Profil/Guest/Paspor'))

WebUI.setText(findTestObject('Profil/Guest/txt_insertID_edit'), '12991299')

'Input expired card'
WebUI.setText(findTestObject('Profil/Guest/txt_cardExpired'), '10/12/2030')

'input email'
WebUI.setText(findTestObject('Profil/Guest/txt_email'), 'guestp@gmail.com')

'pilih gender'
WebUI.click(findTestObject('Object Repository/voba/div_Gender_edit'))

WebUI.click(findTestObject('voba/Female'))

WebUI.takeFullPageScreenshot()

'klik tombol save'
WebUI.click(findTestObject('voba/btn_saveChange'))

berhasilUpdate = WebUI.getText(findTestObject('Profil/Guest/Edit/txt_success'))

if (berhasilUpdate.contains(berhasilUpdate)) {
    WebUI.takeScreenshot()

    WebUI.comment(berhasilUpdate)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

