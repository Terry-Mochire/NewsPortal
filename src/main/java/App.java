import com.google.gson.Gson;
import dao.Sql2oDepartmentDao;
import dao.Sql2oEmployeeDao;
import models.Department;
import models.Employee;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        String connect = "jdbc:postgresql://localhost:5432/news_portal";
        Sql2o sql2o = new Sql2o(connect, "terry", "Terry4041*" );
        Sql2oDepartmentDao sql2oDepartmentDao = new Sql2oDepartmentDao(sql2o);
        Sql2oEmployeeDao sql2oEmployeeDao = new Sql2oEmployeeDao(sql2o);
        Connection conn = sql2o.open();
        Gson gson = new Gson();

        //Create New Department
        post("/department/new", "application/json" ,(request, response) -> {
            Department department = gson.fromJson(request.body(), Department.class);
            sql2oDepartmentDao.add(department);
            response.status(200);
            return gson.toJson(department);
        });

        //List All Departments
        get("/departments", "application/json",(request, response) -> {
            List<Department> list = sql2oDepartmentDao.getAll();
            response.status(200);
            return gson.toJson(list);
        });


        // Find Department by id
        get("/departments/:id", "application/json", (request, response) -> {
            int departmentId = Integer.parseInt(request.params("id"));
            return gson.toJson(sql2oDepartmentDao.findById(departmentId));
        });


        //Create New Employee
        post("/employee/new", "application/json", (request, response) -> {
            Employee employee = gson.fromJson(request.body(), Employee.class);
            sql2oEmployeeDao.add(employee);
            response.status(200);
            return gson.toJson(employee);
        });


        //List All Employees
        get("/employees", "application/json", (request, response) -> {
            List<Employee> employees = sql2oEmployeeDao.getAll();
            response.status(200);
            return gson.toJson(employees);
        });

        //Find Employee by Id
        get("/employee/:id", "application/json", (request, response) -> {
            int employeeId = Integer.parseInt(request.params("id"));
            return gson.toJson(sql2oEmployeeDao.findById(employeeId));
        });



        //Filtes
        after((request, response) -> {
            response.type("application/json");
        });
    }
}
