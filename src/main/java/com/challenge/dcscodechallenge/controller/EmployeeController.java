package com.challenge.dcscodechallenge.controller;

import com.challenge.dcscodechallenge.model.Employee;
import com.challenge.dcscodechallenge.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Slf4j
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/viewEmployees")
    public String viewEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "view-employees";
    }

    @GetMapping("/addEmployee")
    public String addEmployeeView(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping("/addEmployee")
    public RedirectView addEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/employee/addEmployee", true);
        Employee saveEmployee = employeeService.addEmployee(employee);
        redirectAttributes.addFlashAttribute("savedEmployee", saveEmployee);
        redirectAttributes.addFlashAttribute("addEmployeeSuccess", true);
        return redirectView;
    }
}
