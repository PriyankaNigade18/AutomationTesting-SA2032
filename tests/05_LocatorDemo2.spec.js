
/*
CssSelector
============
1.tagname with id
-----------------
tagname#id

2.tagname with attribute
-----------------------------
tagname[attribute='value']

3.tagname with className
---------------------
tagname.className


parent to child
-----------------
parent element > child element


parent child with index:neth-child(index)
---------------------------------
parentele>childele:nth-child(index)

*/
import {test,expect} from '@playwright/test'



test("Test application using cssSelector",async({page})=>{


        await page.goto("https://tutorialsninja.com/demo/index.php?route=account/login");

        let appUrl=await page.url();
        console.log("Application url is: "+appUrl);

        let appTitle=await page.title();
        console.log("Application title is: "+appTitle);

        //email
    await page.locator("input#input-email").fill("test24@gmail.com");

        //password
    await page.locator("input[type='password']").fill("test123");

        //login
    await page.locator("input.btn-primary").click();

    //timeout
    await page.waitForTimeout(1500);

    //validation
    let exp="https://tutorialsninja.com/demo/index.php?route=account/account";


    await expect(page).toHaveURL(exp);//full match

    //partial match: regularexpression : /expected string/
    await expect(page).toHaveURL(/account/);

    


})

