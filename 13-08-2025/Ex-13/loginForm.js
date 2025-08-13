// Get elements
const emailField = document.getElementById("email");
const passwordField = document.getElementById("password");
const emailError = document.getElementById("emailError");
const passwordError = document.getElementById("passwordError");
const form = document.getElementById("loginForm");

// Email validation regex
const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

// Validate email function
function validateEmail() {
    const emailValue = emailField.value.trim();
    if (emailValue === "") {
        emailError.textContent = "Email cannot be empty.";
        return false;
    } else if (!emailPattern.test(emailValue)) {
        emailError.textContent = "Please enter a valid email address.";
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}

// Validate password function
function validatePassword() {
    const passwordValue = passwordField.value.trim();
    if (passwordValue === "") {
        passwordError.textContent = "Password cannot be empty.";
        return false;
    } else {
        passwordError.textContent = "";
        return true;
    }
}

// Event listeners for onblur validation
emailField.addEventListener("blur", validateEmail);
passwordField.addEventListener("blur", validatePassword);

// Form submit validation
form.addEventListener("submit", function(e) {
    e.preventDefault(); // prevent form from submitting

    let emailValid = validateEmail();
    let passwordValid = validatePassword();

    if (emailValid && passwordValid) {
        alert("Login successful! (Dummy validation passed)");
        form.reset();
    }
});
