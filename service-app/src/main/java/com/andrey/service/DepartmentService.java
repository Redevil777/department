package com.andrey.service;

import com.andrey.model.Department;
import com.andrey.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */

@Service("departmentService")
@Transactional
public class DepartmentService {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    //private Logger LOGGER = LogManager.getLogger(DepartmentService.class);

    public List<Department> getAll(){

        //LOGGER.debug("Department getAll");
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("FROM  Department");

        return query.list();
    }

    public void add(Department department) {

        //LOGGER.debug("add department");

        Session session = sessionFactory.getCurrentSession();

        session.save(department);
    }

    public void deleteById(int id){

       // LOGGER.debug("delete department by id");
        Session session = sessionFactory.getCurrentSession();

        Department department = (Department) session.get(Department.class, id);

        session.delete(department);
    }

    public Department get(int id){
       // LOGGER.debug("get department by id");

        Session session = sessionFactory.getCurrentSession();

        Department department = (Department) session.get(Department.class, id);

        return department;
    }

    public void edit(Department department) {

       // LOGGER.debug("Edit department");
        Session session = sessionFactory.getCurrentSession();

        Department newDepartment = (Department) session.get(Department.class, department.getId());

        newDepartment.setName(department.getName());

        session.save(newDepartment);
    }

    public List<Employee> avg(int id){
       // LOGGER.debug("average salary");

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Employee where dep_id =" + id);

        return query.list();
    }
}
