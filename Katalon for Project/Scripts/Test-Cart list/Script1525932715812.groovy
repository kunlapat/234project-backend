import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.215.216.185:7071')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_username'), user)

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_password'), pass)

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_Login'))

WebUI.waitForElementNotPresent(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 1'), 0)

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 1'))

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 2'))

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 3'))

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 4'))

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_add to cart 5'))

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/menu_cart'))

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productName 1'), 'Garden')

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productPrice 1'), '20,000 THB')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_amount 1'), amount)

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productName 2'), 'Banana')

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productPrice 2'), '150 THB')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_amount 2'), amount)

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productName 3'), 'Orange')

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productPrice 3'), '280 THB')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_amount 3'), amount)

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productName 4'), 'Papaya')

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productPrice 4'), '12 THB')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_amount 4'), amount)

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productName 5'), 'Rambutan')

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/td_productPrice 5'), '20 THB')

WebUI.setText(findTestObject('Objects-Cart list/Page_ProjectBackend/input_amount 5'), amount)

WebUI.verifyElementText(findTestObject('Objects-Cart list/Page_ProjectBackend/p_Total price'), totalPrice)

WebUI.click(findTestObject('Objects-Cart list/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert()

WebUI.closeBrowser()

