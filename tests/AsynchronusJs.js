/*
//synchronus 
console.log("Program Start........");

for(let i=1;i<=5;i++)
{
    console.log(i);
}

console.log("Program ends........");


//asynchronus

console.log("Program Start........");

setTimeout(() => {console.log("Timeout is 2sec");},2000);

console.log("Program ends........");
*/

function makePizza()
{
    return new Promise(resolve=>{
        setTimeout(()=>resolve("Pizza is ready!"),2000)
    })
}

//async function return promise
async function orderPizza()
{
    console.log("waiting.......");
   const pizza= await makePizza();
   console.log(pizza);

}

orderPizza();