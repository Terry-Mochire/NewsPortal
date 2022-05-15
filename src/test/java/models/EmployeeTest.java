package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    public Employee setUpEmployee(){
        Employee testEmployee = new Employee("Chad", "Content producer", "Producer", "test@example.com", "0712345678", 2);
        return testEmployee;
    }

    @Test
    void getEmployeeName() {
        Employee testEmployee = setUpEmployee();
        assertEquals("Chad", testEmployee.getEmployeeName());

    }

    @Test
    void getPosition() {
        Employee testEmployee = setUpEmployee();
        assertEquals("Content producer", testEmployee.getPosition());
    }

    @Test
    void getRole() {
        Employee testEmployee = setUpEmployee();
        assertEquals("Producer", testEmployee.getRole());
    }

    @Test
    void getPhoneNumber() {
        Employee testEmployee = setUpEmployee();
        assertEquals("0712345678", testEmployee.getPhoneNumber());
    }

    @Test
    void getDepartmentId() {
        Employee testEmployee = setUpEmployee();
        assertEquals(2, testEmployee.getDepartmentId());
    }


    @Test
    void testEquals() {
        Employee testEmployee = setUpEmployee();
        Employee testEmployee2 = setUpEmployee();
        assertEquals(true, testEmployee.equals(testEmployee2));
    }
}