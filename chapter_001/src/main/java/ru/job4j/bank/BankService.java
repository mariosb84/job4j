package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
                users.put(user, userAccount);
            }
        }
    }

    public User findByPassport(String passport) {
        /*for (User user : users.keySet()) {
             if (user.getPassport().equals(passport)) {
                 return user;
             }
        }
        return null;*/                                                            // Переделываем на stream api :
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
       /*     User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;*/                                                          // Переделываем на stream api :
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
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