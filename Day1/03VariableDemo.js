/*

Variable is a name of storage location

1.var(older and not recommended)
----------------------------
    1.scope: Functional + Global
    2.Redeclaration is Allowed


Modern Js
-------------
2.let 
---------
    1.Scope: Blocked + Global
    2.Redeclaration is not allowed
    3.let are mutable


3.const
-------------
    1.Scope: Blocked + Global
    2.Redeclaration is not allowed
    3.const are Immutable

*/


//Global scope: Everywhere you can call

let id=101;
var fname="Hiteshi";
const cname="AISSPMS";

console.log("*****Calling from Global scope******");
console.log("id is: "+id);
console.log("fname is: "+fname);
console.log("cname is: "+cname);

//function declartion
function show()
{
    console.log("Calling global data from function");
    console.log("id is: "+id);
    console.log("fname is: "+fname);
    console.log("cname is: "+cname);
    
}

//function calling
show();
















