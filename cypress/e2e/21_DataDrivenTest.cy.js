
describe("Test Css selector for application",()=>{

    it("Test HRM application login and logout using cssSelector",()=>{
    
   

cy.fixture("DDT.json").then((dataset)=>{

    //to iterate multiple data i used foreach()
    dataset.forEach((userdata)=>{
 

    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    //username: css with attribute
    cy.get("input[name='username']").type(userdata.un);
        
    //passwordL: css with attribute
    cy.get("input[type='password']").type(userdata.psw);
    
    //loginbutton  using tagname
    //cy.get("button").click();
    
    //login button using css classname
    cy.get("button.oxd-button").click();

    if(userdata.un=="Admin" && userdata.psw=="admin123")
    {
    
    //dasboard-assertion
    cy.url().should("include","dashboard");
    cy.log("Login pass");
    //logout
//logout-open menu css with classname
cy.get("i.oxd-userdropdown-icon").click();

//click on logout link with text
cy.contains("Logout").click();

    }else{
        cy.log("Login Fail!");
    }
    
})
})

})

   



    })
    

    
  