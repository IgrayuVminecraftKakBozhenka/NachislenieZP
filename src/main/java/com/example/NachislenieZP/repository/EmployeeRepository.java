package com.example.NachislenieZP.repository;

import com.example.NachislenieZP.models.EmployeeModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private EmployeeRepository() {}

    private static Map<EmployeeModel, List<String>> employeeRepository = new HashMap<EmployeeModel, List<String>>();

    public static void insertEmployee(EmployeeModel employeeModel, List<String> accrual) {
        employeeRepository.put(employeeModel, accrual);
    }

    public static Map<EmployeeModel, List<String>> getAll() {
        return employeeRepository;
    }

}
