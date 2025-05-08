

describe("Test file upload scenario",()=>{


it("Test File Upload",()=>{

    cy.visit("https://the-internet.herokuapp.com/upload");

    //choose the file:select a file
    cy.get("#file-upload").selectFile("cypress/fixtures/Appiumsetup.txt");

    //upload file: click
    cy.get("#file-submit").click();

    cy.wait(1500);

    cy.get("h3").should("have.text","File Uploaded!");






})


})



