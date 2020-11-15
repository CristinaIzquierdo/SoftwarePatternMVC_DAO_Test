package model;

import java.util.List;

public interface ICRUD {
	
	public String insert(Object obj); //create 
	public String delete(Object obj); //delete
	public String update(Object obj); //update
	public List<?> read(); //read
	public List<?> filter(String field, String searchCriteria); //buscar por criterio definido

}
