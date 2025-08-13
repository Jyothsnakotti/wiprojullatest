// Get references to DOM elements
const taskInput = document.getElementById("taskInput");
const addTaskBtn = document.getElementById("addTaskBtn");
const taskList = document.getElementById("taskList");

// Function to add a task
function addTask() {
    const taskText = taskInput.value.trim();

    if (taskText === "") {
        alert("Please enter a task.");
        return;
    }

    // Create list item
    const li = document.createElement("li");
    li.textContent = taskText;

    // Create delete button
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.addEventListener("click", function () {
        taskList.removeChild(li);
    });

    // Append button to list item
    li.appendChild(deleteBtn);

    // Add li to the list
    taskList.appendChild(li);

    // Clear the input
    taskInput.value = "";
    taskInput.focus();
}

// Event listener for Add Task button
addTaskBtn.addEventListener("click", addTask);

// Optional: Enter key adds a task
taskInput.addEventListener("keypress", function (e) {
    if (e.key === "Enter") {
        addTask();
    }
});
