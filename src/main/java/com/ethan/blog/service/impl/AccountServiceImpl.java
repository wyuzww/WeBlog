package com.ethan.blog.service.impl;

import com.ethan.blog.domain.Account;
import com.ethan.blog.repository.AccountRepository;
import com.ethan.blog.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Account getOne(Long id) {
        return accountRepository.getOne(id);
    }
}
