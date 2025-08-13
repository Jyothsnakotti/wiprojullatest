
let inputBox = document.getElementById("myInput");
let charLabel = document.getElementById("charLabel");


let maxLength = inputBox.maxLength;


inputBox.addEventListener("input", function () {
    
    let remaining = maxLength - inputBox.value.length;

   
    charLabel.textContent = remaining + " characters remaining";
});
