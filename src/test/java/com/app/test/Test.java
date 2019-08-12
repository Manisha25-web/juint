package com.app.test;

import static org.junit.Assert.*;
import static com.app.model.Employee.process; 
//(for one method)
import  com.app.model.Employee;
public class Test {
public static void main(String[] args) {
	//process();
	Employee em=new Employee();
	em.info();
	process();
	//process(s);
	
}
	//process();

}
