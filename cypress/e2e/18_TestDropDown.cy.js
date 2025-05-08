/*

1.Select tag based dropdown: select()

cy.get("locator").select(): index,value,visibleText

2.bootstrap pattern: automate based on locator

3.auto-suggestion:automate based on locator

*/


    describe("Test Different dropdowns",()=>{


        it("Test select based dropdown",()=>{

            cy.visit("https://www.amazon.in/");

            //dropdown address
            //1.select by visible text
            cy.get("#searchDropdownBox").select("Amazon Fresh",{force: true});
             cy.wait(1500);

            //select by index
            cy.get("#searchDropdownBox").select(3,{force: true});//Amazon fashion
            cy.wait(1500);

            //select by value:
            cy.get("#searchDropdownBox").select("search-alias=dvd");

            cy.get("select[id='searchDropdownBox']>option").should("have.length",45)//45
            //get the options and print inthe console
            cy.get("select[id='searchDropdownBox']>option").each(($option)=>{

                
                cy.log($option.text());



            })

        })


        it.only("test dropdown without select tag",()=>{

            cy.visit("https://www.goibibo.com/");

            //close the popup
            cy.get("span.icClose").click();

            cy.contains("Enter city or airport").click();

            //input box: send data
            cy.get("input[type='text']").type("p");

            //get the options
            cy.get("ul[id='autoSuggest-list']>li>div>div>div>p>span[class='autoCompleteTitle ']").each(($option)=>{

                cy.log($option.text());
                //let text=$option.text();
                cy.wrap($option).invoke("text").then((txt)=>{

                    if(txt.includes("Patna"))
                        {
                            cy.wrap($option).click();
                        }

                })

                

            })
        })


            it("test for autosuggestion dropdown",()=>{

                cy.visit("https://www.letskodeit.com/practice");

                cy.get("#autosuggest").type("selenium");

                //get the options
                cy.get("ul>li[class='ui-menu-item']>a").each(($option)=>{
                    cy.log($option.text());

               if($option.text().includes("Selenium WebDriver Java"))
               {
                cy.wrap($option).click();
               }

            })




        })






    })









