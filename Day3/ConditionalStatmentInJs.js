/*
1. simple if(true)
2. if-else (true/false) 
3. ladder if(validate multiple conditions)
4. Nested if(validate multiple conditions)
5. switch case(validate multiple conditions)

*/
console.log("-----simple If (true)------");
//year validation
let year=2025;

if(year === 2025)
{
    console.log("Current year matched:"+year);
    
}

console.log("----simple if fail scenario----");

year=2026;

if(year === 2025)//fail
{
    console.log("current year matched..."+year);
    
}

console.log("Fail!");

console.log("------If-else(true/false)----");
//age validation for voating age>=18

let age=20;

if(age>=18)
{
    console.log("You are adult!..You can voat!");
    
}else{
    console.log("You are teanager!..You can't voat!");
}

console.log("-----ladderif(multiple condition)--------");
/*
scenario: for given number check number is positive,negative or its 0
*/

let num=0;

if(num>0)
{
    console.log(num+" is positive");
    
}else if(num<0)
{
    console.log(num+" isNegative");
}else
{
    console.log(num+" is matching to 0");
}

console.log("----Nested if(Multiple condition testing)");

/*
Scenario: based on marks provide grade
marks>=90--------A
marks>=95-------A++
otherwise -------B
*/

let marks=92;

if(marks>=90)
{
    if(marks>=95)
    {
        console.log("A++");
        
    }else
    {
        console.log("A")
          
    }
}else{
    console.log("B");
    
}

console.log("-----Real time scenario-----");

let bname="firefox";

if(bname === "chrome")
{
    console.log("Test case is executing on "+bname);
    
}else if(bname === "edge")
{
    console.log("Test case is executing on "+bname);
}else if(bname === "firefox")
{
    console.log("Test case is executing on "+bname);
}else{
    console.log("wrong browser for testing");
    
}





console.log("----Switch case-(Key = value)------");

//traffic lights 

let color="green";

switch (color)
 {
    case "red":
        console.log("STOP");
        break;

        case "yellow":
        console.log("READY");
        break;

        case "green":
        console.log("GO");
        break;

    default:
      
        console.log("Wrong color!");
        
}

console.log("-------------");
//role validation

let role="qa";

switch (role) {
    case "admin":
        console.log("Admin user can access everything!");
        
        break;

        case "editor":
        console.log( "user have editor role");
        
        break;

        case "viewer":
        console.log("User can have read only access");
        
        break;

    default:
        console.log("Wrong role!");
        
        break;
}































































