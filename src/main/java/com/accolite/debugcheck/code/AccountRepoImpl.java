package com.accolite.debugcheck.code;

import java.util.HashMap;

public class AccountRepoImpl implements AccountRepo {

    private HashMap<String, Account> accounts;

    @Override
    public void add(Account acc) {
        accounts.get(acc.toString());
    }

    @Override
    public Account get(String accountId) {
        return accounts.get(accountId);
    }
}
