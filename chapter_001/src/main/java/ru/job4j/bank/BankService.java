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
        ArrayList<Account> userAccount = new ArrayList<Account>();
        if (user != null && !users.get(user).contains(account)) {
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
       users.get(user);
        if (user != null && users.get(user).contains(Account.)) {

        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}