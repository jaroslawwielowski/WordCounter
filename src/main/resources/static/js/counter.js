// var $ = function (a) {
//     return document.getElementById(a)
//
// }
// var cha = function () {
//     var chars = $('chars');
//     var words = $('words');
//     var sentences = $('sentences');
//     var customInput = $('customInput');
//     s = customInput.value;
//     s = s.replace(/(^\s*)|(\s*$)/gi, "");
//     s = s.replace(/[ ]{2,}/gi, " ");
//     s = s.replace(/\n /, "\n");
//     words.innerHTML = s.split(' ').length;
//     // sentences.innerHTML = s.split('.').length;
//     chars.innerHTML = customInput.value.replace(/[^A-Z0-9]/gi, "").length;
//
// }
// window.onload = cha();

// var imput = document.querySelector('#customImput'),
//     charCount = document.querySelector('#charCounter');
//
// var onKeyDown = function () {
//     charCount.textContent = imput.value.length;
// };
//
// imput.addEventListener("keydown", onKeyDown);

var input = document.querySelector("#customInput"),
    charCount = document.querySelector("#charCount");

var onKeyDown = function () {
    charCount.textContent = input.value.length;

};

var input2 = document.querySelector("#customInput"),
    wordCount = document.querySelector("#wordCount");


var wordKeyDown = function(){
    wordCount.textContent = input2.value.split(" ").length;

};

var input3 = document.querySelector("#customInput"),
    questionCount = document.querySelector("#questionsCount");


var questionKeyDown = function(){
    questionCount.textContent = input2.value.split(".").length;

};

input.addEventListener("keydown", onKeyDown);
input2.addEventListener("keydown", wordKeyDown);
input3.addEventListener("keydown", questionKeyDown)
