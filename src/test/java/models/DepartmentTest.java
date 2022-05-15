package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {


    public Department setUpDepartment(){
        Department testDepartment = new Department("Sports", "Tell me more about sports", "12");
        return testDepartment;
    }

    @Test
    void getName_correctlyReturnsTheName() {
        Department testDepartment = setUpDepartment();
        assertEquals("Sports", testDepartment.getName());

    }


    @Test
    void getDescription_correctlyReturnsTheDescription() {
        Department testDepartment = setUpDepartment();
        assertEquals("Tell me more about sports", testDepartment.getDescription());
    }

    @Test
    void getNumberOfEmployees_correctlyReturnsNumberOfEmployees() {
        Department testDepartment = setUpDepartment();
        assertEquals("12", testDepartment.getNumberOfEmployees());
    }


    @Test
    void testEquals() {
        Department testDepartment = new Department("Sports", "Tell me more about sports", "12");
        Department testDepartment2 =  new Department("Sports", "Tell me more about sports", "12");
        assertTrue(testDepartment.equals(testDepartment2));
    }

}