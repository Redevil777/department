package com.andrey.web;

import com.andrey.model.Department;
import com.andrey.model.Employee;
import com.andrey.service.DepartmentService;
import com.andrey.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private Logger LOGGER = LogManager.getLogger(DepartmentService.class);

    @Resource(name = "employeeService")
    private EmployeeService employeeService;


    @Resource(name = "departmentService")
    private DepartmentService departmentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll(Model model){
        LOGGER.debug("get all employee");

        List<Employee> employees = employeeService.getAll();
        List<Department> departments = departmentService.getAll();

        model.addAttribute("employee", employees);
        model.addAttribute("department", departments);


        return "employeeall";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAdd(Model model){

        LOGGER.debug("adding employee");

        List<Department> departments = departmentService.getAll();


        model.addAttribute("employee", new Employee());
        model.addAttribute("department", departments);

        return "employeeadd";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("employee") Employee employee){
        LOGGER.debug("employee added");

        employeeService.add(employee);

        return "employeeadded";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id", required = true) int id, Model model){

        LOGGER.debug("delete employee");

        employeeService.delete(id);

        return "employeedelete";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("editing employee");

        model.addAttribute("employee", employeeService.get(id));
        model.addAttribute("department", departmentService.getAll());

        return "employeeedit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("employee") Employee employee,
                           @RequestParam(value = "id",required = true) int id,
                           Model model){
        LOGGER.debug("employee edited");

        employee.setId(id);

        employeeService.edit(employee);

        model.addAttribute("id", id);

        return "employeeedited";
    }

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    public String getEmployeesBetweenDates(@RequestParam(value = "from") Date from,
                                           @RequestParam(value = "to") Date to,
                                           Model model){
        LOGGER.debug("get employee between dates of birthday");

        model.addAttribute("employee", employeeService.getEmployeesBetweenDates(from, to) );
        model.addAttribute("from", from);
        model.addAttribute("to", to);
        model.addAttribute("department", departmentService.getAll());
        return "employeesearch";
    }
}