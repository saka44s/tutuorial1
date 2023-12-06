package test;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee>{
	private String name;
	private String dept;
	private int sal;
	private int empId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Employee(String name, String dept, int sal, int empId) {
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.empId = empId;
	}
	
    public int compareTo(Employee emp) {
        //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.empId - emp.empId);
    }
	
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getEmpId() == this.getEmpId()
                && employee.getName() == this.getName();
    }
    
    public int hashCode() {
        int result=17;
		/*
		 * result=31*result+1; result=31*result+(name!=null ? name.hashCode():0);
		 */
        return result;
    }
	
	
}
