package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> userAccount = users.get(user);
        if (user != null && !userAccount.contains(account)) {
            userAccount.add(account);
            users.put(user, userAccount);
        }
    }

    public User findByPassport(String passport) {
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
             User key = entry.getKey();
             if (key.getPassport().equals(passport)) {
                 return key;
             }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
            User user = findByPassport(passport);
            List<Account> accounts = users.get(user);
        if (user != null) {
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account out = findByRequisite(srcPassport, srcRequisite);
        Account in = findByRequisite(destPassport, destRequisite);
        if (out != null && in != null && out.getBalance() >= amount) {
           in.setBalance(in.getBalance() + amount);
           out.setBalance(out.getBalance() - amount);
           rsl = true;
        }
        return rsl;
    }

}