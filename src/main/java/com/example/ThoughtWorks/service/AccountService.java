package com.example.ThoughtWorks.service;

import com.example.ThoughtWorks.Account;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private Map<Integer, Account> accountMap= new HashMap<>();

    public AccountService(){
        accountMap.put(1, new Account(1, "Flivo", (long) 24, "htt", "jjj"));
        accountMap.put(2, new Account(2, "Tommy", (long) 34, "445", "fdfj"));}
        public void creatAccount(Account account){
        accountMap.put(account.getId(), account);
    }
    public Account getAccountById(Integer id){
        return accountMap.get(id);
}
}