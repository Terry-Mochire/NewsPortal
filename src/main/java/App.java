import com.google.gson.Gson;
import dao.Sql2oDepartmentDao;
import models.Department;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        String connect = "jdbc:postgresql://localhost:5432/news_portal";
        Sql2o sql2o = new Sql2o(connect, "terry", "Terry4041*" );
        Sql2oDepartmentDao sql2oDepartmentDao = new Sql2oDepartmentDao(sql2o);
        Connection conn = sql2o.open();
        Gson gson = new Gson();

        //Create New Department
        post("/department/new", (request, response) -> {
            Department department = gson.fromJson(request.body(), Department.class);
            sql2oDepartmentDao.add(department);
            response.status(200);
            return gson.toJson(department);
        });

        //List All Departments
        get("/departments", (request, response) -> {
            List<Department> list = sql2oDepartmentDao.getAll();
            response.status(200);
            return gson.toJson(list);
        });




        //Filtes
        after((request, response) -> {
            response.type("application/json");
        });
    }
}
