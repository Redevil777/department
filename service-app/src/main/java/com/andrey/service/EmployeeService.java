package com.andrey.service;

import com.andrey.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */


@Service("employeeService")
@Transactional
public class EmployeeService {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

   // private Logger LOGGER = LogManager.getLogger(EmployeeService.class);

    public List<Employee> getAll(){

      //  LOGGER.debug("get all employee");
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Employee");

        List<Employee> list = query.list();

        return query.list();
    }

    public void add(Employee employee){
      //  LOGGER.debug("add employee");

        Session session = sessionFactory.getCurrentSession();

        session.save(employee);
    }

    public void delete(int id){
      //  LOGGER.debug("delete employee by id");

        Session session = sessionFactory.getCurrentSession();

        Employee employee = (Employee) session.get(Employee.class, id);

        session.delete(employee);
    }

    public void edit(Employee employee){
     //   LOGGER.debug("edit employee");
        Session session = sessionFactory.getCurrentSession();

        Employee newEmployee = (Employee) session.get(Employee.class, employee.getId());

        newEmployee.setFname(employee.getFname());
        newEmployee.setLname(employee.getLname());
        newEmployee.setMname(employee.getMname());
        newEmployee.setBirthday(employee.getBirthday());
        newEmployee.setSalary(employee.getSalary());
        newEmployee.setDep_id(employee.getDep_id());

        session.save(newEmployee);
    }

    public Employee get(int id){
       // LOGGER.debug("get employee by id");
        Session session = sessionFactory.getCurrentSession();

        Employee employee = (Employee) session.get(Employee.class, id);

        return employee;
    }

    public List<Employee> getEmployeesBetweenDates(Date from, Date to){
       // LOGGER.debug("get employees between dates of birthday");

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Employee where birthday between '1993-01-01' and '1995-08-24'");

        return query.list();
    }
}
