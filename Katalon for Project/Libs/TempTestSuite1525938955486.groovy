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


suiteProperties.put('id', 'Test Suites/TestSuit-Login')

suiteProperties.put('name', 'TestSuit-Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\592115005\\ASD\\234project-backend\\Katalon for Project\\Reports\\TestSuit-Login\\20180510_145550\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuit-Login', suiteProperties, [new TestCaseBinding('Test Cases/Test-Login success - Iteration 1', 'Test Cases/Test-Login success',  [ 'user' : 'admin' , 'pass' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test-Login success - Iteration 2', 'Test Cases/Test-Login success',  [ 'user' : 'user' , 'pass' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test-Login success - Iteration 3', 'Test Cases/Test-Login success',  [ 'user' : 'hello' , 'pass' : 'hello' ,  ])])
