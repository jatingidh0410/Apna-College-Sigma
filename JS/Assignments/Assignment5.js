// Qs1. Function to return array elements larger than a number
function largerThan(arr, num) {
    let result = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > num) {
            result.push(arr[i]);
        }
    }
    return result;
}

// Example:
console.log(largerThan([3, 8, 12, 5, 10], 7)); // Output: [8, 12, 10]

//Qs2. Function to extract unique characters from a string
function uniqueChars(str) {
    let unique = "";
    for (let i = 0; i < str.length; i++) {
        if (!unique.includes(str[i])) {
            unique += str[i];
        }
    }
    return unique;
}

// Example:
console.log(uniqueChars("abcdabcdefgggh")); // Output: "abcdefgh"

//Qs3. Function to return the longest country name
function longestCountryName(countries) {
    let longest = "";
    for (let i = 0; i < countries.length; i++) {
        if (countries[i].length > longest.length) {
            longest = countries[i];
        }
    }
    return longest;
}

// Example:
console.log(longestCountryName(["Australia", "Germany", "UnitedStatesofAmerica"])); 
// Output: "UnitedStatesofAmerica"

//Qs4. Function to count the number of vowels in a string
function countVowels(str) {
    let count = 0;
    let vowels = "aeiouAEIOU";
    for (let i = 0; i < str.length; i++) {
        if (vowels.includes(str[i])) {
            count++;
        }
    }
    return count;
}

// Example:
console.log(countVowels("Hello World")); // Output: 3


//Qs5. Function to generate a random number within a range
function randomInRange(start, end) {
    return Math.floor(Math.random() * (end - start + 1)) + start;
}

// Example:
console.log(randomInRange(5, 15)); // Output: random number between 5 and 15