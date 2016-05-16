package com.andrey.dao;

import com.andrey.model.Department;
import com.andrey.model.Employee;

import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */
public interface DepartmentDao {
    public List<Department> getAll();
    public void add(Department department);
    public void deleteById(int id);
    public void edit(Department department);
    public Department get(int  id);
    public List<Employee> avg(int id);
}
