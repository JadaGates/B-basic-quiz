package com.example.ThoughtWorks.controller;

import com.example.ThoughtWorks.AccountEducation;
import com.example.ThoughtWorks.service.AccountEducationService;
import com.example.ThoughtWorks.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:1234")
@RequestMapping("/user")
public class AccountEducationController {

    private final AccountEducationService accountEducationService;

    public AccountEducationController(AccountEducationService accountEducationService) {
        this.accountEducationService = accountEducationService;
    }

    @GetMapping("/{id}/education")
    @ResponseBody
    public AccountEducation getAccountEducationById(@PathVariable Integer id) {
        return accountEducationService.getAccountById(id);
    }

    @GetMapping("/{id}/educations")
    @ResponseBody
    public List<AccountEducation> getAllAccountEducation(@PathVariable Integer id){
        return accountEducationService.getAllAccountEducation(id);
    }
}
