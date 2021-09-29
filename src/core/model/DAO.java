package core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DAO {
    private static DAO instance = new DAO();
    private List<Student> studentList;
    private Vector<String> courseList = new Vector<String>();


    private DAO() {
        studentList = new ArrayList<>();
        courseList.addElement("Introduction to OOP with Java");
        courseList.addElement("Web Mastering with Java Technologies");
        courseList.addElement("Computer Architecture I");
        courseList.addElement("Computer Architecture II");
        courseList.addElement("Algorithmic I");
        courseList.addElement("Algorithmic II");
        courseList.addElement("Management Information System");
        courseList.addElement("Information System Security");
        courseList.addElement("Emerging Technologie and Internet");
        courseList.addElement("Operating System");
        courseList.addElement("Cloud Computing");
        courseList.addElement("Algebra I");
    }

    public static DAO getDAOInstance(){return instance;}

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Vector<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(Vector<String> courseList) {
        this.courseList = courseList;
    }
}
