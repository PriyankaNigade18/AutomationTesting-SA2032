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

Parent and Child relation in CSSSelector 
===========================================
parenttag>child element

div[class='list-group']>a......1 of 13 match

//at 2nd position CssSelector with indexing
======================================
parent:nth-child(2)>a

syntax for indexing
=========================
parent>child:nth-child(indexing)
or
parent>child:nth-of-type(indexing)

div[class='list-group']>a:nth-of-type(2)....1 of 1 match

div[class='list-group']>a:nth-child(2)....1 of 1 match


4.Xpath is deprecated in cypress
We can add it externally and write script using xpath also



*/


describe("This is suite for locators in Cypress",()=>{


//hook:beforeEach() will execute before every test case
beforeEach(()=>{

    cy.log("BeforeEach() executes before every test case");
    //open application
    cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");
})

afterEach(()=>{
    cy.log("AfterEach() executes after every test case");
    //get the title of appliaction
    cy.title().then((appTitle)=>{
        cy.log("Application title is: "+appTitle);
    })
})
    //contains() applicable only for visible text of element
    it("For visible text contains()",()=>{
        //cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

        //get the text
        //<h2>Returning Customer</h2>
        cy.contains("Returning Customer").then(($ele)=>{

            cy.log("Login Form text is: "+$ele.text());
        })

        //click on element
        //<a>Forgotten Password</a>
        cy.contains("Forgotten Password").click();

    })

    it("Identify elements using cssSelector",()=>{

        //cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

        //email: css with id
        cy.get("#input-email").type("test24@gmail.com");

        //password: css with attaribute
        cy.get("input[placeholder='Password']").type("test123");

        //click on login button: css with classname
        cy.get("input.btn.btn-primary").click();

        //page navigated to account page-assertion
        cy.url().should("contain","account");
        
    })

    it('test for single element interaction using css with indexing',()=>{

        //cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

        //from the menu click on register

        cy.get("div[class='list-group']>a:nth-child(2)").click();

        //assertion
        cy.url().should("include","register");
    })
    







})




