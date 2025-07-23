const display = document.getElementById("display");
const buttons = document.querySelectorAll("button");

let currentInput = "";

buttons.forEach((btn) => {
  btn.addEventListener("click", () => {
    const value = btn.textContent;

    if (value === "=") {
      try {
        currentInput = eval(currentInput).toString();
      } catch (err) {
        currentInput = "Error";
      }
    } else {
      currentInput += value;
    }

    display.textContent = currentInput;
  });
});
