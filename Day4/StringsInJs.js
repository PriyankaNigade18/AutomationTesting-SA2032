
//String is immutable
let message="hello";
console.log(message);//hello
message[0]="H";
console.log(message);


console.log("------------------Methods----------------------");

//length it is property
message = "Hello Everyone";
console.log(message);
console.log("Total number of character:lenght(): "+message.length);

//toUpperCase() toLowerCase()
console.log(message.toLowerCase());
console.log(message.toUpperCase());

//trim():ignore white space before and after from string
let data="   welcome All     ";
console.log(data);
console.log(data.trim());

//to get character from specif index charAt(index);
let info="Selenium WebDriver is WebUi automation library";
console.log("character at index 9: "+info.charAt(9));//W

//concat()
let s1="Hello";
let s2="All";
let s3="do testing";
console.log(s1.concat(s2));
console.log(s1.concat(" "+s2));

let result=s1.concat(" "+s2).concat(" "+s3);
console.log(result);

//replace()
let finalResult=result.replace("All","****");
console.log(finalResult);

//includes()
console.log("Check for testing?: "+result.includes("testing"));

console.log("Check for selenium?: "+result.includes("selenium"));

//split():
let tools="Selenium,Appium,Postman,cypress,playwright";
console.log(tools);

console.log("---------------");

//split single value
let value=tools.split(",")[3];
console.log(value);

console.log("---------------");

//full split

let arr=tools.split(",");


for(let e of arr)
{
    console.log(e);
    
}

console.log("------------------");


console.log(tools.substring(0,3));





























