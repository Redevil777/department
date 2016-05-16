package com.andrey.web;


import com.andrey.model.Department;
import com.andrey.model.Employee;
import com.andrey.service.DepartmentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobri on 15.05.2016.
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Resource(name = "departmentService")
    private DepartmentService departmentService;

    private Logger LOGGER = LogManager.getLogger(DepartmentController.class);


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll(Model model){
        LOGGER.info("get all department");

        List<Department> departments = departmentService.getAll();

        model.addAttribute("departments", departments);

        return "departmentall";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAdd(Model model){
        LOGGER.debug("adding department");

        model.addAttribute("depatr", new Department());

        return "departmentadd";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("depatr") Department department){

        LOGGER.debug("department added");

        departmentService.add(department);

        return "departmentadded";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("delete department by id");

        departmentService.deleteById(id);

        model.addAttribute("id", id);

        return "departmentdelete";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("editing department");

        model.addAttribute("depAtr", departmentService.get(id));

        return "departmentedit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("depAtr") Department department,
                           @RequestParam(value = "id", required = true) int id,
                           Model model){
        LOGGER.debug("department edited");

        department.setId(id);

        departmentService.edit(department);

        model.addAttribute("id", id);

        return "departmentedited";
    }

    @RequestMapping(value = "/avg", method = RequestMethod.GET)
    public String avg(@RequestParam(value = "id", required = true) int id,
                      Model model){
        LOGGER.debug("average salary");

        List<Employee> departments = departmentService.avg(id);

        int avg = 0;

        List<Integer> list = new ArrayList<>();

        if(!departments.isEmpty()){
            for(Employee qwe:departments){
                list.add(qwe.getSalary());
            }

            for(Integer asd : list){
                avg+=asd;
            }

            avg = avg/list.size();
        }
        model.addAttribute("avg", avg);

        return "avgsalary";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String emp(@RequestParam(value = "id", required = true) int id,
                              Model model){
        List<Employee> employees = departmentService.emp(id);

        model.addAttribute("employee", employees);

        for(Employee qwe: employees){
            System.out.println(qwe.getFname());
        }

        return "departmentemployee";
    }
}