

describe("Test Css selector for application",()=>{

it("Test HRM application login and logout using cssSelector",()=>{

cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//username: css with attribute
cy.get("input[name='username']").type("Admin").should("have.value","Admin");

//passwordL: css with attribute
cy.get("input[type='password']").type("admin123").should("have.value","admin123");

//loginbutton  using tagname
//cy.get("button").click();

//login button using css classname
cy.get("button.oxd-button").click();

//dasboard-assertion
cy.url().should("include","dashboard");

//logout-open menu css with classname
cy.get("i.oxd-userdropdown-icon").click();

//click on logout link with text
//cy.contains("Logout").click();

//click on logout link using cssSelector
//cy.get("ul[class='oxd-dropdown-menu']>li:nth-child(4)>a").click();

//using xpath in cypress
cy.xpath("(//ul[@class='oxd-dropdown-menu']//li//a)[4]").click();

}) 






})
