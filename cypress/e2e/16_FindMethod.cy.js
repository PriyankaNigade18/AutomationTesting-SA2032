
/*
cy.get(parentlocator).find("childloc/ele");

cy.find(): wrong syntax

*/

describe("Test find methdo of cypress",()=>{

    it('test find method',()=>{

        cy.visit("https://tutorialsninja.com/demo/index.php?route=account/register");

        //multiple match
        cy.get("div[class='list-group']").find("a").each(($link)=>{


            cy.log($link.text());

        })







    })
})