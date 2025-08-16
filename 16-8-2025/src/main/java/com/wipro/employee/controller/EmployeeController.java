package com.wipro.employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.employee.entity.Employee;
import com.wipro.employee.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // ---------- Thymeleaf ----------
    @GetMapping
    public String list(Model model) {
        model.addAttribute("employees", service.findAll());
        return "employees";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping
    public String save(@ModelAttribute("employee") Employee employee) {
        service.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("employee", service.findById(id));
        return "edit-employee";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
        service.update(id, employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/employees";
    }

    // ---------- Minimal REST (for Postman) ----------
    @GetMapping("/api")
    @ResponseBody
    public List<Employee> apiAll() {
        return service.findAll();
    }

    @GetMapping("/api/{id}")
    @ResponseBody
    public Employee apiById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/api")
    @ResponseBody
    public Employee apiCreate(@RequestBody Employee employee) {
        return service.save(employee);
    }
}