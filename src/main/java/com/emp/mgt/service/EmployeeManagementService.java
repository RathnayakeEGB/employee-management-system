package com.emp.mgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.mgt.db.DataBase_InMemory;
import com.emp.mgt.entities.Employee;
import com.emp.mgt.entities.Relatives;
import com.emp.mgt.utils.ResponseObject;

@Service
public class EmployeeManagementService {
	
	public ResponseObject saveEmployee(Employee e) throws Exception {
		
		e.setSeq(DataBase_InMemory.getAllEmployee().size()+1);
		DataBase_InMemory.saveEmployee(e);
		return new ResponseObject(200,"OK");
		
	}

	public List<Employee> getAll() throws Exception {
		// TODO Auto-generated method stub
		return DataBase_InMemory.getAllEmployee();
	}

	public ResponseObject updateEmployee(Employee ex) throws Exception{
		// TODO Auto-generated method stub
		
		List<Employee> allEmployee = DataBase_InMemory.getAllEmployee();
		int seq =0 ;
		
		for (Employee e : allEmployee) {
			
		
			if(e.getSeq() ==ex.getSeq()) {
				seq =e.getSeq();
				DataBase_InMemory.getRemoveEmployee(e);
				break;
			}
			
		}
		ex.setSeq(seq);
		DataBase_InMemory.saveEmployee(ex);
		return new ResponseObject(200,"OK");
		
	}

	public ResponseObject deleteEmployee(Employee ex) throws Exception {
		// TODO Auto-generated method stub
		
		List<Employee> allEmployee = DataBase_InMemory.getAllEmployee();
		
		for (Employee e : allEmployee) {
			
		
			if(e.getSeq() ==ex.getSeq()) {
			
				DataBase_InMemory.getRemoveEmployee(e);
				break;
			}
			
		}
		return new ResponseObject(200,"OK");
	}

	public ResponseObject addRelatives(Relatives r, int seq) throws Exception {
		// TODO Auto-generated method stub
		
		List<Employee> allEmployee = DataBase_InMemory.getAllEmployee();

		for (Employee e : allEmployee) {
			
			if(seq ==e.getSeq()) {
				DataBase_InMemory.addRelatives(r,e);
				break;
			}
			
		}
		
		return new ResponseObject(200,"OK");
	}

}
