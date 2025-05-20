
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


test.only("Select based dropdown for list of elements",async({page})=>{

    await page.goto("https://www.facebook.com/");

    await page.waitForTimeout(2000);


    await page.locator("//a[text()='Create new account']").click();

    await page.waitForTimeout(2000);

    let months=await page.locator("//select[@id='month']//option").all();

    console.log("Total Months are: "+months.length);

    for(let option of months)


    {
        let monthtext=await option.textContent();
        console.log(monthtext);

        if(monthtext.includes("Sep"))
        {
            
            //await option.click();
            await months.selectOption(monthtext);
              
            break;
        }


    }

    await page.waitForTimeout(2000);



})












