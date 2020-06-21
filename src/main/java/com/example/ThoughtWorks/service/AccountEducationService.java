package com.example.ThoughtWorks.service;

import com.example.ThoughtWorks.Account;
import com.example.ThoughtWorks.AccountEducation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountEducationService {

    private Map<Integer, List<AccountEducation>> accountEducationMap= new HashMap<>();

    public AccountEducationService(){
        ArrayList<AccountEducation> accountEducationData = new ArrayList<>();

        accountEducationData.add(new AccountEducation((long) 1995, "npu", "htt", (long) 1));
        accountEducationData.add(new AccountEducation((long) 2000, "npu", "8909", (long) 1));

        accountEducationMap.put(1, accountEducationData);

    }

    public List<AccountEducation> getAllAccountEducation(Integer id){
        return new ArrayList<>(accountEducationMap.get(id));
    }
    @JsonIgnoreProperties(value = { "userId" })
    public void updateAccountEducation(AccountEducation accountEducation, Integer id){
        if(accountEducationMap.containsKey(id)){
            List<AccountEducation> temp = accountEducationMap.get(id);
            accountEducation.setUserId((long) id);
            temp.add(accountEducation);
            accountEducationMap.replace(id, temp);
        }else
        {
            List<AccountEducation> temp = new ArrayList<>();
            temp.add(accountEducation);
            accountEducationMap.put(id, temp);
        }

    }
}