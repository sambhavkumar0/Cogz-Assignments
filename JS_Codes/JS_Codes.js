const JS_Codes = {
  runQuestion(id) {
    switch (id) {
      case 1:
        console.log(this.reverseString("hello"));
        break;
      case 2:
        console.log(this.isPalindrome("racecar"));
        break;
      case 3:
        console.log(this.factorial(5));
        break;
      case 4:
        for (let i = 1; i <= 100; i++) {
          let output = "";
          if (i % 3 === 0) output += "Fizz";
          if (i % 5 === 0) output += "Buzz";
          console.log(output || i);
        }
        break;
      case 5:
        console.log(this.countChars("hello"));
        break;
      case 6:
        console.log(this.removeDuplicates([1, 2, 2, 3]));
        break;
      case 7:
        console.log(this.findMaxMin([5, 3, 8, 1]));
        break;
      case 8:
        console.log(this.bubbleSort([4, 2, 7, 1]));
        break;
      case 9:
        console.log(this.isAnagram("listen", "silent"));
        break;
      case 10:
        console.log(this.flatten([1, [2, [3, 4]], 5]));
        break;
      case 11:
        const debounced = this.debounce(() => console.log("Debounced!"), 500);
        debounced();
        break;
      case 12:
        const throttled = this.throttle(() => console.log("Throttled!"), 1000);
        throttled();
        break;
      case 13:
        console.log([1, 2, 3].myMap(x => x * 2));
        break;
      case 14:
        console.log(this.deepClone({ a: 1, b: { c: 2 } }));
        break;
      case 15:
        const c = this.counter();
        console.log(c());
        console.log(c());
        break;
      case 16:
        console.log(this.curry(1)(2)(3));
        break;
      case 17:
        console.log(this.firstNonRepeatingChar("aabbcdd"));
        break;
      case 18:
        console.log(this.arraysEqual([1, 2, 3], [1, 2, 3]));
        break;
      case 19:
        console.log(this.shuffle([1, 2, 3, 4]));
        break;
      case 20:
        console.log(this.toQueryString({ name: "John", age: 30 }));
        break;
      default:
        console.log("Invalid ID (1–20)");
    }
  },

  reverseString(str) { return str.split("").reverse().join(""); },
  isPalindrome(str) { return str === str.split("").reverse().join(""); },
  factorial(n) { return n <= 1 ? 1 : n * this.factorial(n - 1); },
  countChars(str) {
    const count = {};
    for (let char of str) count[char] = (count[char] || 0) + 1;
    return count;
  },
  removeDuplicates(arr) { return [...new Set(arr)]; },
  findMaxMin(arr) { return { max: Math.max(...arr), min: Math.min(...arr) }; },
  bubbleSort(arr) {
    for (let i = 0; i < arr.length; i++)
      for (let j = 0; j < arr.length - i - 1; j++)
        if (arr[j] > arr[j + 1]) [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
    return arr;
  },
  isAnagram(a, b) { return a.split('').sort().join('') === b.split('').sort().join(''); },
  flatten(arr) { return arr.flat(Infinity); },
  debounce(fn, delay) {
    let timer;
    return function (...args) {
      clearTimeout(timer);
      timer = setTimeout(() => fn.apply(this, args), delay);
    };
  },
  throttle(fn, delay) {
    let last = 0;
    return function (...args) {
      const now = Date.now();
      if (now - last > delay) {
        last = now;
        fn.apply(this, args);
      }
    };
  },
  deepClone(obj) { return JSON.parse(JSON.stringify(obj)); },
  counter() {
    let count = 0;
    return function () { return ++count; };
  },
  curry(a) {
    return function (b) {
      return function (c) {
        return a + b + c;
      };
    };
  },
  firstNonRepeatingChar(str) {
    for (let char of str) {
      if (str.indexOf(char) === str.lastIndexOf(char)) return char;
    }
    return null;
  },
  arraysEqual(a, b) {
    return a.length === b.length && a.every((val, i) => val === b[i]);
  },
  shuffle(arr) {
    for (let i = arr.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [arr[i], arr[j]] = [arr[j], arr[i]];
    }
    return arr;
  },
  toQueryString(obj) {
    return Object.entries(obj).map(([k, v]) => `${k}=${v}`).join("&");
  }
};

// Accept CLI argument
const questionId = parseInt(process.argv[2]);
if (!isNaN(questionId)) {
  JS_Codes.runQuestion(questionId);
} else {
  console.log("Usage: node JS_Codes.js <question_number> (1-20)");
}
