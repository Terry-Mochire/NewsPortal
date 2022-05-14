package models;

import java.util.Objects;

public class Department {
    private String name;
    private String description;
    private String numberOfEmployees;
    private int id;

    public Department(String name, String description, String numberOfEmployees){
        this.name= name;
        this.description= description;
        this.numberOfEmployees= numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
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
        Department that = (Department) o;
        return id == that.id && name.equals(that.name) && description.equals(that.description) && numberOfEmployees.equals(that.numberOfEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, numberOfEmployees, id);
    }
}
