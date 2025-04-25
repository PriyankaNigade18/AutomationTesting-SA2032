
/*Function is group of statements we are writing to perform certain action
    Methods in js is belong to the object

*/
class Student
{

    //it is used to initialize object
constructor(id)
{
    this.id=id;
}


     /* setData(id)
    {
        console.log("---data is set-----");
        //local scope
        //let id=101;
        //To create Global data for a class we use this keyword
        //this is refered current class object
        //this.id=101;//global data//hard code data

        this.id=id;
        
    }
    */
    getData()
    {
        //console.log("student id is: "+id);//ReferenceError: id is not defined
        console.log("student id is: "+this.id);//calling global data
    }

}

//outside the class and create Object to access member of class
let s1=new Student(1010);
//s1.setData(1010);
s1.getData();

console.log("----------");

let s2=new Student(2020);
//s2.setData(2020);
s2.getData();