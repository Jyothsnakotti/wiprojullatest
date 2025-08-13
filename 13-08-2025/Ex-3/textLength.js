
let inputBox = document.getElementById("myInput");
let checkButton = document.getElementById("checkBtn");
let resultPara = document.getElementById("result");


checkButton.addEventListener("click", function() {
    
    let textValue = inputBox.value;   
    let length = textValue.length;    
    console.log("Length of text:", length);    
    resultPara.textContent = "Length: " + length;
});
