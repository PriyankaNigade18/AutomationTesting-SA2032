
/*
Call Back function/Higher order Function
------------------------------------------

Whenever we are passing function as parameter to any other function
then that passing function is called Call back function or higher order function

*/


//main
function greet(fname,callbackfun)
{
console.log("Hello "+fname);
//calling function
callbackfun();

}

//callbackfunction/higher order function
function display()
{
console.log("Welcome to learn call back function.....");

}


//call greet()
greet("Jay",display);
//while passing function as argument dont add () just write a name


console.log("---------------------");

function add(a,b)
{
return a+b;
}

function mul(a,b)
{
return a*b;
}
function div(a,b)
{
return a/b;
}
function sub(a,b)
{
return a-b;
}

function calculate(a,b,fun)
{
    let res=fun(a,b);
    return res;
}


//calling
console.log("Addition is: "+calculate(100,200,add));
console.log("Multiplication is: "+calculate(10,2,mul));







