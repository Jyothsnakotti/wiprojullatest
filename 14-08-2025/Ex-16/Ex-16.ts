// Define the interface
interface Employee {
  empId: number;
  empName: string;
  salary: number;
}

// Function that accepts an array of Employee, prints them, and returns count
function printEmployees(empList: Employee[]): number {
  empList.forEach(emp => {
    console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
  });
  return empList.length;
}

// Create a list of employees
const employees: Employee[] = [
  { empId: 101, empName: "Alice", salary: 50000 },
  { empId: 102, empName: "Bob", salary: 60000 },
  { empId: 103, empName: "Charlie", salary: 55000 }
];

// Call the function and store the count
const count = printEmployees(employees);
console.log(`Total Employees: ${count}`);
