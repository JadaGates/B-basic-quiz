package com.example.ThoughtWorks.service;

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
        String decriptionOne = "Vis at rationibus elaboraret reprimique. " +
                "Salutatus temporibus te mel, iisque ancillae perfecto te has, ea vidisse offendit has.";

        String decriptionTwo = "Nam dolorem suavitate ex, mel simul voluptatibus eu. Sit doctus repudiare incorrupte ei.";

        accountEducationData.add(new AccountEducation((long) 1995, "I was born in Canada", decriptionOne, (long) 1));
        accountEducationData.add(new AccountEducation((long) 2000, "Fly High in the sky", decriptionTwo, (long) 1));
        accountEducationData.add(new AccountEducation((long) 2006, "I was born in Canada", decriptionOne, (long) 1));
        accountEducationData.add(new AccountEducation((long) 2010, "Fly High in the sky", decriptionTwo, (long) 1));
        accountEducationData.add(new AccountEducation((long) 2015, "I was born in Canada", decriptionOne, (long) 1));
        accountEducationData.add(new AccountEducation((long) 2020, "Fly High in the sky", decriptionTwo, (long) 1));

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
            accountEducation.setUserId((long) id);
            temp.add(accountEducation);
            accountEducationMap.put(id, temp);
        }

    }
}