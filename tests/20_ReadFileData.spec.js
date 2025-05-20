
import {test,expect} from '@playwright/test';

let data=require("./TestData/Data.json");

test("Reading data from file",async({page})=>{

    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    await page.getByPlaceholder("Username").fill(data.un);
    await page.getByPlaceholder("Password").fill(data.pass);

})
