package com.bookstation;

import org.testng.annotations.DataProvider;

public class BookStation_TestData {
	
	@DataProvider(name = "Login")
    public Object[][] getDataforLogin() {
        // Multidimensional Object
        // 3X3 or 4X3 or 4X5
        return new Object[][] {



                {"rahulem2208@gmail.com", "Flynnryder@7" }
                //{"7798922483", "RaJ@_4693" }
               //{"dixit", "admin123" }
                };



   /* }

    @DataProvider(name = "LoginScenario")
    public Object[][] getDataforLoginDifferentScenarios() {
        return new Object[][] {
                { "admin", "", "Password cannot be empty"},
                { "", "admin123", "Username cannot be empty" },
                { "AdminWrong", "admin123", "Invalid credentials" },
                { "admin", "admin", "Invalid credentials" },
                { "admin", "admin123", "Dashboard" }
                };


    }
                @DataProvider(name = "Account")
                public Object[][] getDataforAccount() {
                    return new Object[][] {
                            { "old password", "new password","confirm new password"},
                            {"","new password","confirm new password"},
                            { "admin", "admin123", "Dashboard" }
                            };

*/
    }

}
