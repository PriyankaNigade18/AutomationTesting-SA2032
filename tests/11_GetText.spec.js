

import {test,expect} from '@playwright/test';

test("Test for capturing text of element",async({page})=>{

    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    //username
    //await page.getByPlaceholder("Username").fill("Admin");
    let un=await page.getByPlaceholder("Username");

    await un.fill("Admin");
    await page.waitForTimeout(2000);
    await un.clear();
    await un.fill("Admin");


    //password
    await page.getByPlaceholder("Password").fill("admin1234");

    //login
    await page.locator("//button[@type='submit']").click();

    //errormessage:textContent()
    let message=await page.locator("//p[contains(@class,'oxd-alert-content-text')]").textContent();

    console.log("Error message: "+message);

    //assertion
    await expect(await page.locator("//p[contains(@class,'oxd-alert-content-text')]")).toHaveText("Invalid credentials");

})
