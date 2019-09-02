package com.ethan.blog.controller;

import com.ethan.blog.domain.Account;
import com.ethan.blog.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/save")
    public String save(Account account) {
        accountService.save(account);
        return "account/list";
    }

    @RequestMapping("/get/{id}")
    public String get(@PathVariable String id, Model model) {
        Account account = accountService.getOne(Long.valueOf(id));
        model.addAttribute("account",account);
        return "account/list";
    }

}
