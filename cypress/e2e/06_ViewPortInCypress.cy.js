
/*
cy.viewport()
--------------
It simulate browser maximize and minimize process

*/


describe("This is viewport suite",()=>{

it("Testing maximize browser window ",()=>{

    cy.visit("https://automationplayground.com/crm/login.html");

    //full hd screen
    cy.viewport(1920,1080);

    cy.wait(3000);

})

it("Testing minimize browser window ",()=>{

    cy.visit("https://automationplayground.com/crm/login.html");

    //full hd screen
    cy.viewport(300,300);
    cy.wait(3000);
    
})
it("Testing iphone view ",()=>{

    cy.visit("https://automationplayground.com/crm/login.html");

    //full hd screen
    cy.viewport("iphone-x");
    cy.wait(3000);
    
})


})
