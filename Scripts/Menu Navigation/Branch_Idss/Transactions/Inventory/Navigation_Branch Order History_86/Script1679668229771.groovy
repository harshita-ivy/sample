import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Reusable Cases/Login/Branch_Idss'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Cases/Navigation/IvyNavigation'), [('Navigation') : findTestData('Navigation/Branch_Idss').getValue(
            2, 86)], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

txtScreenHeader = WebUI.getText(findTestObject('Login/header'))

KeywordUtil.logInfo(txtScreenHeader)

not_run: GlobalVariable.screenHeader = findTestData('Navigation/Branch_Idss').getValue(1, 86)

not_run: WebUI.verifyMatch(txtScreenHeader, GlobalVariable.screenHeader, false, FailureHandling.STOP_ON_FAILURE)

