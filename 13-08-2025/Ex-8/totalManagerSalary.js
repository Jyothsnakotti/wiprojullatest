// Array of employees
const employees = [
    { name: "Alice", role: "Manager", empId: 101, salary: 90000 },
    { name: "Bob", role: "Developer", empId: 102, salary: 70000 },
    { name: "Carol", role: "QA", empId: 103, salary: 60000 },
    { name: "David", role: "Manager", empId: 104, salary: 95000 },
    { name: "Eve", role: "Developer", empId: 105, salary: 75000 },
    { name: "Frank", role: "Manager", empId: 106, salary: 92000 }
];

// Filter managers from employees
const managers = employees.filter(employee => employee.role === "Manager");

// Sum salary of all managers
const totalManagerSalary = managers.reduce((sum, manager) => sum + manager.salary, 0);

// Log the results in console
console.log("List of Managers:", managers);
console.log("Total Salary of All Managers:", totalManagerSalary);
