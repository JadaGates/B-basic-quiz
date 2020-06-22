package com.example.ThoughtWorks.controller;

import com.example.ThoughtWorks.AccountEducation;
import com.example.ThoughtWorks.service.AccountEducationService;
import com.example.ThoughtWorks.service.AccountService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:1234")
@RequestMapping("/users")
public class AccountEducationController {

    private final AccountEducationService accountEducationService;

    public AccountEducationController(AccountEducationService accountEducationService) {
        this.accountEducationService = accountEducationService;
    }

    @GetMapping("/{id}/educations")
    @ResponseBody
    public List<AccountEducation> getAllAccountEducation(@PathVariable Integer id){
        return accountEducationService.getAllAccountEducation(id);
    }

    @PostMapping("/{id}/educations")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void updateAccountEducation(@RequestBody AccountEducation accountEducation, @PathVariable Integer id){
        accountEducationService.updateAccountEducation(accountEducation, id);
    }
}
