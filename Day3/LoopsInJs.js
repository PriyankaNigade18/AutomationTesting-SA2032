/*
1.for loop:Number of iterations are known


2.while loop:Entry control loop: Number of iterations are not known


3.dowhile:Exit control loop: For one time execution without matter 
what status of condition

*/

console.log("-------for loop------------");

//Print Hello statement 5 times

for(let i=1;i<=5;i++)
{
   console.log("Hello");
    
}

console.log("-------------");
//print 1 to 10 numbers
for(let i=1;i<=10;i++)
{
    console.log(i);
    
}
console.log("-------------");
//print 10 to 1
for(let i=10;i>=1;i--)
{
    console.log(i);
    
}

console.log("-------------");
//factorial code
//5!=5*4*3*2*1=120

let fact=1;
for(let i=5;i>=1;i--)
{
fact=fact*i;
}

console.log("Factorial of number 5 is: "+fact);

console.log("---------------");
/*
If their is no condition in loop by default condition is true
this loop execute infinite time


for(;;)
{
    console.log("Hi");
    
}
*/

console.log("------------While loop-------");

//Sum of 100 natural numbers=5050 

let i=1;
let sum=0;
while(i<=100)
{
    sum=sum+i;
    i++;
}

console.log("Sum of 100 natural numbers is: "+sum);

console.log("---------------");

let j=1;
while(j<=10)
{
    console.log("Welcome");
    j++;
}

console.log("---------------dowhile--------");

let k=1;

do{
    console.log("Bye All");
    k++;
    
}while(k<=10);

console.log("------------break & continue-----------");
/*
break: terminate any switch and loop body

continue:  when condition is true it will skip the scenario
and it will continue

*/

for(let i=1;i<=10;i++)
{
    if(i>=5)
    {
        break;
    }else
    {
        console.log(i);
        
    }
}

console.log("--------------");

for(let i=1;i<=10;i++)
    {
        if(i===5)
        {
            continue;
        }else
        {
            console.log(i);
            
        }
    }






































