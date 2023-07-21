package com.debjani.Debjani.controller;

import com.debjani.Debjani.entity.Employee;
import com.debjani.Debjani.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpController<employee> {

    @Autowired
    private EmpService service;

    @GetMapping("/")
    public String home(Model m) {
        List<Employee> emp=service.getAllEmp();
        m.addAttribute("emp",emp);
        return "index";
    }
    @GetMapping("/addemp")
    public String addEmpForm(){
        return "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session ) {
        service.addEmp(e);
        session.setAttribute("msg", "Employee Added Succesfully!");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model m) {
        Employee e=service.getEmpById(id);
        m.addAttribute("emp",e);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Employee e, HttpSession session) {
        service.addEmp(e);
        session.setAttribute("msg", "Employee data updated!!");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, HttpSession session) {
        service.delete(id);
        session.setAttribute("msg", "Employee data deleted!!");
        return "redirect:/";
    }
}

