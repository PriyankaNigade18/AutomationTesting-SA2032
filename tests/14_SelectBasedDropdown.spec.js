
import {test,expect} from '@playwright/test';

test('Test for select tag based dropdown',async ({page})=>{

await page.goto("https://www.facebook.com/");

await page.waitForTimeout(2000);
//await page.getByRole("link",{name:"Create new account"}).click();

await page.locator("//a[text()='Create new account']").click();

await page.waitForTimeout(2000);

//visible text,label,value,index

//month
await page.locator("#month").selectOption("Apr");//by visibile text
await page.waitForTimeout(2000);

await page.locator("#month").selectOption({label:"Sep"})//by label
await page.waitForTimeout(2000);

await page.locator("#month").selectOption({value:"12"})//by value
await page.waitForTimeout(2000);

await page.locator("#month").selectOption({index:5});//By index
await page.waitForTimeout(2000);

})