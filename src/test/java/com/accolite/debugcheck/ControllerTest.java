package com.accolite.debugcheck;

import com.accolite.debugcheck.code.Account;
import com.accolite.debugcheck.code.AccountProcessorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.UUID;

public class ControllerTest {

    private AccountProcessorImpl accountProcessorImpl;

    @Test
    void test1() {
        String acc = UUID.randomUUID().toString();
        accountProcessorImpl.add(new Account(acc, "John Doe"));
        accountProcessorImpl.get(acc);
        Assertions.assertTrue(acc.getAccountId().equals(acc));
    }

}
