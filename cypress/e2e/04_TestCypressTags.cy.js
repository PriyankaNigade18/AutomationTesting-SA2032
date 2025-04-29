

/*

it() there are two tags available

it.only(): The specific test will run

it.skip(): the specific test will skip

Tags are applicable for suite level and test level

*/

describe("This is for cypress tags suite1",()=>{

it.only("This is test1",()=>{

    cy.visit("https://www.google.com")

})
it.only("This is test2",()=>{

    cy.visit("https://automationplayground.com/crm/")
    
})

it("This is test3",()=>{

    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    
})




})


//tag at suite level

describe.skip("This is suite2",()=>{

    it('test for suite2',()=>{
        cy.visit("https://www.google.com");
    })
})


