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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

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

'klik tombol edit'
WebUI.click(findTestObject('Profil/Guest/Edit/edit'))

WebUI.click(findTestObject('Profil/Guest/Document/Document'))

WebUI.click(findTestObject('Profil/Guest/Document/btn_addDocument'))

WebUI.setText(findTestObject('Profil/Guest/Document/txt_desc'), 'Test Description ')

'Get full directory'
def fileUpload = PathUtil.relativeToAbsolutePath(GlobalVariable.uploadFile, RunConfiguration.getProjectDir())

CustomKeywords.'any.RobotKeyword.uploadFileUsingRobot'(findTestObject('Profil/Company/uploadFile'), fileUpload)

WebUI.click(findTestObject('Profil/Guest/Document/btn_Save'))

documentCreatedSuccessfully = WebUI.getText(findTestObject('Profil/Company/txt_Document created successfully'))

if (documentCreatedSuccessfully.contains(documentCreatedSuccessfully)) {
    WebUI.takeScreenshot()

    WebUI.comment(documentCreatedSuccessfully)

    WebUI.delay(5)

    WebUI.callTestCase(findTestCase('Additional Test Case/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
}

