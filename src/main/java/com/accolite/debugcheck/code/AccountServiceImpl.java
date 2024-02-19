package com.accolite.debugcheck.code;

public class AccountServiceImpl implements AccountService {
    AccountRepo accountRepo;

    @Override
    public void add(Account acc) {
        accountRepo.add(acc);
    }

    @Override
    public Account get(String accId) {
        return accountRepo.get(accId);
    }
}
