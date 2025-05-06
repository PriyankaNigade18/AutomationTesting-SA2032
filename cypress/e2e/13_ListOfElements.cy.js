
describe("Test multiple list of elements ",()=>{


    it("Test for Google search",()=>{

        cy.visit("https://www.google.com/");

        //search for java
        cy.get("#APjFqb").type("java");

        //wait
        cy.wait(2000);

        //get the list store into variable: each()
        cy.get("ul[class='G43f7e']>li").each(($option)=>{//option is variable for all links

            cy.log("Text is: "+$option.text());

        })

        })





        it("Test total links for Orangehrm",()=>{
            cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


            //total link : <a> using tagname
            cy.get("a").each(($link)=>{//$link variable that represent every a tag(link)

                //get the attribute value: attr("href")
                cy.log("Attribute value: "+$link.attr("href"));

                //get the text of link: text()
                cy.log("Text is: "+$link.text());

                if($link.attr("href").includes("https://www.youtube.com/c/OrangeHRMInc"))
                {
                    cy.wrap($link).click();
                }


            })

    })

    it.only("Test for Opencart application options",()=>{
        cy.visit("https://tutorialsninja.com/demo/index.php?route=account/register");

        //to get all options
        cy.get("div[class='list-group']>a").each(($ele)=>{

            cy.log("Text is: "+$ele.text());

            if($ele.text().includes("Forgotten Password"))
            {
                cy.wrap($ele).click();
            }

        })

    })





})