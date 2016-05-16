package com.andrey.dao;

import com.andrey.model.Employee;

import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */
public interface EmployeeDao {
    public List<Employee> getAll();
    public void add(Employee employee);
    public void delete(int id);
    public void edit(Employee employee);
    public Employee get(int id);
}
