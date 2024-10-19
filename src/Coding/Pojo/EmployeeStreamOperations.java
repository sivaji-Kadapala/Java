package InterviewsCoding.Pojo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
     Developing with Java 17 version
 */
record Employee(int id,String department,String name,double salary){

}
 public class EmployeeStreamOperations {
  public static void main(String[] args) {
   var employeeList = List.of (
           new Employee(1, "Alice", "Engineering", 95000),
           new Employee(2, "Bob", "Engineering", 105000),
           new Employee(3, "Charlie", "HR", 55000),
           new Employee(4, "David", "HR", 60000),
           new Employee(5, "Eve", "Marketing", 70000),
           new Employee(6, "Frank", "Marketing", 65000),
           new Employee(6, "Frank", "Marketing", 6500),
           new Employee(7, "Grace", "Engineering", 115000)
   );
//  Stream operation 1: Find all employees with salary above 60,000
   var salaryAbove60000=employeeList.stream ().filter ( emp->emp.salary ()>60000 ).toList ();
   System.out.println (salaryAbove60000);
// Stream operation 2: Group employees by department
   var Groupemployeesbydepartment=employeeList.stream ().collect ( Collectors.groupingBy ( Employee::department ) ).toString ();
   System.out.println (Groupemployeesbydepartment);
   // Stream operation 3: Calculate the total salary for each department
   var salaryforeachdepartment=employeeList.stream ().collect ( Collectors.groupingBy ( Employee::department,Collectors.summingDouble ( Employee::salary ) ) ).toString ();
   System.out.println (salaryforeachdepartment);
   // Stream operation 4: Get the employee with the highest salary
   var highestsalary=employeeList.stream ().max ( Comparator.comparing ( Employee::salary ) ).get ();
   System.out.println (highestsalary);
   // Stream Operation 5: Get the names of employees sorted by salary in descending order
   var namesofemployees=employeeList.stream ().sorted (Comparator.comparingDouble ( Employee::salary ) .reversed ()).map ( Employee::name ).toList ();
   System.out.println (namesofemployees);
   // Stream Operation 6: Check if all employees earn above 50,000
   var earnabove50000=employeeList.stream ().allMatch ( n->n.salary ()>50000 );
   System.out.println (earnabove50000);
   // Stream Operation 7: Check if any employee works in "Marketing"
   var Marketing=employeeList.stream ().anyMatch ( n->n.department ().equals ("Marketing") );
   System.out.println (Marketing);
   // Stream Operation 8: Find the average salary across all employees
   var avaearageSalary=employeeList.stream ().collect ( Collectors.averagingDouble ( Employee::salary )).toString ();
   System.out.println (avaearageSalary);
//    // Stream Operation 9: Count employees in the "Engineering" department
var countEngineering=employeeList.stream ().filter ( emp->emp.name ().equals ( "Engineering" ) ).count ();
   System.out.println (countEngineering);
   // Stream Operation 10: Find the employee with the lowest salary
  var lowest= employeeList.stream ().min ( Comparator.comparingDouble ( Employee::salary ) ).get ();
   System.out.println (lowest);
//Stream Operation 11: Partition employees by salary threshold (>=70K and <70K)
   var graterthan70=employeeList.stream ().collect ( Collectors.partitioningBy ( n->n.salary ()>70000 ) ).toString ();
   System.out.println (graterthan70);
//Stream Operation 12: Collect distinct department names as a Set
  var DistrinctNames=employeeList.stream ()
          .map ( Employee::department ).distinct ().collect( Collectors.toList()) ;
   System.out.println (DistrinctNames);
   // Stream Operation 13: Find the first employee in the "HR" department, if any
   var findFirst=employeeList.stream ().filter ( n->n.name ().equals ( "HR" ) ).findFirst ().toString ();
   System.out.println (findFirst);
// Stream Operation 14: Concatenate all employee names into a single string and district
   var concat=employeeList.stream ().map ( Employee::name ).distinct ().collect( Collectors.joining (","));
   System.out.println (concat);
   // Stream Operation 15: Count employees earning between 60K and 100K
   var filter=employeeList.stream ().filter ( n->n.salary ()>60000 && n.salary ()<100000 ).count ();
   System.out.println (filter);
   // Stream Operation 16: Get a list of employees sorted by department, then by salary
   var sort= employeeList.stream()
           .sorted(Comparator.comparing(Employee::department)
                   .thenComparing(Employee::salary))
           .toList ();
   System.out.println (sort);
   // Stream Operation 17: Find the second-highest salary in the company
   var secondHighestSalary = employeeList.stream()
           .map(Employee::salary)
           .sorted(Comparator.reverseOrder())
           .skip(1)
           .findFirst();
   secondHighestSalary.ifPresentOrElse(
           salary -> System.out.println("\nSecond-highest salary: " + salary),
           () -> System.out.println("\nNo second-highest salary found")
   );

   // Stream Operation 18: Group employees by department and count them
 var departmentCount = employeeList.stream()
           .collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
   System.out.println("\nNumber of employees per department: " + departmentCount);

   // Stream Operation 19: Calculate summary statistics for salaries (min, max, avg, etc.)
   var salaryStats = employeeList.stream()
           .mapToInt(emp -> (int) emp.salary())
           .summaryStatistics();
   System.out.println("\nSalary Statistics: " + salaryStats);

   // Stream Operation 20: Find employees with unique salary values
var uniqueSalaries = employeeList.stream()
           .collect(Collectors.groupingBy(Employee::salary))
           .values().stream()
           .filter(list -> list.size() == 1)
           .flatMap(List::stream)
           .collect(Collectors.toList());
   System.out.println("\nEmployees with unique salary values: " + uniqueSalaries);

   // Stream Operation 21: Get the top 3 highest-paid employees
   var top3HighestPaid = employeeList.stream()
           .sorted(Comparator.comparingDouble(Employee::salary).reversed())
           .limit(3)
           .collect(Collectors.toList());
   System.out.println("\nTop 3 highest-paid employees: " + top3HighestPaid);

   // Stream Operation 22: Join all employee names, sorted by salary, into a single string
  var sortedNames = employeeList.stream()
           .sorted(Comparator.comparing(Employee::salary))
           .map(Employee::name)
           .collect(Collectors.joining(", "));
   System.out.println("\nEmployees' names sorted by salary: " + sortedNames);
  }
}
