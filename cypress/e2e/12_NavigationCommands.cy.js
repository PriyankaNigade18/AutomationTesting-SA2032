
/*
back(): cy.go("back") or cy.go(-1)

forward(): cy.go("forward") or cy.go(1)

refresh(): cy.reload()

visit()
*/


describe("This is suite for navigation",()=>{


    it("Test for Navigation in Cypress",()=>{

        //homepage
        cy.visit("https://www.amazon.in/");

        //assertion
        cy.title().should("include","India");



        //mobiles page
        //ul[class='nav-ul']>li>div>a ---total 32 element i want element from 6th position so index=5
        cy.get("ul[class='nav-ul']>li>div>a").eq(5).click();

        //assertion
        cy.title().should("include","Phones");


        cy.wait(2000);

        //mobile page--->home page
        //cy.go("back");
        cy.go(-1);

        cy.wait(2000);

        //assertion for home page
      cy.title().should("include","India");

      cy.wait(2000);

      //Homepage--->mobile page
      //cy.go("forward");
        cy.go(1);
      //refresh page
      cy.wait(2000);

      cy.reload();






    })


})







