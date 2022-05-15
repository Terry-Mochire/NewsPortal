package dao;

import models.Department;

import java.util.List;

public interface DepartmentDao {

    //Create

    void add(Department department);


    //Read

    List<Department> getAll();
    Department findById(int id);

    // Update
//    void update(int id, String departmentName, String description, int numberOfEmployees);

    //Delete

    void deleteById(int id);

    void clearAll();

}
