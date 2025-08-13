// Array of images
const images = [
    "https://picsum.photos/id/1015/600/400",
    "https://picsum.photos/id/1025/600/400",
    "https://picsum.photos/id/1035/600/400",
    "https://picsum.photos/id/1045/600/400",
    "https://picsum.photos/id/1055/600/400"
];

// Current index
let currentIndex = 0;

// Get DOM elements
const galleryImage = document.getElementById("galleryImage");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

// Function to update image
function updateImage() {
    galleryImage.src = images[currentIndex];
}

// Show first image initially
updateImage();

// Event listeners
nextBtn.addEventListener("click", function() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});

prevBtn.addEventListener("click", function() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});
