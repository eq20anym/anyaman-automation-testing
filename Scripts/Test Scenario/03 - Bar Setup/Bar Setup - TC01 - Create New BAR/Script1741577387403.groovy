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

'Klik Sub Menu BAR Setup'
WebUI.click(findTestObject('Rate Management/Bar Setup/Bar Setup'))

WebUI.takeScreenshot()

'Klik tombol ADD'
WebUI.click(findTestObject('Rate Management/Bar Setup/btn_add'))

WebUI.takeScreenshot()

'Input BAR CODE'
WebUI.setText(findTestObject('Rate Management/Bar Setup/txt_barCode'), 'BAR BAR 2029')

'Input Deskripsi'
WebUI.setText(findTestObject('Rate Management/Bar Setup/txt_description'), 'test deskirpsi')

'Input Minimum Rate'
WebUI.setText(findTestObject('Rate Management/Bar Setup/txt_minimumRate'), '0')

'Input start date'
WebUI.setText(findTestObject('Rate Management/Bar Setup/txt_startDate'), '01/01/2029')

'Input end date'
WebUI.clearText(findTestObject('Rate Management/Bar Setup/txt_endDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Rate Management/Bar Setup/txt_endDate'), '01/12/2029')

WebUI.takeScreenshot()

'Pilih Post Code'
WebUI.click(findTestObject('Rate Management/Bar Setup/slc_postCode'))

WebUI.click(findTestObject('Rate Management/Bar Setup/Room Revenue'))

'Pilih Post Code Extra Bed'
WebUI.click(findTestObject('Rate Management/Bar Setup/slc_postCodeExtraBed'))

WebUI.click(findTestObject('Rate Management/Bar Setup/Upgrade Room'))

WebUI.takeScreenshot()

'Enable toggle'
WebUI.click(findTestObject('Rate Management/Bar Setup/toggle'))

WebUI.takeScreenshot()

'Klik tombol save'
WebUI.click(findTestObject('Rate Management/Bar Setup/btn_save'))

saveSuccessfully = WebUI.getText(findTestObject('Rate Management/Rate Setup/txt_success'))

if (saveSuccessfully.contains(saveSuccessfully)) {
    WebUI.takeScreenshot()

    WebUI.comment(saveSuccessfully)

    WebUI.comment('Berhasil Menyimpan BAR Setup')

    WebUI.delay(3)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

