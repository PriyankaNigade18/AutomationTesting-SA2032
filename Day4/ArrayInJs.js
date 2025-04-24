
/*
Array is Static data structure and it stores similar type of elements
and different type of elements also
*/

let sid=[101,102,103,104,105];
console.log(sid);
console.log("Length of array is: "+sid.length);
console.log("value at index 3: "+sid[3]);//104
console.log("value at index 9 wrong index: "+sid[9]);//undefined

console.log("-------Ietration using for loop-------- ");

for(let i=0;i<sid.length;i++)
{
console.log(sid[i]);

}


let arr=[101,"sarang",987765543,89.78];
console.log(arr);

console.log("-------Ietration using for...of  loop-------- ");
/*
To iterate any array and Object these two special types of loop available
---------------------------------------
for...of loop:Iterates over the values It is applicable to array

for...in loop:Iterates over indexs/keys, It is applicable for Object

*/
//it will print all values
for(let e of sid)
{
    console.log(e);
    
}

console.log("-------Ietration using for...in  loop-------- ");
//it will print all indexes
for(let e in sid)
{
    console.log(e);
    
}

console.log("----------------");
for(let e in sid)
{
    console.log("at index: "+e+": value is: "+sid[e]);
    
}
console.log("-----------array Methods--------");

let color=["Red","Pink","Orange","Blue"];
console.log(color);//[ 'Red', 'Pink', 'Orange', 'Blue' ]

console.log("Length of original array: "+color.length);

/*
To add element at the begining and at the end in array
push() and unshift()
*/
//push():Appends new elements to the end of an array, and returns the new length of the array.
let lenghtOfNewArray=color.push("Black");//[ 'Red', 'Pink', 'Orange', 'Blue', 'Black' ]
console.log("length of after push(): "+lenghtOfNewArray);
console.log(color);

//unshift():nserts new elements at the start of an array, and returns the new length of the array.
color.unshift("White");
console.log(color);//[ 'White', 'Red', 'Pink', 'Orange', 'Blue', 'Black' ]

/*
To remove element from the begining and last position then in Js
pop() and shift()
*/
//pop():Removes the last element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
let removedEle=color.pop();//[ 'White', 'Red', 'Pink', 'Orange', 'Blue' ]
console.log("color removed: "+removedEle);//black

console.log(color);

//shift():Removes the first element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
color.shift();

console.log(color);//[ 'Red', 'Pink', 'Orange', 'Blue' ]

console.log("-----------------------");

let empName=["Ravi","Kiran","Pooja","Sarang","Jay"];
console.log(empName);//[ 'Ravi', 'Kiran', 'Pooja', 'Sarang', 'Jay' ]



//indexOf():Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
let indexValue=empName.indexOf("Pooja");
console.log("Pooja index position: "+indexValue);//2

//adding same element in array
empName.unshift("Pooja");
console.log(empName);//[ 'Pooja', 'Ravi', 'Kiran', 'Pooja', 'Sarang', 'Jay' ]

console.log("Pooja first occurrence index is: "+ empName.indexOf("Pooja"));

// second occurrence
console.log("Pooja  second occurrence index is: "+empName.indexOf("Pooja",1));//3

console.log("--------------------");

//splice():Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
//start index and delete count, replacement elemenet
//[ 'Pooja', 'Ravi', 'Kiran', 'Pooja', 'Sarang', 'Jay' ]
//    0         1       2      3         4         5
//empName.splice(2,1);//strats by 2 index and delete 1 element: Kiran

empName.splice(2,1,"Teja");//strat by 2 index and delete 1 element: kiran and replace Teja
console.log(empName);//[ 'Pooja', 'Ravi','Teja', 'Pooja', 'Sarang', 'Jay' ]


empName.splice(0,2,"Abhi");//Starting from 0th position it removes 2 elements and add Abhi

console.log(empName);//[ 'Abhi', 'Teja', 'Pooja', 'Sarang', 'Jay' ]

console.log("--------------------");
//slice():Returns a copy of a section of an array. For both start and end, a negative index can be used to indicate an offset from the end of the array. For example, -2 refers to the second to last element of the array.
console.log(empName);//[ 'Abhi', 'Teja', 'Pooja', 'Sarang', 'Jay' ]

let newArray=empName.slice(2,4); //strat by 2 but end index -1(4-1) at 3rd position
console.log(newArray);//[ 'Pooja', 'Sarang' ]

console.log(empName);//[ 'Abhi', 'Teja', 'Pooja', 'Sarang', 'Jay' ]

//includes():Determines whether an array includes a certain element, returning true or false as appropriate.
console.log("Check for Jay?: "+empName.includes("Jay"));//true
console.log("Check for Priyanka?: "+empName.includes("Priyanka"));//false

console.log("---------------Multi D array----------------");

let loginData=[["Jay","Jay123"],["Kiran","kiran123"],["Smita","smita123"]];

console.log("Total number rows: "+loginData.length);//rows=3
console.log("total number of columns are: "+loginData[0].length);//cells=2

console.log(loginData);

console.log('--------------');

for(let e of loginData)
{
    console.log(e);
    
}

//get the single data from multi d array
console.log(loginData[1][0]);































