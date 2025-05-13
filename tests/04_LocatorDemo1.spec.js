

/*
Xpath: xpath is path of the element from html/xml file

Types: 1.Absolute 2.Relative

Syntax
======
//tagname[@attribute='value']

functions
==============
1.text() 2.normalize-space() 3.contains() 4.starts-with()

xpath axies
=============


*/
import {test,expect} from '@playwright/test'

test("Test for Locator xpath",async({page})=>{

    await page.goto("https://www.saucedemo.com/");

    //username: enter the data fill() type()

    await page.locator("//input[@id='user-name']").fill("standard_user");
    //await page.waitForTimeout(1500);
    // await page.fill("//input[@id='user-name']","standard_user");
    // await page.waitForTimeout(1500);
    
    //password

    await page.locator("//input[@placeholder='Password']").fill("secret_sauce");

    //login button
    await page.locator("//input[@type='submit']").click();

    //assert the next page url 
    await expect(page).toHaveURL("https://www.saucedemo.com/inventory.html");


})