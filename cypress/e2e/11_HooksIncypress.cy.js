
/*
before()
after()
beforeEach()
afterEach()
*/


describe("This is suite for hooks",()=>{

    before(()=>{
        cy.log("Before hook will execute only once before all test!")
    });
    
    after(()=>{
        cy.log("after hook will execute only once after all test!")
    });

    beforeEach(()=>{
        cy.log("BeforeEach executes before every test case")
        cy.visit("https://automationplayground.com/crm/");
    })

    afterEach(()=>{
        cy.log("AfterEach executes after every test case");

        cy.url().then((appUrl)=>{
            cy.log("Url is: "+appUrl)
        })
    })

it("This is test1 for SignIn link",()=>{

    //cy.visit("https://automationplayground.com/crm/");

    cy.log("This is for signin link validation");
    //By text
    cy.contains("Sign In").should("be.visible");
    cy.contains("Sign In").click();


})

it("This is test2 for Login",()=>{
   // cy.visit("https://automationplayground.com/crm/");
    cy.contains("Sign In").click();
    cy.xpath("//input[@id='email-id']").type("test@gmail.com");
    cy.xpath("//input[@placeholder='Password']").type("test123");
    cy.xpath("//input[@id='remember']").check();
    cy.xpath("//button[@type='submit']").click();
})










})










