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


suiteProperties.put('id', 'Test Suites/TestSuit-Logout')

suiteProperties.put('name', 'TestSuit-Logout')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\592115005\\ASD\\234project-backend\\Katalon for Project\\Reports\\TestSuit-Logout\\20180510_150045\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuit-Logout', suiteProperties, [new TestCaseBinding('Test Cases/Test-Logout - Iteration 1', 'Test Cases/Test-Logout',  [ 'user' : 'admin' , 'pass' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test-Logout - Iteration 2', 'Test Cases/Test-Logout',  [ 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Logout - Iteration 3', 'Test Cases/Test-Logout',  [ 'user' : 'hello' , 'pass' : 'hello' ,  ])])
