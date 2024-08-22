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


/*
 * mở trình duyệt chrome và vào trang web "10.6.130.132:6168" đăng nhập vào
 * username là "baolanh1" và password là "12121212" mở app android efast có
 * appPakage "vietinbank.com.khdn" appActivity là
 * "vietinbank.com.khdn.view.MainActivity" thực hiện đăng nhập username là
 * "baolanh1" và password là "12121212" trên app android Open Chrome browser and
 * navigate to the website "10.6.130.132:6168"
 */

WebUI.openBrowser('')
WebUI.navigateToUrl('http://10.6.130.132:6168')

// Input username as "baolanh1" and password as "12121212"
WebUI.setText(findTestObject('input_username'), 'baolanh1')
WebUI.setText(findTestObject('input_password'), '12121212')

// Open the Android app with appPackage "vietinbank.com.khdn" and appActivity "vietinbank.com.khdn.view.MainActivity"
Mobile.startApplication('vietinbank.com.khdn', false)

// Input username as "baolanh1" and password as "12121212" in the Android app
Mobile.setText(findTestObject('input_username_android'), 'baolanh1')
Mobile.setText(findTestObject('input_password_android'), '12121212')