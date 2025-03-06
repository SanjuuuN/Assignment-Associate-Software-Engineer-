// Array of local image paths
const images = [
    "images/image.jpg",
    "images/image2.jpg",
    "images/SDLC.jpg",
    "images/Software_Developer.jpg"
];

let currentIndex = 0;

// Function to update the displayed image
function updateImage() {
    let imgElement = document.getElementById("sliderImage");

    //  image source updates correctly
    imgElement.src = images[currentIndex];
}

// Show next image
function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;  // loops properly
    updateImage();
}

// Show previous image
function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;  //loops backward properly
    updateImage();
}

// first image is displayed when the page loads
window.onload = updateImage;
