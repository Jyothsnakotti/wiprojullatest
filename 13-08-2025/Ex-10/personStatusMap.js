// Original array of persons
let persons = [
    { name: "John", age: 25, city: "New York" },
    { name: "Sara", age: 17, city: "Delhi" },
    { name: "Mike", age: 30, city: "London" },
    { name: "Anita", age: 16, city: "Mumbai" },
    { name: "Robert", age: 18, city: "Sydney" }
];

// Use map to return a new array with 'status' property added to each object
let updatedPersons = persons.map(person => {
    return {
        ...person, // Spread existing properties
        status: person.age >= 18 ? "Adult" : "Minor" // Add new status property
    };
});

// Print the updated array to console
console.log("Persons with Status using map:", updatedPersons);
