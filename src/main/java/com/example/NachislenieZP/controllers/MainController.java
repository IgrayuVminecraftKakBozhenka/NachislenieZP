package com.example.NachislenieZP.controllers;

import com.example.NachislenieZP.models.EmployeeModel;
import com.example.NachislenieZP.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public final class MainController {


    @GetMapping("/")
    public String main(Model model) {
        List<EmployeeModel> employees = new ArrayList<>();
        employees.addAll(EmployeeRepository.getAll());
        model.addAttribute("employees", employees);
        return "main";
    }

}
