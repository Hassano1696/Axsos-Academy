function aler() {
    alert("Ninja was liked!");
}

function login(navb) {
    if (navb.innerText == 'Login') {
        navb.innerText = 'Logout'
    }
    else {
        navb.innerText = 'Login'
    }
}
function vanish(Add){
    Add.remove()
}