package com.example.ThoughtWorks.service;

import com.example.ThoughtWorks.Account;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private Map<Integer, Account> accountMap = new HashMap<>();

    @JsonIgnoreProperties(value = {"id"})
    public AccountService() {
        String descriptionUserOne = "Self-introductions are hard because most people don’t go around every day thinking about who they are, " +
                "let alone talking about it to complete strangers. So when you are put on the spot during a job interview";
        String descriptionUserTwo = "The good news is that most of us are really overthinking it. " +
                "Self-introduction, or these tell-me-about-yourself questions, are actually quite simple to answer.";

        accountMap.put(1, new Account(1, "Flivo", (long) 24, "https://s1.ax1x.com/2020/06/12/tOIErR.jpg", descriptionUserOne));
        accountMap.put(2, new Account(2, "Tommy", (long) 34, "https://s1.ax1x.com/2020/06/12/tOIAM9.jpg", descriptionUserTwo));
    }

    public int creatAccount(Account account) {
        int userId = generateAccountId(accountMap);
        account.setId(userId);
        accountMap.put(userId, account);
        return accountMap.size();
    }

    public int generateAccountId(Map accountMap) {
        return accountMap.size() + 1;
    }

    public Account getAccountById(Integer id) {
        return accountMap.get(id);
    }
}