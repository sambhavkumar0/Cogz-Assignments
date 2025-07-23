function isUsernameTaken(username) {
    try {
        const users = JSON.parse(sessionStorage.getItem("users")) || [];
        return users.some(user => user.username === username);
    } catch (err) {
        document.getElementById("result").innerHTML = "Function isUsernameTaken: " + err;
        return false;
    }
}

function registerUser() {
    try {
        const username = document.getElementById("username").value.trim();
        const password = document.getElementById("password").value.trim();
        const resultDiv = document.getElementById("result");

        if (isUsernameTaken(username)) {
            resultDiv.innerHTML = "Username is already taken. Please choose a different username.";
        } else {
            const newUser = { username, password };
            let users = JSON.parse(sessionStorage.getItem("users")) || [];
            users.push(newUser);
            sessionStorage.setItem("users", JSON.stringify(users));
            resultDiv.innerHTML = "Registration successful! You can now sign in.";
        }
    } catch (err) {
        document.getElementById("result").innerHTML = "Function registerUser: " + err;
    }

    // Prevent form submission
    return false;
}

  