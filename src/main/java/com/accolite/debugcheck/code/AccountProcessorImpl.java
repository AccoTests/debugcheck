package com.accolite.debugcheck.code;

public class AccountProcessorImpl implements AccountProcessor{

    AccountService accountService;

    @Override
    public void add(Account account){
        accountService.add(account);
    }

    @Override
    public Account get(String accId){
        return accountService.get(accId);
    }
}
