// Array of persons from Ex7
let persons = [
    { name: "John", age: 25, city: "New York" },
    { name: "Sara", age: 17, city: "Delhi" },
    { name: "Mike", age: 30, city: "London" },
    { name: "Anita", age: 16, city: "Mumbai" },
    { name: "Robert", age: 18, city: "Sydney" }
];

// Add status property based on age
persons.forEach(function(person) {
    if (person.age >= 18) {
        person.status = "Adult";
    } else {
        person.status = "Minor";
    }
});

// Print updated array with status
console.log("Persons with Status:", persons);
