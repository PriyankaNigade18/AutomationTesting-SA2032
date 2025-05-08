describe("Test Css selector for application",()=>{

    it("Test HRM application login and logout using cssSelector",()=>{
    
    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    cy.fixture("Orangehrm.json").then((data)=>{



//username: css with attribute
cy.get("input[name='username']").type(data.username);
    
//passwordL: css with attribute
cy.get("input[type='password']").type(data.password);

//loginbutton  using tagname
//cy.get("button").click();

//login button using css classname
cy.get("button.oxd-button").click();

//dasboard-assertion
cy.url().should("include","dashboard");




    })
    
    }) 
    
})    