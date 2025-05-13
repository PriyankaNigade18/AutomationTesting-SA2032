

import {test,expect} from '@playwright/test'


test("Test for Nvaigation into app",async ({page})=>{

    //launch google page
    await page.goto("https://www.google.com/");

    //static wait:wiat for 2sec
    await page.waitForTimeout(2000);

    //launch facebbok page
    await page.goto("https://www.facebook.com/");

    //static wait:wiat for 2sec
    await page.waitForTimeout(1500);

    //go back 
    await page.goBack();

 //static wait:wiat for 2sec
    await page.waitForTimeout(1500);

    //go forward()
    await page.goForward();

    //static wait:wiat for 2sec
    await page.waitForTimeout(1500);

    //refresh page: reload()
    await page.reload();


    //close page
    await page.close();

})