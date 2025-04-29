
/*

How to apply basic assertion
By default cypress support inbuild assertions
Implicit
----------
should()
and()  

Explicit
-----------
expect()
assert()

To get the current url of application in cypress url()
to get the current title of application in cypress title()

*/


describe('This is suite for basic assertions',()=>{

    //pass scenario
it("This is for exact match for google title/url",()=>{
cy.visit("https://www.google.com/")

//title validation
cy.title().should("eq","Google");

//url assertion
cy.url().should("eq","https://www.google.com/");


})
//fail scenario
it("This is for exact match for fail google title/url",()=>{
    cy.visit("https://www.google.com/")
    
    //title validation
    cy.title().should("eq","Google123");
    
    //url assertion
    cy.url().should("eq","https://www.google.in/");
    
    
    })

    it("This is for OrangeHrm Application",()=>{

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        cy.title().should("eq","OrangeHRM");//exact title (equality)
        cy.title().should("include","HRM");//partial title
        cy.title().should("contain","Orange");//partial title

    })

})






