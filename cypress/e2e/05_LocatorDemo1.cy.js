
/*
How to automate any webelement(GUI element)
----------------------------------
1.Identify webelement using locator
2.Perform action


cy.get(locator strategy)

By deafult cypress cupport cssSelector

1.text
------------
If element have any visible text: text locator =contains() from cypress
<a>Login</a>
cy.contains("Login").click();


2.by tag
------------
<button type='button'/>
cy.get("tagname").click()

3.CssSelector
---------------
1.tagname with id
------------------
syntax: tagname#id

2.tagname with attribute
------------------------
Syntax:tagname[attribute='value']

3.tagname with classname
---------------------------
syntax: tagname.classname


4.Xpath is deprecated in cypress
We can add it externally and write script using xpath also



*/

describe("Test Crm application for Login and logout",()=>{

it("Test Crm login and logout",()=>{

//open crm application
cy.visit("https://automationplayground.com/crm/");

//click on sign in link using cssselector by id
//cy.get("a#SignIn").click();

//click on sign in link by visible text:contains()
cy.contains("Sign In").click();

//login 
//enter email id into text box/input box: use type() & locator cssselector with id
cy.get("#email-id").type("test@gmail.com");

//enter password into password field: type() & locator cssselector with attribute
cy.get("input[placeholder='Password']").type("test123");

//to check the checkbox: check() and uncheck()

cy.get("#remember").click();//checkbox get selected

//static wait in cypress using wait(timeout in ms)
cy.wait(2000);

cy.get("#remember").uncheck();//checkbox get unchecked

cy.wait(2000);
//using check
cy.get("#remember").check();

//using tagname click on Submit button
cy.get("button").click();

})


})








