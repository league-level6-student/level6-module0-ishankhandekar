package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyWage = 0;
    	int numberOfHours = 0;
    	double expected = 0;
        //when
    	double actual = payroll.calculatePaycheck(hourlyWage, numberOfHours); 
        //then
    	assertEquals(expected,actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTraveled = 66;
    	double expected = 37.949999999999996;
        //when
    	double actual = payroll.calculateMileageReimbursement(milesTraveled);
        //then
    	assertEquals(expected,actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String employName = "Sir Nicholas the Tenth";
    	double hourlyWage = 10.5;
    	String expected = "Hello Sir Nicholas the Tenth, We are pleased to offer you an hourly wage of 10.5";
        //when
    	String actual = payroll.createOfferLetter(employName, hourlyWage);
        //then
    	System.out.println(actual);
    	assertEquals(expected,actual);
    	
    }

}