/*
Polymorphism: one thing many form

purpose: Method Reusability

Real time example:payment gateways, communication,Ola,Uber

Types
=========
1.Compiletime poly
2.Run time poly

js is interpreter based language

How to implement:
1.Method Overloading is not possible in polymorphism
2.Method Overriding is possible

*/



class Test{


print()
{
   console.log("Print1.......Hello");
    
}

print(fname)
{
   console.log("Print2.......Hello "+fname);
    
}
print()
{
    console.log("print3......Hello All");
    
}
}

let t1=new Test();
t1.print();


console.log("-------------Method Override-----");

class Fruit
{
    eat()
    {
        console.log("Enjoy....Fruit");
        
    }
}


class Mango extends Fruit
{
    //Override method
    eat()
    {
        console.log("Enjoy.Mango..Fruit");
        
    }


}
/*
Whenever two classes in relation and parent & child both 
the class have same name method with same syntax then
child class override parent class method

You will get updated method

*/

//parent object
let f1=new Fruit();
f1.eat();

//child object
let m1=new Mango();
m1.eat();//updated method






