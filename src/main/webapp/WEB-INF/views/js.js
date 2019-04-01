var input = document.querySelector("#customInput"),
    charCount = document.querySelector("#charCount");

var onKeyDown = function () {
    charCount.textContent = input.value.length;
};

input.addEventListener("keydown", onKeyDown);