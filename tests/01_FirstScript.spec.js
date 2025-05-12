
//importing all plywright method library test for test case and expect for assertion
import {test,expect} from '@playwright/test'

test("Launch of google application",async({page})=>{

//launch application :google
await page.goto("https://www.google.com/");


})





