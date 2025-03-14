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

'klik tombol new'
WebUI.click(findTestObject('Profil/Guest/btn_new'))

'pilih title'
WebUI.click(findTestObject('Profil/Guest/slc_title_edit'))

WebUI.click(findTestObject('Profil/Guest/MR'))

WebUI.takeScreenshot()

'Input no identitas'
WebUI.click(findTestObject('Profil/Guest/NRIC'))

WebUI.click(findTestObject('Profil/Guest/KTP'))

WebUI.setText(findTestObject('Profil/Guest/txt_insertID'), '123456789')

'Input expired card'
WebUI.setText(findTestObject('Profil/Guest/txt_cardExpired'), '10/12/2030')

'input email'
WebUI.setText(findTestObject('Profil/Guest/txt_email'), 'guestp@gmail.com')

'pilih gender'
WebUI.click(findTestObject('voba/div_Gender'))

WebUI.click(findTestObject('Object Repository/voba/div_Male'))

'pilih nationality'
WebUI.click(findTestObject('Object Repository/voba/slc_nationality'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/voba/slc_nationality'))

WebUI.setText(findTestObject('Object Repository/voba/txt_nationality'), 'INDONESIA')

WebUI.click(findTestObject('Object Repository/voba/Indonesia 1'))

'input tanggal lahir'
WebUI.setText(findTestObject('Profil/Guest/txt_DOB'), '01/01/1996')

'pilih status'
WebUI.click(findTestObject('Profil/Guest/slc_status'))

WebUI.delay(1)

WebUI.click(findTestObject('Profil/Guest/VVIP'))

WebUI.setText(findTestObject('Object Repository/voba/txt_nationality'), 'INDONESIA')

WebUI.click(findTestObject('Object Repository/voba/Indonesia 1'))

'input nomor hp'
WebUI.setText(findTestObject('Profil/Guest/txt_mobilePhone'), '0899918181')

'input nomor telepon'
WebUI.setText(findTestObject('Profil/Guest/txt_telephone'), '0899918181')

'input alamat'
WebUI.setText(findTestObject('Profil/Guest/txt_addreess'), 'Jalan 3 Cabang')

WebUI.scrollToElement(findTestObject('voba/slc_region'), 0)

WebUI.delay(3)

'pilih region'
WebUI.click(findTestObject('Object Repository/voba/slc_region'))

not_run: WebUI.setText(findTestObject('Object Repository/voba/txt_region'), 'asia')

WebUI.click(findTestObject('Object Repository/voba/ASIA'))

'pilih negara'
WebUI.click(findTestObject('Profil/Guest/slc_country'))

WebUI.delay(1)

WebUI.click(findTestObject('Profil/Guest/slc_country'))

WebUI.setText(findTestObject('Profil/Guest/txt_country'), 'INDONESIA')

WebUI.delay(1)

not_run: WebUI.sendKeys(findTestObject('Profil/Guest/txt_country'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/voba/Indonesia'))

'pilih kota'
WebUI.click(findTestObject('Object Repository/voba/slc_city'))

WebUI.delay(1)

WebUI.click(findTestObject('voba/slc_city'))

WebUI.setText(findTestObject('Object Repository/voba/txt_city'), 'Kota Administrasi Jakarta Barat')

WebUI.click(findTestObject('Object Repository/voba/Kota Administrasi Jakarta Barat'))

WebUI.takeFullPageScreenshot()

'klik tombol save'
WebUI.click(findTestObject('Profil/Guest/btn_saveChange'))

nameFieldIsRequired = WebUI.getText(findTestObject('val/txt_The first name field is required'))

if (nameFieldIsRequired.contains(nameFieldIsRequired)) {
    WebUI.takeScreenshot()

    WebUI.comment(nameFieldIsRequired)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

