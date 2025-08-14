function login() {
  const userId = document.getElementById("userId").value;
  const password = document.getElementById("password").value;

  if (userId && password) {
    localStorage.setItem("userId", userId);
    document.getElementById("status").innerText = `Logged in as: ${userId}`;
  } else {
    alert("Please enter both User ID and Password.");
  }
}

function logout() {
  localStorage.removeItem("userId");
  document.getElementById("status").innerText = "Logged out.";
}

window.onload = function() {
  const storedUserId = localStorage.getItem("userId");
  if (storedUserId) {
    document.getElementById("status").innerText = `Logged in as: ${storedUserId}`;
  }
};
