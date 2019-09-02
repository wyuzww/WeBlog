package com.ethan.blog.service;

import com.ethan.blog.domain.Account;

public interface AccountService {

    void save(Account account);

    Account getOne(Long id);

}
