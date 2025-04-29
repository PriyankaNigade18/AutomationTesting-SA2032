

describe("This is test suite for google app",()=>{

    it("This is test1 to launch google appl",()=>{
        //visit(): open url 
        cy.visit("https://www.google.com");

        cy.log("Google application open!")
    })

    it("This is test2 for CRM app",()=>{

        cy.visit("https://automationplayground.com/crm/");
        cy.log("CRM application open!")
    })

    it("This is tes3 for amazon app",()=>{
        cy.visit("https://www.amazon.in");
        cy.log("Amazon application open");
    })



})