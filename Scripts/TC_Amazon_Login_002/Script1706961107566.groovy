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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/ap/signin?openid.pape.max_auth_age=3600&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=en_IN&pageId=amzn_psr_desktop_in&ignoreAuthState=1&fromAuthPrompt=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&prevRID=J4K53SMDXCGWSKWEEQMN&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&failedSignInCount=0&ref_=ap_sw_aa&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&disableLoginPrepopulate=1&switch_account=signin&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Amazon Sign In/input_email'), 'srinathnetha723@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/Page_Amazon Sign In/input_password'), 'NLlgqqYIS2ixVubOByWTxQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.closeBrowser()

