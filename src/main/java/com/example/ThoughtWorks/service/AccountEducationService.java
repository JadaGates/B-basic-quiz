package com.example.ThoughtWorks.service;

import com.example.ThoughtWorks.Account;
import com.example.ThoughtWorks.AccountEducation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountEducationService {

    private Map<Integer, AccountEducation> accountEducationMap= new HashMap<>();

    public AccountEducationService(){
        accountEducationMap.put(1, new AccountEducation((long) 1995, "npu", "htt", (long) 1));
        accountEducationMap.put(2, new AccountEducation((long) 2000, "npu", "htt", (long) 2));
    }

    public List<AccountEducation> getAllAccountEducation(Integer id){
        return new ArrayList<>(accountEducationMap.values());
    }

    public void creatAccountEducation(AccountEducation accountEducation, Account account){
        accountEducationMap.put(account.getId(), accountEducation);
    }

    public AccountEducation getAccountById(Integer id){
        return accountEducationMap.get(id);
    }
}