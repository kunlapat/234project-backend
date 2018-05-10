import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TestSuit-Cart list with changing amount')

suiteProperties.put('name', 'TestSuit-Cart list with changing amount')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\592115005\\ASD\\234project-backend\\Katalon for Project\\Reports\\TestSuit-Cart list with changing amount\\20180510_142117\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuit-Cart list with changing amount', suiteProperties, [new TestCaseBinding('Test Cases/Test-Cart list - Iteration 1', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 40,924 THB' , 'amount' : '2' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 2', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 61,386 THB' , 'amount' : '3' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 3', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 81,848 THB' , 'amount' : '4' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 4', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 102,310 THB' , 'amount' : '5' ,  ])])
