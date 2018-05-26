package com.anthony.account.service.impl;

import com.anthony.account.mapper.AccountMapper;
import com.anthony.account.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;
}
