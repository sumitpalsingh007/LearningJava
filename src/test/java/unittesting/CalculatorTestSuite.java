package unittesting;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, CalculatorParameterisedTest.class})
public class CalculatorTestSuite {
}