import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

nav = findTestData('Navigation/Dist Admin_HQ Login').getValue(2, 1)

KeywordUtil.logInfo(nav)

GlobalVariable.screenHeader = findTestData('Navigation/Dist Admin_HQ Login').getValue(1, 1)

KeywordUtil.logInfo(GlobalVariable.screenHeader)