package com.example.NachislenieZP.controllers;

import com.example.NachislenieZP.models.EmployeeModel;
import com.example.NachislenieZP.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public final class MainController {


    @GetMapping("/")
    public String main(Model model) {
        Map<EmployeeModel, List<String>> employees = new HashMap<EmployeeModel, List<String>>();
        employees.putAll(EmployeeRepository.getAll());
        model.addAttribute("title", "Главная страница");
        return "main";
    }

}
