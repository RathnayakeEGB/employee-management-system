package com.emp.mgt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mgt.entities.Employee;
import com.emp.mgt.entities.Relatives;
import com.emp.mgt.service.EmployeeManagementService;
import com.emp.mgt.utils.ResponseObject;

@RestController
@RequestMapping(value = "/emp")
@CrossOrigin
public class EmployeeManagementController {
	
	@Autowired

	private EmployeeManagementService  employeeManagementService;
	
	@PostMapping(value = "/save-employee",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveEmployee(@RequestBody Employee e) {
		
		try {
			ResponseObject ro = employeeManagementService.saveEmployee(e);
			return ResponseEntity.ok(ro);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return null;
		
	}
	

	@GetMapping(value = "getAll")
	public List<Employee> getAllEmployee() {
		
	
		try {
			return employeeManagementService.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PutMapping(value = "/update-employee",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateEmployee(@RequestBody Employee e) {
		
		try {
			ResponseObject ro = employeeManagementService.updateEmployee(e);
			return ResponseEntity.ok(ro);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return null;
		
	}
	
	@PutMapping(value = "/delete-employee",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deleteEmployee(@RequestBody Employee e) {
		
		try {
			ResponseObject ro = employeeManagementService.deleteEmployee(e);
			return ResponseEntity.ok(ro);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return null;
		
	}
	

	@PutMapping(value = "/add-relative/{EmpId}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addRelative(@RequestBody Relatives r ,@PathVariable("EmpId") int seq) {
		
		try {
			ResponseObject ro = employeeManagementService.addRelatives(r,seq);
			return ResponseEntity.ok(ro);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return null;
		
	}
	
}
