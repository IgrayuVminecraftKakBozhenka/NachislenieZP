package com.example.NachislenieZP.models;

import com.example.NachislenieZP.repository.EmployeeRepository;

public class SalaryModel {
    private final int employeeId;
    private final String employeeName;
    private final String date;
    private final int sum;

    public SalaryModel(int id, String date, int sum) {
        this.employeeId = id;
        this.employeeName = EmployeeRepository.getEmployeeNameById(id);
        this.date = date;
        this.sum = sum;
    }
}
