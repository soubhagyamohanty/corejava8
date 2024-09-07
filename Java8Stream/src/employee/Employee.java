package employee;

import java.util.List;

public class Employee {

	private String name;
	private int employeeId;
	private String department;
	private double salary;
	private String gender;
	private List<String> phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + ", salary="
				+ salary + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}

	public Employee(String name, int employeeId, String department, double salary, String gender,
			List<String> phoneNumber) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
