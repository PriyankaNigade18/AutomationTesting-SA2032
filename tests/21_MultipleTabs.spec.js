



import {test,expect} from '@playwright/test';

test("Test for multiple tabs",async({browser})=>{

//to get the new environment : newContext()
const context=await browser.newContext();

//to create page use contex: newPage()
const page=await context.newPage();

//page :home page
await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


//handle promise to get the new page/new tab
const [newTab]= await Promise.all(
                        [   //context
                       context.waitForEvent("page"),

                    //click on link where we navigate to new tab
                        await page.locator("//a[text()='OrangeHRM, Inc']").click()
                         ]

                        )


           

            //newTab
           await newTab.locator("#Form_submitForm_EmailHomePage").fill("test@gmail.com"); 
















})
