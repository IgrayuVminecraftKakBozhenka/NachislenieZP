package com.example.NachislenieZP.repository;

import com.example.NachislenieZP.models.EmployeeModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private EmployeeRepository() {}

    private static List<EmployeeModel> employeeRepository = new ArrayList<>();

    public static void insertEmployee(EmployeeModel employeeModel) {
        employeeRepository.add(employeeModel);
    }

    public static List<EmployeeModel> getAll() {
        return employeeRepository;
    }

}
