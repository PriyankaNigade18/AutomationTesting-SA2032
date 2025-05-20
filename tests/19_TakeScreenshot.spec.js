
import {test,expect} from '@playwright/test';


test("Get the screenshot",async({page})=>{

//launch application :google
await page.goto("https://www.amazon.in/");

//await page.screenshot({path:'tests/Screenshots/'+'amazon.png'});

//full page
await page.screenshot({path:'tests/Screenshots/'+'FullPageamazon.png',fullPage: true });

})

