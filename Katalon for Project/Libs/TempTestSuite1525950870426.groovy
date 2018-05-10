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


suiteProperties.put('id', 'Test Suites/TestSuit-All Tests')

suiteProperties.put('name', 'TestSuit-All Tests')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\592115005\\ASD\\234project-backend\\Katalon for Project\\Reports\\TestSuit-All Tests\\20180510_181425\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuit-All Tests', suiteProperties, [new TestCaseBinding('Test Cases/Test-Add button', 'Test Cases/Test-Add button',  null), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 1', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 40,924 THB' , 'amount' : '2' , 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 2', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 61,386 THB' , 'amount' : '3' , 'user' : 'hello' , 'pass' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 3', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 81,848 THB' , 'amount' : '4' , 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Cart list - Iteration 4', 'Test Cases/Test-Cart list',  [ 'totalPrice' : 'Total price: 102,310 THB' , 'amount' : '5' , 'user' : 'hello' , 'pass' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test-Empty password box', 'Test Cases/Test-Empty password box',  null), new TestCaseBinding('Test Cases/Test-Login admin role', 'Test Cases/Test-Login admin role',  null), new TestCaseBinding('Test Cases/Test-Empty username box', 'Test Cases/Test-Empty username box',  null), new TestCaseBinding('Test Cases/Test-Login incorrect username', 'Test Cases/Test-Login incorrect username',  null), new TestCaseBinding('Test Cases/Test-Login success - Iteration 1', 'Test Cases/Test-Login success',  [ 'user' : 'admin' , 'pass' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test-Login success - Iteration 2', 'Test Cases/Test-Login success',  [ 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Login success - Iteration 3', 'Test Cases/Test-Login success',  [ 'user' : 'hello' , 'pass' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test-Login user role', 'Test Cases/Test-Login user role',  null), new TestCaseBinding('Test Cases/Test-Logout - Iteration 1', 'Test Cases/Test-Logout',  [ 'user' : 'admin' , 'pass' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test-Logout - Iteration 2', 'Test Cases/Test-Logout',  [ 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Logout - Iteration 3', 'Test Cases/Test-Logout',  [ 'user' : 'hello' , 'pass' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test-show available products', 'Test Cases/Test-show available products',  null), new TestCaseBinding('Test Cases/Test-show login page', 'Test Cases/Test-show login page',  null), new TestCaseBinding('Test Cases/Test-Total transaction', 'Test Cases/Test-Total transaction',  null)])
