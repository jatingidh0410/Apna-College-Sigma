// Q: For the given stats of an array , change it to final form using splice.
let months = ['january','july','march','august'];
months.splice(0,2,'july','june');
console.log(months);

// Q2 : return the index of the "javascript" from the given array,if it was reversed.
let languages = ['c','c++','html','javascript','python','java','c#','sql'];
console.log("Reversed index of javascript is:",languages.reverse().indexOf("javascript"));