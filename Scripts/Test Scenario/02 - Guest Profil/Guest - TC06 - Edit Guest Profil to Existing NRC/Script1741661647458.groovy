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

'Input no identitas'
WebUI.click(findTestObject('Profil/Guest/NRIC'))

WebUI.click(findTestObject('Profil/Guest/Paspor'))

WebUI.setText(findTestObject('Profil/Guest/txt_insertID_edit'), '987654321')

'klik tombol save'
WebUI.click(findTestObject('voba/btn_saveChange'))

cardNumberaAlreadyExists = WebUI.getText(findTestObject('Profil/Guest/Edit/txt_cardNumberAlreadyExist'))

if (cardNumberaAlreadyExists.contains(cardNumberaAlreadyExists)) {
    WebUI.takeScreenshot()

    WebUI.comment(cardNumberaAlreadyExists)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

