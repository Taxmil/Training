let student = {
    name: "John Doe",
    age: 20,
    grade: "A",
    displayInfo: function () {
        console.log(`Name: ${this.name}, Age: ${this.age}, Grade: ${this.grade}`);
    }
};


console.log(student.name); 
console.log(student.age);  
console.log(student.grade); 
student.displayInfo();      

student.address = {
    city: "New York",
    country: "USA"
};

student.updateGrade = function (newGrade) {
    this.grade = newGrade;
    console.log(`Grade updated to: ${this.grade}`);
};

student.getAddress = function () {
    console.log(`City: ${this.address.city}, Country: ${this.address.country}`);
};

console.log(student.address.city); 
console.log(student.address.country); 

student.updateGrade("A+");  
student.getAddress();  

delete student.age;          
delete student.getAddress;   

console.log(student); 

student.displayInfo(); 
