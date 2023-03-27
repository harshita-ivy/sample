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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Reusable Cases/Login/Branch_Idss'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Cases/Navigation/IvyNavigation'), [('Navigation') : findTestData('Navigation/Branch_Idss').getValue(
            2, 161)], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

txtScreenHeader = WebUI.getText(findTestObject('Login/header'))

KeywordUtil.logInfo(txtScreenHeader)

not_run: GlobalVariable.screenHeader = findTestData('Navigation/Branch_Idss').getValue(1, 161)

not_run: WebUI.verifyMatch(txtScreenHeader, GlobalVariable.screenHeader, false, FailureHandling.STOP_ON_FAILURE)

