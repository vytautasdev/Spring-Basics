package com.example.CRUDexercise.service;

import com.example.CRUDexercise.model.Account;
import com.example.CRUDexercise.repository.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public Account addAccount(Account acc) {
        return this.accountRepo.save(acc);
    }

    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    public Account updateAccount(Long id, Account acc) {
        var temp = accountRepo.findById(id);
        var existing = temp.get();

        existing.setName(acc.getName());
        existing.setAccNumber(acc.getAccNumber());

        return accountRepo.save(existing);

    }

    public boolean deleteAccount(Long id) {
        accountRepo.deleteById(id);
        var exists = accountRepo.existsById(id);
        return !exists;
    }

    public List<Account> getAccountByName(String name) {
        return accountRepo.findAccountByName(name);
    }


}
