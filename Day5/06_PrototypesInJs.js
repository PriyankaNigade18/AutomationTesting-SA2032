/*
Proptotypes in Js is an Object
It is used to create reusable property and method in js

*/

class Employee
{
    constructor(id,fname)
    {
       this.id=id;
        this.fname=fname;
    }

    
}

//design prototype for reusable property(variable)
Object.prototype.language="Javascript";

//object
let e1=new Employee(101,"Sarang");
//e1.language="Javascript";
console.log("empid: "+e1.id+": "+"empname: "+e1.fname+": language is: "+e1.language);

let e2=new Employee(201,"Shweta");
console.log("empid: "+e2.id+": "+"empname: "+e2.fname+": language is: "+e2.language);

console.log("------------------Reusable method-------");

let sname="Kiran            ";
console.log("total character length: "+sname.length);//17
console.log("true length of string: "+sname.trim().length);


//designe new prototype for String class
String.prototype.trueLength=function()
{
    return this.trim().length;
}

console.log("Using prototype true length is: "+sname.trueLength());
