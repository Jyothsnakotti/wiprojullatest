// Function to check if a string is a palindrome
function isPalindrome(str) {
    // Remove spaces and make lowercase
    let cleaned = str.replace(/[^A-Za-z0-9]/g, "").toLowerCase();
    // Reverse the string
    let reversed = cleaned.split("").reverse().join("");
    // Compare
    return cleaned === reversed;
}

// Get DOM elements
const inputStr = document.getElementById("inputStr");
const checkBtn = document.getElementById("checkBtn");
const resultPara = document.getElementById("result");

// Add click event
checkBtn.addEventListener("click", function() {
    const text = inputStr.value;
    if (text.trim() === "") {
        resultPara.textContent = "Please enter a string.";
        return;
    }

    if (isPalindrome(text)) {
        resultPara.textContent = `"${text}" is a palindrome ✅`;
    } else {
        resultPara.textContent = `"${text}" is NOT a palindrome ❌`;
    }
});
