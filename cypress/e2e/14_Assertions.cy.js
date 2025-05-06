
/*
Cypress support two types of assertion

1.Implicit(default)
-----------------------
should() and()

2.Explicit(TDD/BDD)
---------------
expect() assert()


*/

describe("Test for Cypress Assertions",()=>{

    it("Test for implicit Assertion",()=>{

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //title assertion:should()
        cy.title().should("eq","OrangeHRM");
        cy.title().should("include","HRM");
        cy.title().should("contain","Orange");

        //title assertion with and()
        cy.title().should("eq","OrangeHRM").and("include","Orange").and("contain","HRM");


        //url
        cy.url().should("include","live.com");

        //test for visibility
        cy.get("h5").should("be.visible").and("have.text","Login");


        //total links on the page : 5
        cy.get("a").should("have.length",5);

        //username
        cy.get("input[name='username']").type("Priyanka").should("have.value","Priyanka");
    })


    it("Test for Explicit assertion",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        /* To apply Explicit assertion get the element into variable then you can test 
        */
        cy.get("input[name='username']").type("Priyanka");

        cy.get("input[name='username']").then(($ele)=>{

            //get the current value
            const actUn=$ele.val();

            expect(actUn).to.equal("Priyanka");

            assert.equal(actUn,"Priyanka");

        })




    })












})










