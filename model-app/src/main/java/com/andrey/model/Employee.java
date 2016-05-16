package com.andrey.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by kobri on 15.05.2016.
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "mname")
    private String mname;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "salary")
    private int salary;

    @Column(name = "dep_id")
    private int dep_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }
}
