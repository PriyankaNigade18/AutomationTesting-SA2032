
/*
Encapsulation is wrapping of data and function together
in a single unit

purpose: datahiding

real time example: Capsule

How to implement: using local scope and getters ,setters we can implement

*/


class Employee
{
    constructor()
    {
        //data hiding is possible using local scope
        let salary;//local

        this.empId=101;
    }


    //setters
    setSalary(salary)
    {
        this.salary=salary;

    }

    //getters
    getSalary()
  {
    return this.salary;
  }

    //business logic
    print()
    {
        console.log(this.empId);//global data
        //console.log(salary);//local//ReferenceError: salary is not defined
        
        console.log("Salary is: "+this.getSalary());
    }

}

//object
let e1=new Employee();
e1.setSalary(678898776);

e1.print();