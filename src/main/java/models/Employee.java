package models;

import java.util.Objects;

public class Employee {
    private String employeeName;
    private String position;
    private String role;
    private String email;
    private String  phoneNumber;
    private int departmentId;
    private int id;

    public Employee(String employeeName, String position, String role, String email, String phoneNumber, int departmentId){
        this.employeeName = employeeName;
        this.position = position;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.departmentId= departmentId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentId == employee.departmentId && id == employee.id && employeeName.equals(employee.employeeName) && position.equals(employee.position) && role.equals(employee.role) && email.equals(employee.email) && phoneNumber.equals(employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, position, role, email, phoneNumber, departmentId, id);
    }
}
