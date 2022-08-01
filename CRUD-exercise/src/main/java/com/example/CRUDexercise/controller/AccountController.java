package com.example.CRUDexercise.controller;

import com.example.CRUDexercise.model.Account;
import com.example.CRUDexercise.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public Account addPerson(@RequestBody Account acc) {
        return accountService.addAccount(acc);
    }

    @GetMapping("/read")
    public List<Account> readAll() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/read/{name}")
    public List<Account> readByName(@PathVariable String name) {
        return accountService.getAccountByName(name);
    }

    @PutMapping("/update/{id}")
    public Account update(@PathVariable Long id, @RequestBody Account acc) {
        return accountService.updateAccount(id, acc);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }

}
