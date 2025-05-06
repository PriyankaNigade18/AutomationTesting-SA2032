
describe("Test webElement automation",()=>{

    it("Test for inputBox",()=>{

        cy.visit("https://www.google.com/");

        cy.get("#APjFqb").type("Testing");

        cy.wait(2000);

        //clear

        cy.get("#APjFqb").clear();

        cy.wait(2000);

        //delay
        cy.get("#APjFqb").type("Testing",{delay:1000});

    })


    it("Checkbox current status validation",()=>{

        cy.visit("https://www.letskodeit.com/practice");

        //BMW checkbox should be unchecked
        cy.get("#bmwcheck").should("not.be.checked");

        //click on it
        cy.get("#bmwcheck").check();

        //it should be checked
        cy.get("#bmwcheck").should("be.checked");

    })

    it("Check for status of already checked checkbox ",()=>{

        cy.visit("https://the-internet.herokuapp.com/checkboxes");

        //first checkbox : first()  last checkbox: last()

        //first checkbox should not be checked
        cy.get("input[type='checkbox']").first().should("not.be.checked");


        //last checkbox should be checked
        //cy.get("input[type='checkbox']").last().should("be.checked"); pass
        cy.get("input[type='checkbox']").last().should("not.be.checked");//fail
    })


it.only("test for multiple checkbox interaction",()=>{
    cy.visit("https://www.letskodeit.com/practice");

    //last ele
    cy.get("div#checkbox-example-div>fieldset>label>input").last().check();

    //first ele
    cy.get("div#checkbox-example-div>fieldset>label>input").first().check();

    //middle
cy.get("div#checkbox-example-div>fieldset>label>input").eq(1).check();




})





})
