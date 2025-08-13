// Quiz questions array
const quizData = [
    {
        question: "Which is the capital of France?",
        options: ["Berlin", "Madrid", "Paris", "Rome"],
        answer: "Paris"
    },
    {
        question: "Which language runs in a web browser?",
        options: ["Java", "C", "Python", "JavaScript"],
        answer: "JavaScript"
    },
    {
        question: "What does CSS stand for?",
        options: [
            "Cascading Style Sheets",
            "Computer Style Sheets",
            "Colorful Style System",
            "Creative Style Syntax"
        ],
        answer: "Cascading Style Sheets"
    }
];

let currentQuestionIndex = 0;
let score = 0;

// DOM elements
const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const nextBtn = document.getElementById("nextBtn");
const scoreEl = document.getElementById("score");

function loadQuestion() {
    feedbackEl.textContent = "";
    nextBtn.disabled = true;
    optionsEl.innerHTML = "";

    const currentQuestion = quizData[currentQuestionIndex];
    questionEl.textContent = currentQuestion.question;

    currentQuestion.options.forEach(option => {
        const btn = document.createElement("button");
        btn.textContent = option;
        btn.classList.add("option-btn");
        btn.addEventListener("click", () => selectAnswer(option));
        optionsEl.appendChild(btn);
    });
}

function selectAnswer(selectedOption) {
    const correctAnswer = quizData[currentQuestionIndex].answer;
    
    if (selectedOption === correctAnswer) {
        feedbackEl.textContent = "✅ Correct!";
        feedbackEl.style.color = "green";
        score++;
        scoreEl.textContent = `Score: ${score}`;
    } else {
        feedbackEl.textContent = `❌ Wrong! Correct answer: ${correctAnswer}`;
        feedbackEl.style.color = "red";
    }

    // Disable all buttons after selection
    Array.from(optionsEl.children).forEach(btn => btn.disabled = true);
    nextBtn.disabled = false;
}

nextBtn.addEventListener("click", () => {
    currentQuestionIndex++;
    if (currentQuestionIndex < quizData.length) {
        loadQuestion();
    } else {
        showFinalScore();
    }
});

function showFinalScore() {
    questionEl.textContent = "Quiz Completed!";
    optionsEl.innerHTML = "";
    feedbackEl.textContent = `Your final score is ${score} out of ${quizData.length}`;
    feedbackEl.style.color = "blue";
    nextBtn.style.display = "none";
}

// Load first question
loadQuestion();
