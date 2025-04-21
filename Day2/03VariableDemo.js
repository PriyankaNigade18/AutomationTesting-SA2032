/*

Variable is a name of storage location

1.var(older and not recommended)
----------------------------
    1.scope: Functional + Global
    2.Redeclaration is Allowed


Modern Js
-------------
Blocked scoped is allowed for let and const type
{
//blocked scope
}
2.let 
---------
    1.Scope: Blocked + Global
    2.Redeclaration is not allowed
    3.let are mutable


3.const(final keyword in java)
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

//Functaional scope:anything you write within a function is called functional scope
//We can access data within a function only

function display()
{
    console.log("------Variables called by functional scope------");
    
    let appName="GoogleApp";
    var appDomain="SearchEngine";
    const vendor="Google"

    console.log(`AppName is: ${appName}`);
    console.log(`App Domain is: ${appDomain}`);
    console.log(`Vendor name is: ${vendor}`);
      
}

//call function
display();
console.log("------Variables outside functional scope------");
//ReferenceError: appName is not defined

//console.log(`AppName is: ${appName}`);
//console.log(`App Domain is: ${appDomain}`);
//console.log(`Vendor name is: ${vendor}`);

//Blocked scope {} let and const


if(true)
{
    console.log("-----Calling from blocked scope-----");
    
    const bname="Chrome";
    let version=113;
console.log(`browser name is: ${bname}`);
console.log(`browser version is: ${version}`);


}


console.log("-----Calling from outside blocked scope-----");
//ReferenceError: bname is not defined
//console.log(`browser name is: ${bname}`);
//ReferenceError: version is not defined
//console.log(`browser version is: ${version}`);


console.log("-----------Redeclaration Way---------");

//var : redeclaration is allowed,Reassignment allowed
var data="programming";
var data="testing";
var data=45678;
var data="##$%%^";

//reassignment
data="automation testing";
console.log(data);

//let and const : redeclaration not allowed

//Cannot redeclare block-scoped variable 'newStatus'.
let newStatus=true;
//let newStatus=false;
console.log("status: "+newStatus);//true
newStatus=false;
console.log("status: "+newStatus);//false

//Cannot redeclare block-scoped variable 'pi'
const pi=3.14;
//const pi=986.67;
//reassignment
//pi=988.77;//error: TypeError: Assignment to constant variable.

console.log(pi);

/*Hoisting In Javascript(interview)
In javascript before declaration of any variable you can call 
the variable
applicable to onlyb var type
let and cost are not hoisted

In javascript before declaration of any function you can call 
the function

applicable to only function declartion
for function expression it is not applicable (not hoisted)
*/


//variables
//var are hoisted
console.log(startAgile);//undefined


//declaring ,initializing
var startAgile="Organization";

console.log(startAgile);//Organization


//let & const are not hoisted

//ReferenceError: Cannot access 'num1' before initialization
//console.log(num1);//error

let num1=90;
console.log(num1);//90;

//ReferenceError: Cannot access 'empName' before initialization
//console.log(empName);//error

const empName="Sarang";
console.log(empName);

//Functions hoisted concept

add()

function add()
{
    console.log("add function is calling.......");
    
}

//call function
//sub();//ReferenceError: Cannot access 'sub' before initialization

//annomyous function
let sub= function()
    {
    console.log("sub function is calling......");

    }


//call function
sub();


















