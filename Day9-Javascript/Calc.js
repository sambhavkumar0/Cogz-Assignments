function calculate(num1, num2, operator) {
  let result;

  switch (operator) {
    case '+':
      result = num1 + num2;
      break;

    case '-':
      result = num1 - num2;
      break;

    case '*':
      result = num1 * num2;
      break;

    case '/':
      if (num2 === 0) {
        return "Error: Division by zero";
      }
      result = num1 / num2;
      break;

    default:
      return "Invalid operator";
  }

  return result;
}
let num1 = parseFloat(prompt("Enter first number:"));
let num2 = parseFloat(prompt("Enter second number:"));
let operator = prompt("Enter operator (+, -, *, /):");

let result = calculate(num1, num2, operator);
alert("Result: " + result);
