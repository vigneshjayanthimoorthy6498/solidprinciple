package org.exploreandlearn.dip.without;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/*
This is class break the DIP Principle because Account controller is
higher level class which is completed depends on the AccountServiceImp
 */
@RequestMapping("/v1/api/account")
@RestController
public class AccountController {

    private AccountServiceImp accountServiceImp;


    @GetMapping("/detail")
    public Account getDetailById(@RequestParam("accountNumber") long accountNumber) {
        return accountServiceImp.getAccountId(accountNumber);
    }

}
