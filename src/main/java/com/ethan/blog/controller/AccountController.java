package com.ethan.blog.controller;

import com.ethan.blog.domain.Account;
import com.ethan.blog.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        model.addAttribute("uid","<span style='color:red'>wyuzww</span>");

        Set<String> allNames = new HashSet<String>() ;
        List<Integer> allIds = new ArrayList<Integer>() ;
        for (int x = 0 ; x < 5 ; x ++) {
            allNames.add("boot-" + x) ;
            allIds.add(x) ;
        }
        model.addAttribute("names", allNames) ;
        model.addAttribute("ids", allIds) ;


        return "account/list";
    }

}
