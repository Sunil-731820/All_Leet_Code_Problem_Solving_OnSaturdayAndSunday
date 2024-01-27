/**
 * 
 */

 let person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30
};

console.log(person); // Output: { firstName: 'John', lastName: 'Doe', age: 30 }

// Deleting the 'age' property from the object
delete person.age;

console.log(person); // Output: { firstName: 'John', lastName: 'Doe' }
