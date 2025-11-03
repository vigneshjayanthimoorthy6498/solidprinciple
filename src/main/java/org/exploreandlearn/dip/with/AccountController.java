package org.exploreandlearn.dip.with;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/api/account")
@RestController
public  class AccountController {

    private AccountService accountService;


    @GetMapping("/detail")
    public Account getDetailById(@RequestParam("accountNumber") long accountNumber) {
        return accountService.getAccountId(accountNumber);
    }

}
