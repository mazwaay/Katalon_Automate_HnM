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

'Open the browser'
WebUI.openBrowser('')

'Maximize the window'
WebUI.maximizeWindow()

'Navigate to url H&M'
WebUI.navigateToUrl(GlobalVariable.baseUrl)

'Click button menu (Masuk Akun)'
WebUI.click(findTestObject('menu_pages/btnMenu_masuk_akun'))

'Input correct email'
WebUI.setText(findTestObject('login_repos/input_loginUsername'), GlobalVariable.correct_email)

'Input correct password'
WebUI.setText(findTestObject('login_repos/input_loginPassword'), GlobalVariable.correct_password)

'Click button login'
WebUI.click(findTestObject('login_repos/button_login'))

'Verify the message when successfully logged in "Data Pribadi"'
WebUI.verifyTextPresent('Data Pribadi', false)

'Close the browser'
WebUI.closeBrowser()

