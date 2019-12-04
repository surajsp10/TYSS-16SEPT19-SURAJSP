package com.tyss.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.springrest.dto.EmployeeBean;
import com.tyss.springrest.dto.EmployeeResponse;
import com.tyss.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data successfully added to DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not successfully added to DB");

			
		}
		return response;
	}//end of add employee
	
	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data successfully modified in DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not successfully modified in DB");

			
		}
		return response;
	}//end of modifyemployee
	
	@DeleteMapping(path = "/delete/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		
		
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data successfully deleted in DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not successfully deleted in DB");

			
		}
		return response;
		
	}//end of delete
	
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data successfully found in DB");
			response.setEmployeebeans(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data successfully not found in DB");	
		}
		return response;
	}//end of employeeBean
	
	
	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(beans!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data successfully found in DB");
			response.setEmployeebeans(beans);
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data successfully not found in DB");	
		}
		return response;
	}//end of getAllEmployee
	
	
	@GetMapping(path = "/exec",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
	}
	
}//end od employeeController
