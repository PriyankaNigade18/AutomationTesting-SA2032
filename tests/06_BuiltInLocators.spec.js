
import {test,expect} from '@playwright/test'

test("Test for build in locators",async({page})=>{

    await page.goto("https://automationplayground.com/crm/");

    //sign in:getByRole()
    await page.getByRole('link',{name:'Sign In'}).click();

    //email:getByPlaceholder()
    await page.getByPlaceholder("Enter email").fill("test@gmail.com");

    //password by label: visible text
    await page.getByLabel("Password").fill("test123");

    //chechbox:getByRole()
    await page.getByRole('checkbox',{name:'Remember me'}).check();

    //submit button: getByRole()
    //await page.getByRole('button',{name:'Submit'}).click();

    //submit button : getByText()
    await page.getByText("Submit").click();






  await page.waitForTimeout(1500);
})