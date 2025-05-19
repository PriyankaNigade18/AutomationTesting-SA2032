

import {test,expect} from '@playwright/test';

test("Test for total links from Orangehrm application",async({page})=>{

await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//pause
await page.waitForTimeout(2000);

//let allLinks=await page.$$("a");

let allLinks=await page.locator("a").all();
console.log("Total links are: "+allLinks.length);//5

//iterate
for(let link of allLinks)
{
    console.log("Text is: "+await link.textContent());
    console.log("Attribute value is: "+ await link.getAttribute("href"));
}

});


test("Google search scenario",async({page})=>{

    await page.goto("https://www.google.com/");

    

    //search
    await page.locator("textarea#APjFqb").fill("Javascript");
    await page.waitForTimeout(2000);

    let allOptions=await page.locator("(//ul[@class='G43f7e'])[1]//li//div[@class='wM6W7d']//span").all();

    for(let option of allOptions)
    {
        console.log(await option.textContent());
    }



})










test.only("Test for nth() option",async ({page})=>{


await page.goto("https://tutorialsninja.com/demo/index.php?route=account/register");

let ele3=await page.locator("//div[@class='list-group']//a").nth(2);//from 13 elements get the 3rd element

await ele3.click();

await page.waitForTimeout(2000);

})







