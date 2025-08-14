// Function that accepts an array of Employee, prints them, and returns count
function printEmployees(empList) {
    empList.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return empList.length;
}
// Create a list of employees
var employees = [
    { empId: 101, empName: "Alice", salary: 50000 },
    { empId: 102, empName: "Bob", salary: 60000 },
    { empId: 103, empName: "Charlie", salary: 55000 }
];
// Call the function and store the count
var count = printEmployees(employees);
console.log("Total Employees: ".concat(count));
