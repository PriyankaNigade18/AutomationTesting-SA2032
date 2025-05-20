
import {test,expect} from '@playwright/test';




test.beforeEach(async({page})=>{

    await page.goto("https://automationplayground.com/crm/");
    await page.locator("#SignIn").click();


})

test("Login into crm",async({page})=>{


    await page.locator("#email-id").fill("test@gmail.com");
    await page.locator("#password").fill("test123");
    await page.waitForTimeout(1000);
    await page.locator("#submit-id").click();

})




/*

test.beforeAll(async ()=>{
console.log("Before All hook is running!")
});

test.afterAll(async ()=>{
console.log("After All hook is running!")
});


test.beforeEach(async ()=>{
console.log("BeforeEach hook is running!")
});

//group the test case using describe block
test.describe("Group1",()=>{
test("Test Case1",async()=>{
console.log("Test Case1 is executing");
})

test("Test Case2",async()=>{
console.log("Test Case2 is executing");
})

})

test.describe("Group 2",()=>{

    test("Test Case3",async()=>{
console.log("Test Case3 is executing");
})

test("Test Case4",async()=>{
console.log("Test Case4 is executing");
})
})

*/





