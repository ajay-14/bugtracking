package com.bugtracking.employee.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.bugtracking.employee.dto.EmployeeDto;
import com.bugtracking.employee.entities.Employee;

public class EmployeeMapper {
	
	public static Employee toEmployee(EmployeeDto employeeDto) {
		Employee employee=new Employee();
		employee.setEmpId(employeeDto.getEmpId());
		employee.setEmpName(employeeDto.getEmpName());
		employee.setEmail(employeeDto.getEmail());
		employee.setContactNo(employeeDto.getContactNo());
		employee.setProjectId(employeeDto.getProjectId());
		return employee;
	}
	
	public static EmployeeDto toEmployeeDto(Employee employee) {
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setEmpId(employee.getEmpId());
		employeeDto.setEmpName(employee.getEmpName());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setContactNo(employee.getContactNo());
		employeeDto.setProjectId(employee.getProjectId());
		return employeeDto;
	}
	
	public static List<EmployeeDto> toEmployeeDtoList(List<Employee> employees){
		return employees.stream().map(EmployeeMapper::toEmployeeDto).collect(Collectors.toList());
	}

}