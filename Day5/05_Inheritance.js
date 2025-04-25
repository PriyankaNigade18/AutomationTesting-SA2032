
/*

Inheritnace: Aquiring one class properties into other class is called inheritance

Purpose: 1.Avoid code duplication
        2.Reusability
        3.To acheive Runtime polymorphism

Real time example: Parent ---child relation

How to implement: using extends keyword

Parent can access only parent property
Child can access parent + child property

Types:
--------
1.Single level
2.Multi level
3.Hierarchical

Not for js
4.Multiple inheritance(Interface)--Java
5.Hybrid(Interface)--Java
*/


class Vehical
{
    testbreak()
    {
        console.log("Vehical.....break()");
        
    }
}


class Car extends Vehical
{

        start()
        {
            console.log("Car.....start()");
            
        }

        refule()
        {
            console.log("Car.....refule()");
            
        }

        stop()
        {
            console.log("Car.....stop()");
            
        }

}

class BMW extends Car //single level inheritance
{
    autoEngine()
    {
        console.log("BMW......autoEngine()");
        
    }
}


class Audi extends Car //Hierarchical inheritance
{
    autoGear()
    {
        console.log("Audi......autoGear()");
        
    }
}

console.log("------single level Car<------BMW");

//parent object--only parent class method call
console.log("------Parent Object--------");

let c1=new Car();
c1.start();////individual
c1.refule();//individual
c1.stop();//individual
//c1.autoEngine();
c1.testbreak();

console.log("------Child Object--------");

//child Object= Parent+ child
let b1=new BMW();
b1.start();//Inherited method
b1.refule();//Inherited method
b1.stop();//Inherited method
b1.autoEngine();//individual
b1.testbreak();

console.log("---------------Hierarchical inheritance-------");

let a1=new Audi();
a1.start();//Inherited method
a1.stop();//Inherited method
a1.refule();//Inherited method
a1.autoGear();//individual
a1.testbreak();










