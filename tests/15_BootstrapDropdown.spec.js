
import {test,expect} from '@playwright/test';

test("Test for dynamic dropdown",async({page})=>{

await page.goto("https://www.makemytrip.com/");
//close the popup
await page.locator("span.commonModal__close").click();

//from dropdown
await page.locator("#fromCity").click();

await page.getByPlaceholder("From").fill("Pune");

await page.waitForTimeout(2000);

let allOptions=await page.locator("//ul[@class='react-autosuggest__suggestions-list']//li").all();

for(let option of allOptions)
{
    console.log(await option.textContent());
    let value=await option.textContent();
    if(value.includes("Shirdi"))
    {
        await option.click();
        break;
    }
}

await page.waitForTimeout(1000);

})