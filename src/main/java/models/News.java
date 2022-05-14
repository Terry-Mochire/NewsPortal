package models;

import java.util.Objects;

public class News {
    private String title;
    private String content;
    private String department;
    private int id;

    public News (String title, String content, String department){
        this.title = title;
        this.content = content;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        News news = (News) o;
        return id == news.id && title.equals(news.title) && content.equals(news.content) && department.equals(news.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, department, id);
    }
}
