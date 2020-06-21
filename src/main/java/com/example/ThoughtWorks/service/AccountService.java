package com.example.ThoughtWorks.service;

import com.example.ThoughtWorks.Account;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private Map<Integer, Account> accountMap= new HashMap<>();

    @JsonIgnoreProperties(value = { "id" })
    public AccountService(){
        accountMap.put(1, new Account(1, "Flivo", (long) 24, "htt", "jjj"));
        accountMap.put(2, new Account(2, "Tommy", (long) 34, "445", "fdfj"));}

        public int creatAccount(Account account){
        int userId = generateAccountId(accountMap);
        account.setId(userId);
        accountMap.put(userId, account);
        return accountMap.size();
    }
    public int generateAccountId(Map accountMap){
        return accountMap.size() + 1;
    }
    public Account getAccountById(Integer id){
        return accountMap.get(id);
}
}