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

//search
'Click Search'
WebUI.click(findTestObject('Profil/Company/Search/txt_search'))

'Input existing Company'
WebUI.setText(findTestObject('Profil/Company/Search/txt_searchCompany'), 'pupuk iskandar')

'Click search button'
WebUI.click(findTestObject('Profil/Company/Search/btn_search'))

WebUI.takeScreenshot()

'Click edit icon'
WebUI.click(findTestObject('Profil/Company/Search/btn_edit'))

WebUI.takeScreenshot()

'Click Tab Contract Rate'
WebUI.click(findTestObject('Profil/Company/Contract Rate/tab_contractRate'))

WebUI.takeScreenshot()

'Click Add Contract rate button'
WebUI.click(findTestObject('Profil/Company/Contract Rate/btn_addContractRate'))

WebUI.takeScreenshot()

'Select Rate Code'
WebUI.click(findTestObject('Profil/Company/Contract Rate/slc_rateCode'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Profil/Company/Contract Rate/COR 1'))

WebUI.takeScreenshot()

'Click save button'
WebUI.click(findTestObject('Profil/Company/Contract Rate/btn_save'))

rateCreatedSuccessfully = WebUI.getText(findTestObject('Profil/Company/Contract Rate/txt_Rate created successfully'))

if (rateCreatedSuccessfully.contains(rateCreatedSuccessfully)) {
    WebUI.takeScreenshot()

    WebUI.comment(rateCreatedSuccessfully)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

