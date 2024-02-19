package com.accolite.debugcheck.code;

public interface AccountRepo {
    void add(Account acc);
    Account get(String accountId);
}
