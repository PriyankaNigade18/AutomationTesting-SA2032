
import {test,expect} from '@playwright/test'

test("Test Title and Url of Google",async({page})=>{

    //launch google application
    await page.goto("https://www.google.com/");

    //get current url of application: url()
    const actUrl= await page.url();
    console.log("Application url is: "+actUrl);

    //validation for url
    await expect(page).toHaveURL("https://www.google.com/");

    //get current page title: title()
    const actTitle= await page.title();
    console.log("Application title is: "+actTitle);

    //validate title: expect()
    await expect(page).toHaveTitle("Google");


})






