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
import com.github.javafaker.Faker as Faker

'Importjavafaker location ID'
Faker faker = new Faker(new Locale('in-ID'))

'Import javafaker firts name'
String fName = faker.name().firstName()

'Import javafaker last name'
String lName = faker.name().lastName()

'Import javafaker email'
String email = faker.internet.emailAddress()

'Open the browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Navigate to url H&M'
WebUI.navigateToUrl(GlobalVariable.baseUrl)

'Click button menu (Masuk Akun)'
WebUI.click(findTestObject('menu_pages/btnMenu_masuk_akun'))

'Input email'
WebUI.setText(findTestObject('login_repos/input_loginUsername'), GlobalVariable.emailValid)

'Input password'
WebUI.setText(findTestObject('login_repos/input_loginPassword'), GlobalVariable.blank_password)

'Click button login'
WebUI.click(findTestObject('login_repos/button_login'))

'Verify the error message "Kolom ini wajib diisi"'
WebUI.verifyTextPresent('Kolom ini wajib diisi', false)

'Close the browser'
WebUI.closeBrowser()

