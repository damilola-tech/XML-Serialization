//Creating an xml file
package com.pentax;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {

    Accounts accounts;

    @BeforeEach
    void setUp() {
        Account bob = new Account(100, "Bob", "Blue", 24.98);
        Account steve = new Account(200, "Steve", "Green", -345.67);
        Account pam = new Account(300, "Pam", "Wine", 0.00);
        Account sam = new Account(400, "Sam", "Red", -42.16);
        Account sue = new Account(500, "Sue", "Yellow", 224.62);

        accounts = new Accounts();
        accounts.getAccounts().add(bob);
        accounts.getAccounts().add(steve);
        accounts.getAccounts().add(pam);
        accounts.getAccounts().add(sam);
        accounts.getAccounts().add(sue);
    }

    @AfterEach
    void tearDown() {
    }

    void createXMLFile() {
        String filename = "C:\\Users\\DELL\\Documents\\JAVA\\CODES\\clients.xml";



    }
}