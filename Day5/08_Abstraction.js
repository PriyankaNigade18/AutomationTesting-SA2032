/*
Data abstraction is process of hiding internal details of software and provide
relevant features to the user
In Js Abstraction is possible with the scope
*/


function Employee(id,fname,basicSal)
{
    //data
this.id=id;
this.fname=fname;
this.basicSal=basicSal;
//global-->local
//this.bonus=10000;
let bonus=10000;

//Global--->local(let)
// this.calculateBonus=()=>{
//      let finalSal=this.basicSal+this.bonus;
//      console.log("After adding bonus total amount: "+finalSal);
     
// }

let calculateBonus=()=>{
    let finalSal=this.basicSal+bonus;
    console.log("After adding bonus total amount: "+finalSal);
    
}


    this.display=function()
    {
    console.log("Employee id: "+this.id+" : "+"Employee name: "+this.fname);
    calculateBonus();
}

}

//object
let e1=new Employee(101,"Sneha",70000);
e1.display();

// e1.bonus=50000;
// e1.calculateBonus();
//e1.display();


