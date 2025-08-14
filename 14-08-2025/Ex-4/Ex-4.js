// ES6 BankAccount class
class BankAccount {
  constructor(accountNumber, balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    if (amount > 0) {
      this.balance += amount;
      return `Deposited ${amount}. New balance is ${this.balance}.`;
    } else {
      return "Deposit amount must be positive.";
    }
  }

  withdraw(amount) {
    if (amount <= 0) {
      return "Withdrawal amount must be positive.";
    }
    if (amount > this.balance) {
      return "Insufficient balance.";
    }
    this.balance -= amount;
    return `Withdrew ${amount}. New balance is ${this.balance}.`;
  }
}

let myAccount = null;

function createAccount() {
  const accNo = document.getElementById("accNumber").value;
  const initBal = Number(document.getElementById("initBalance").value);

  if (accNo === "" || isNaN(initBal)) {
    document.getElementById("accountStatus").innerText = "Please enter valid account number and balance.";
    return;
  }

  myAccount = new BankAccount(accNo, initBal);
  document.getElementById("accountStatus").innerText = 
    `Account ${accNo} created with balance ${initBal}.`;
  updateBalanceDisplay();
}

function depositMoney() {
  if (!myAccount) {
    alert("Please create an account first.");
    return;
  }
  const amount = Number(document.getElementById("depositAmount").value);
  alert(myAccount.deposit(amount));
  updateBalanceDisplay();
}

function withdrawMoney() {
  if (!myAccount) {
    alert("Please create an account first.");
    return;
  }
  const amount = Number(document.getElementById("withdrawAmount").value);
  alert(myAccount.withdraw(amount));
  updateBalanceDisplay();
}

function updateBalanceDisplay() {
  if (myAccount) {
    document.getElementById("balanceDisplay").innerText = 
      `Current Balance: ${myAccount.balance}`;
  }
}
