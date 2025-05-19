
import {test,expect} from '@playwright/test';

test("Validate current status of check box",async({page})=>{

await page.goto("https://the-internet.herokuapp.com/checkboxes");

//checkbox 1 should not is selected
let status1=await page.locator("//input[@type='checkbox']").first().isChecked();
console.log("Current status for first checkbox: "+status1);//false

let status2=await page.locator("//input[@type='checkbox']").last().isChecked();
console.log("Current status for last checkbox: "+status2);//true

//checkbox 1 should not is selected

await expect(await page.locator("//input[@type='checkbox']").first()).not.toBeChecked();

//checkbox2 should be selected
await expect(await page.locator("//input[@type='checkbox']").last()).toBeChecked();


})

test.only("Test for radio button",async ({page})=>{

await page.goto("https://www.letskodeit.com/practice");

let bmwButton=await page.locator("#bmwradio");

//it should not be checked
await expect(bmwButton).not.toBeChecked();

await bmwButton.check();

//pause
await page.waitForTimeout(2000);

await expect(bmwButton).toBeChecked();


})


