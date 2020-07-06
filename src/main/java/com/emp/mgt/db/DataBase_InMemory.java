package com.emp.mgt.db;

import java.util.ArrayList;
import java.util.List;

import com.emp.mgt.entities.Employee;
import com.emp.mgt.entities.Relatives;

public class DataBase_InMemory {
	
	private static List<Employee> empolyeeList = new ArrayList();
	
	public static boolean saveEmployee(Employee e) throws Exception{
		
		empolyeeList.add(e);
		return true;
		
	}
	
	public static List<Employee> getAllEmployee() throws Exception {
		
		return empolyeeList;
		
	}
	
public static boolean getRemoveEmployee(Employee e) throws Exception {
		
		 empolyeeList.remove(e);
		 return true;
		
	}

public static boolean addRelatives(Relatives r, Employee e) throws Exception{
	// TODO Auto-generated method stub
	
	int indexOf = empolyeeList.indexOf(e);
	System.out.println("XXX---------"+empolyeeList.get(indexOf));
	
	if(empolyeeList.get(indexOf).getRelativeList()==null) {
//		List<Relatives> relativeList = empolyeeList.get(indexOf).getRelativeList() ;
//		List<Relatives> relativeList = new ArrayList<Relatives>();
		empolyeeList.get(indexOf).setRelativeList(new ArrayList<Relatives>());
	}
	
	empolyeeList.get(indexOf).getRelativeList().add(r);
	
	return true;
	
	
}

}
