
/*
Javascript objects are key and value pair information

Ways
-----------
1.Using Object literal
2.Using class level
3.Using Constructor Function
4.Object.create():prototype based
*/

console.log("-------Object Literal-----------");

let Person=
{
    id:101,
    fname:"Pooja",
    job:"QA"
}

console.log(Person);//{ id: 101, fname: 'Pooja', job: 'QA' }

console.log("type is : "+typeof Person);//object

//how to get any single key value
console.log("for key job value is: "+Person.job);

console.log("for key id value is: "+Person.id);

console.log("---------for...in loop-------");
//in Object it will iterate only keys

for(let e in Person)
{
    console.log(e);//keys
    
}

console.log("----------------------");


for(let e in Person)
{
    console.log("At Key "+e+" : value is: "+Person[e]);
    
}
/*
console.log("------------");
//for..of loop is not applicable for object
//TypeError: Person is not iterable
for(let e of Person)
{
    console.log(e);
    
}
    */

console.log("--------------Class Level Object-------");

class Color
{
    constructor(cname)
    {
        //gobal declaration for data
        this.cname=cname;
    }

    print()
    {
        console.log(`color selected is: ${this.cname}`);
        
    }

}
//object create
let obj=new Color("Blue");
obj.print();

console.log("-------------Constructor Function---------");

function StudentData(id,fname,subject)
{

    //data
    this.id=id;
    this.fname=fname;
    this.subject=subject;

    //method/Anonymous function
    this.show=function()
    {
        console.log("Student data is: "+this.id+" : "+this.fname+" : "+this.subject);
    }


}

//object
let s1=new StudentData(101,"Kirti","testing");
s1.show();

console.log("----------------Using Object.create()---------");

//prototype
let Test=
{
    subject:"testing",
    marks:90

}

//object
//Creates an object that has the specified prototype or that has null prototype.
let obj2=Object.create(Test);
console.log("Subject is:"+obj2.subject);
console.log("Marks is: "+obj2.marks);































