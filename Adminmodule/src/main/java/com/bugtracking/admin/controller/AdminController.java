package com.bugtracking.admin.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bugtracking.admin.entities.Bug;
import com.bugtracking.admin.entities.Employee;
import com.bugtracking.admin.entities.Project;
import com.bugtracking.admin.entities.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
public class AdminController {
	
	@GetMapping("/admin/bugs")
	@ApiOperation("used to fetch all bugs(BY ADMIN)")
	public List<Bug> allbugs(){
		String endpoint="http://localhost:8094/bugs/";
		RestTemplate rt=new RestTemplate();
		List<Bug> m=Arrays.asList(rt.getForObject(endpoint,Bug[].class));
		return m;	
	}
	@ApiOperation("Used to fetch bug with particular id(BY ADMIN)")
	@GetMapping("/admin/bugs/{bid}")
	public Bug getbug( @PathVariable long bid) {
		String endpoint="http://localhost:8094/bugs/"+bid;
		RestTemplate rt=new RestTemplate();
		Bug m=rt.getForObject(endpoint,Bug.class);
		return m;
	}
	@ApiOperation("Used to delete bug with particular id(BY ADMIN)")
	@DeleteMapping("/admin/bugs/{bid}")
	public String deletebug( @PathVariable long bid) {
		String endpoint="http://localhost:8094/bugs/"+bid;
		RestTemplate rt=new RestTemplate();
		rt.delete(endpoint);
		return "deleted";
	}
	@ApiOperation("Used to create bug(BY ADMIN)")
	@PostMapping("/admin/bugs")
	public String createbug(@Valid @RequestBody Bug b){
		String endpoint="http://localhost:8094/bugs/";
		RestTemplate rt=new RestTemplate();
		rt.postForLocation(endpoint,b);
		return "created successfully";
		
	}
	@ApiOperation("Used to update bug(BY ADMIN)")
	@PutMapping("/admin/bugs/{bid}")
	public String updatebug(@PathVariable long bid,@Valid @RequestBody Bug b){
		String endpoint="http://localhost:8094/bugs/"+bid;
		RestTemplate rt=new RestTemplate();
		rt.put(endpoint,b);
		return "updated successfully";
		}
	@ApiOperation("Used to fetch bugs by status(BY ADMIN)")
	@GetMapping("/admin/bystatus/{status}")
	public List<Bug> bugsbystatus(@PathVariable String status){
		String endpoint="http://localhost:8094/bugs/bystatus/"+status;
		RestTemplate rt=new RestTemplate();
		List<Bug> m=Arrays.asList(rt.getForObject(endpoint,Bug[].class));
		return m;	
	}
	@ApiOperation("Used to fetch all employees(BY ADMIN)")
	@GetMapping("/admin/employees")
	public List<Employee> allemployees(){
		String endpoint="http://localhost:8096/employees/";
		RestTemplate rt=new RestTemplate();
		List<Employee> m=Arrays.asList(rt.getForObject(endpoint,Employee[].class));
		return m;	
	}
	@ApiOperation("Used to fetch employee with particular id(BY ADMIN)")
	@GetMapping("/admin/employees/{empId}")
	public Employee getemployee(@PathVariable long empId) {
		String endpoint="http://localhost:8096/employees/"+empId;
		RestTemplate rt=new RestTemplate();
		Employee m=rt.getForObject(endpoint,Employee.class);
		return m;
		}
	@ApiOperation("Used to delete employee with particular id(BY ADMIN)")
	@DeleteMapping("/admin/employees/{empId}")
	public String deleteemployee(@PathVariable long empId) {
		String endpoint="http://localhost:8096/employees/"+empId;
		RestTemplate rt=new RestTemplate();
		rt.delete(endpoint);
		return "deleted";
	}
	@ApiOperation("Used to create employee(BY ADMIN)")
	@PostMapping("/admin/employees")
	public String createemployee(@Valid @RequestBody Employee e){
		String endpoint="http://localhost:8096/employees/";
		RestTemplate rt=new RestTemplate();
		rt.postForLocation(endpoint,e);
		return "created successfully";
	}
	@ApiOperation("Used to update employees(BY ADMIN)")
	@PutMapping("/admin/employees/{empId}")
	public String updateemployee(@PathVariable("empId")long empId,@Valid @RequestBody Employee e){
		String endpoint="http://localhost:8096/employees/"+empId;
		RestTemplate rt=new RestTemplate();
		rt.put(endpoint,e);
		return "updated successfully";	
	}
	@ApiOperation("Used to fetch all projects(BY ADMIN)")
	@GetMapping("/admin/projects")
	public List<Project> allprojects(){
		String endpoint="http://localhost:8095/projects/";
		RestTemplate rt=new RestTemplate();
		List<Project> m=Arrays.asList(rt.getForObject(endpoint,Project[].class));
		return m;	
		
	}
	@ApiOperation("Used to fetch project with particular id(BY ADMIN)")
	@GetMapping("/admin/projects/{projId}")
	public Project getproject(@PathVariable long projId) {
		String endpoint="http://localhost:8095/projects/"+projId;
		RestTemplate rt=new RestTemplate();
		Project m=rt.getForObject(endpoint,Project.class);
		return m;
		}
	@ApiOperation("Used to delete project with particular id(BY ADMIN)")
	@DeleteMapping("/admin/projects/{projId}")
	public String deleteproject(@PathVariable long projId) {
		String endpoint="http://localhost:8095/projects/"+projId;
		RestTemplate rt=new RestTemplate();
		rt.delete(endpoint);
		return "deleted";
	}
	@ApiOperation("Used to create project(BY ADMIN)")
	@PostMapping("/admin/projects")
	public String createproject(@Valid @RequestBody Project p){
		String endpoint="http://localhost:8095/projects/";
		RestTemplate rt=new RestTemplate();
		rt.postForLocation(endpoint,p);
		return "created successfully";
		}
	@ApiOperation("Used to update project(BY ADMIN)")
	@PutMapping("/admin/projects/{projId}")
	public String updatebug(@PathVariable("projId")long projId,@Valid @RequestBody Project p){
		String endpoint="http://localhost:8095/projects/"+projId;
		RestTemplate rt=new RestTemplate();
		rt.put(endpoint,p);
		return "updated successfully";
		}
	
	
}
