package com.example;



import com.example.Testing.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {
    private BankAccount account;

    @BeforeAll
    static void startTestSuite() {
        System.out.println("===== STARTING TEST SUITE =====");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Creating fresh account...");
        account = new BankAccount(1000);
    }

    @Test
    void shouldHaveInitialBalance() {

        assertEquals(1000, account.getBalance());
    }

    @Test
    void shouldDepositMoney() {

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }

    @Test
    void shouldWithdrawMoney() {

        account.withdraw(300);

        assertEquals(700, account.getBalance());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
    }

    @AfterAll
    static void finishTestSuite() {
        System.out.println("===== TEST SUITE COMPLETED =====");
    }

}
