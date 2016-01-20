window.onload = init;

//Form Display & Hide in HTML HOME page
function init() {
    hideForm();
}
function showCreateGrameForm() {
    hideForm();
    document.getElementById("createGameForm").style.display = '';
}
function showRegisterationForm() {
    hideForm();
    document.getElementById("registerationForm").style.display = '';
}
function hideForm() {
    document.getElementById("createGameForm").style.display = "none";
    document.getElementById("registerationForm").style.display = "none";
}
