

/*
//for element

cy.get("loc").then(($ele)=>{

    $ele.text();
    cy.wrap($ele).type("Hello");
    cy.wrap($ele).click()
    })


    //text of title/url
    
    cy.title().then((apptitle)=>{
        apptitle.text();
        })

    cy.url().then((appurl)=>{
        
        appurl.text();
        })
    

*/


        describe("suite for storing element or app title/url",()=>{

            it("store title into variable and print",()=>{

                cy.visit("https://www.google.com");

                cy.title().then((appTitle)=>{//appTitle is variable name
                    
                cy.log("Application title is"+appTitle)

                })
            })

            it("store Url into variable and print",()=>{

                cy.visit("https://www.google.com");

               
                cy.url().then((appUrl)=>{//appUrl is variable name

                    cy.log("Application url is: "+appUrl)
                })
            })

            it("store webelement into variable and get the text",()=>{

                cy.visit("https://tutorialsninja.com/demo/index.php?route=common/home");

                cy.get("h1>a").then(($logEle)=>{

                    cy.log("Text of logo is: "+$logEle.text());

                })
            })

            //next class element interaction click() type()

            it('test input box email for opencart application',()=>{

                cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

                //webelement -email input box
                //cy.get("#input-email").type("test@gmail.com");

                //store webelement into variable and then perform action: then()+wrap()
                cy.get("#input-email").then(($email)=>{//email is variable name

                    cy.wrap($email).click();
                    cy.wrap($email).type("test123@gmail.com");
                })
            })








        })






