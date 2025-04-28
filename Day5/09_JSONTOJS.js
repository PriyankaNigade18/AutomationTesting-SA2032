/*

Conversion of JSON object to Javascript Object
*/

let testData=`{
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral",
        "text": "Tired of writing endless social media content? Let Content Caddy generate it for you."
    }
}`;
//for conversion JSON.parse()
let jsObj=JSON.parse(testData);

//jsObject validate Json body
//id=2

console.log("Id is: "+jsObj.data.id);

// "first_name": "Janet",
console.log("firstname is: "+jsObj.data.first_name);
