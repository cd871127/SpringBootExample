package com.anthony.account.controller;

import com.anthony.account.dto.AccountDTO;
import com.anthony.common.ServerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @RequestMapping(value = "{userId}", method = GET)
    public ServerResponse<List<AccountDTO>> getAccountByUserId(@PathVariable String userId) {
        return null;
    }

    @RequestMapping(value = "{userId}", method = POST)
    public ServerResponse createAccount(@PathVariable String userId, @RequestParam AccountDTO accountDTO) {
        return null;
    }

    @RequestMapping(value = "{userId}/{accountId}", method = DELETE)
    public ServerResponse deleteAccount(@PathVariable String userId, @PathVariable String accountId) {
        return null;
    }

}
