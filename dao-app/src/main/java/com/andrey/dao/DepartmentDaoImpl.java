package com.andrey.dao;

import com.andrey.model.Department;
import com.andrey.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kobri on 16.05.2016.
 */
public class DepartmentDaoImpl implements DepartmentDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public List<Department> getAll(){
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("FROM  Department");

        return query.list();
    }

    public void add(Department department) {


        Session session = sessionFactory.getCurrentSession();

        session.save(department);
    }

    public void deleteById(int id){
        Session session = sessionFactory.getCurrentSession();

        Department department = (Department) session.get(Department.class, id);

        session.delete(department);
    }

    public Department get(int id){
        Session session = sessionFactory.getCurrentSession();

        Department department = (Department) session.get(Department.class, id);

        return department;
    }

    public void edit(Department department) {
        Session session = sessionFactory.getCurrentSession();

        Department newDepartment = (Department) session.get(Department.class, department.getId());

        newDepartment.setName(department.getName());

        session.save(newDepartment);
    }

    public List<Employee> avg(int id){
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Employee where dep_id =" + id);

        return query.list();
    }
}
