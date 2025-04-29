

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

                cy.title().then((appTitle)=>{
                    
                cy.log("Application title is"+appTitle)

                })
            })

            it("store Url into variable and print",()=>{

                cy.visit("https://www.google.com");

               
                cy.url().then((appUrl)=>{

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

        })






