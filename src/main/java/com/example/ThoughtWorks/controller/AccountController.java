package com.example.ThoughtWorks.controller;

import com.example.ThoughtWorks.Account;
import com.example.ThoughtWorks.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:1234")
@RequestMapping("/user")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Account getAccountById(@PathVariable Integer id) {
        return accountService.getAccountById(id);
    }


    @PostMapping("/create")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void createAccount(@RequestBody Account account) {
        accountService.creatAccount(account);
    }
}
