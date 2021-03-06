package core.model;

import core.tools.Utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String degree;
    private int credits;
    private int idStudent;
    private String email;
    private List<String> courses = new ArrayList<>();

    public Student() {
        super();
        idStudent = Utils.pseudoRandomNumber();
    }

    public Student(String fname, String lname, String gender,
                   int credits, int idStudent) {
        super(fname,lname,gender);
        this.credits = credits;
        this.idStudent = idStudent;
        idStudent = Utils.pseudoRandomNumber();

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
