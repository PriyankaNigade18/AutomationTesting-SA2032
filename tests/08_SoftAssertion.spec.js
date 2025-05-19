import {test,expect} from '@playwright/test'

test("Test for Hard assertion",async ({page})=>{

await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//url validation
//using variable
let appUrl=await page.url();

//toBeTruthy(): Ensures that value is true in a boolean context
await expect.soft(appUrl.includes("orangehrmlive")).toBeTruthy();

let expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//direct
await expect.soft(page).toHaveURL(expUrl);//full match

await expect.soft(page).toHaveURL(/orangehrmlive1234/);//partial match

//test the title
await expect.soft(page).toHaveTitle("OrangeHRM");//full match

await expect.soft(page).toHaveTitle(/HRM/);//partial match

//with variable
let appTitle=await page.title();

//validate
await expect.soft(appTitle.includes("HRM")).toBeTruthy();
})