
import {test,expect} from '@playwright/test';

test("Test for file upload",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/upload");

    await page.locator("#file-upload").setInputFiles("tests/Files/Appiumsetup.txt");

    await page.waitForTimeout(2000);
    await page.locator("#file-submit").click();

    //validate
    await expect(await page.locator("//h3")).toHaveText("File Uploaded!");


})