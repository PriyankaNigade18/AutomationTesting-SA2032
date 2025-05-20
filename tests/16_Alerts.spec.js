import {test,expect} from '@playwright/test';


test("Handle Basic alert",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

    //enable dialog box/alert window before opening dialog box
    await page.on('dialog',dialog=>{

        console.log(dialog.message());
        dialog.accept();//ok
    })

    //open alert 
    await page.getByRole("button",{name:"Click for JS Alert"}).click();

    await expect(await page.locator("#result")).toHaveText("You successfully clicked an alert");
})



test("Handle Confirmation  alert",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

    //enable dialog box/alert window before opening dialog box
    await page.on('dialog',dialog=>{

        console.log(dialog.message());
        dialog.dismiss();//cancel
    })

    //open alert 
    await page.getByRole("button",{name:"Click for JS Confirm"}).click();

    await expect(await page.locator("#result")).toHaveText("You clicked: Cancel");
})



test.only("Handle prompt alert",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

    //enable dialog box/alert window before opening dialog box
    await page.on('dialog',dialog=>{

        console.log(dialog.message());
        dialog.accept("Hello Everyone!");

    })

    //open alert 
    await page.getByRole("button",{name:"Click for JS Prompt"}).click();

    await expect(await page.locator("#result")).toHaveText("You entered: Hello Everyone!");
})