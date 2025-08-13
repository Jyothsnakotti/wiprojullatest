// Unordered array of city names
let cities = ["Mumbai", "Delhi", "Kolkata", "Bangalore", "Chennai", "Pune", "Hyderabad", "Ahmedabad"];

// Get references to DOM elements
let btn = document.getElementById("loadCitiesBtn");
let dropdown = document.getElementById("cityDropdown");

// Event listener for button click
btn.addEventListener("click", function () {
    // Remove all options except the placeholder
    dropdown.length = 1; 

    // Sort cities in alphabetical order
    let sortedCities = cities.slice().sort();

    // Add sorted city names to dropdown
    sortedCities.forEach(function (city) {
        let option = document.createElement("option");
        option.text = city;
        option.value = city;
        dropdown.add(option);
    });

    // Disable button after loading
    btn.disabled = true;
    btn.textContent = "Cities Loaded";
});
