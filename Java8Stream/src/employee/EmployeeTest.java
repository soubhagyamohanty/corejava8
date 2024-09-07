package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Soubhagya",101,"IT",70000,"Male",Arrays.asList("9776595940","9861112222"));
		Employee e2 = new Employee("Surya",102,"Solar",80000,"Male",Arrays.asList("9778595940","9861112111"));
		Employee e3 = new Employee("Rajeswari",103,"IT",90000,"Female",Arrays.asList("9777595940","123345"));
		Employee e4 = new Employee("Lalatendu",201,"IT",50000,"Male",Arrays.asList("9776595940","9867772222"));
		Employee e5 = new Employee("Deepak",301,"Telecommunications",60000,"Male",Arrays.asList("9770095940","9868882222"));
		Employee e6 = new Employee("Abhisek",401,"Civil",40000,"Male",Arrays.asList("977111195940","9869992222"));
		
		List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		List<List<String>> collect = employeeList.stream().map(employee->employee.getPhoneNumber()).collect(Collectors.toList());
		//System.out.println(collect);
		
		List<String> nameStartWithS =employeeList.stream()
				.filter(employee->employee.getName().toLowerCase().startsWith("s"))
				.map(employee->employee.getName() + ":"+ employee.getSalary())
				.collect(Collectors.toList());
		//nameStartWithS.forEach(System.out::println);
		//System.out.println(nameStartWithS);
		
		
		//---------------------------
		Map<String,Optional<Employee>> highestPaidEmployeeWithPhoneNumbers = 
				employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		highestPaidEmployeeWithPhoneNumbers.forEach((department,employees)->
		employees.ifPresent(employee->System.out.println(
				"Department::"+department+
				employee.getName()+
				employee.getSalary()+
				employee.getPhoneNumber())));
	}

}
