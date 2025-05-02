


describe("This is suite for xpath",()=>{

it("This is hem login logout using xpath",()=>{

cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//username with xpath: //tagname[@attribute='value']
cy.xpath("//input[@name='username']").type("Admin");

//password
cy.xpath("//input[@placeholder='Password']").type("admin123");

//login button
cy.xpath("//button[@type='submit']").click();

//assertion on dashboard
cy.url().should("include","dashboard");

//click on icon: open menu
cy.xpath("//i[contains(@class,'oxd-userdropdown-icon')]").click();

//logout
cy.xpath("(//ul[@class='oxd-dropdown-menu']//li//a)[4]").click();

})





})