package core.model;

import core.tools.Utils;

import java.io.Serializable;


public class Person {
    private int idPerson;
    private String fname;
    private String lname;
    private String gender;

    public Person() {
        idPerson = Utils.pseudoRandomNumber();

    }

    public Person(String fname, String lname, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        idPerson = Utils.pseudoRandomNumber();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdPerson() {
        return idPerson;
    }
}
