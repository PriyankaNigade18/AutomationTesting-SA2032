

/*
playwright support two types of assertion
--------------------------------------
1.Hard assertion
2.Soft assertion

difference
---------------
Whenever Hard assertion fail it will stop the execution on that line and test will not execute
Whenever Soft assertion fail it will throw the error and continue the execution till the end of test case*
*/
import {test,expect} from '@playwright/test'

test("Test for Hard assertion",async ({page})=>{

await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//url validation
//using variable
let appUrl=await page.url();

//toBeTruthy(): Ensures that value is true in a boolean context
await expect(appUrl.includes("orangehrmlive")).toBeTruthy();

let expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//direct
await expect(page).toHaveURL(expUrl);//full match

await expect(page).toHaveURL(/orangehrmlive/);//partial match

//test the title
await expect(page).toHaveTitle("OrangeHRM");//full match

await expect(page).toHaveTitle(/HRM/);//partial match

//with variable
let appTitle=await page.title();

//validate
await expect(appTitle.includes("HRM")).toBeTruthy();

//for Webelement

let webelement=await page.getByPlaceholder("Username");

//weblement visibility

await expect(webelement).toBeVisible();


//webelement editable
await expect(webelement).toBeEditable();

//enter data
await webelement.fill("Priyanka");

//test for value

await expect(webelement).toHaveValue("Priyanka");

//tets for any attribute
await expect(webelement).toHaveAttribute("name")

//tets for any attribute with value
await expect(webelement).toHaveAttribute("name","username");
/*
let status1=await expect(webelement).toBeVisible().toBeTruthy();
let status2=await expect(webelement).toBeEditable().toBeTruthy();

//if element is visible and enabled then only type data
if(status1 && status2)
{
    await webelement.fill("Priyanka");
}
*/
//timeout
await page.waitForTimeout(1500);








})