



describe("Test different alerts",()=>{

    it("test basic alert",()=>{

        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");

        cy.contains("Click for JS Alert").click();

        //alert will open :Cypress handle that alert
        //manually to assert the alert us cy.on(run event)
        cy.on("window:alert",(alt)=>{

            expect(alt).to.be.equal("I am a JS Alert");
        })

        //assertion
        cy.get("#result").should("have.text","You successfully clicked an alert");
    })


    it("Test for confirmation alert",()=>{

        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");
 /*
        //confirmation alert:ok
        cy.contains("Click for JS Confirm").click();
        //assertion
        cy.get("#result").should("have.text","You clicked: Ok");

        cy.wait(2000);*/

        //dismiss:click on cancel
        cy.contains("Click for JS Confirm").click();
        
        cy.on("window:confirm",()=>false);
        //assertion
        cy.get("#result").should("have.text","You clicked: Cancel");
    })


    it.only("Test prompt based alert/window",()=>{
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");

        //first take full control of prompt winodw
        cy.window().then((win)=>{//win is variable

            cy.stub(win,"prompt").returns("Welcome");
        });

        cy.contains("Click for JS Prompt").click();
        cy.wait(1500);

        //assertion
        cy.get("#result").should("have.text","You entered: Welcome");


    })

})