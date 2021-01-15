package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        //User user = findByPassport(passport);                            // Переделываем на Optional
        Optional<User> user = findByPassport(passport);
       // if (user != null) {                                              // Переделываем на Optional
        if (user.isPresent()) {                                            // Переделываем на Optional
            List<Account> userAccount = users.get(user.get());             // Переделываем на Optional
           // List<Account> userAccount = users.get(user);                 // Переделываем на Optional
            if (!userAccount.contains(account)) {
                userAccount.add(account);
               // users.put(user, userAccount);                            // Переделываем на Optional
                users.put(user.get(), userAccount);                        // Переделываем на Optional
            }
        }
    }

    //public User findByPassport(String passport) {                       // Переделываем на Optional
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();                            // Переделываем на Optional
        for (User user : users.keySet()) {
             if (user.getPassport().equals(passport)) {
                 rsl = Optional.of(user);                                 // Переделываем на Optional
                // return user;                                           // Переделываем на Optional
                 break;                                                   // Переделываем на Optional
             }
        }
        //return null;                                                    // Переделываем на Optional
        return rsl;                                                       // Переделываем на Optional




       /* return users.keySet()                                                 // Переделываем на stream api :
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);*/
    }

    //public Account findByRequisite(String passport, String requisite) {            // Переделываем на Optional
    public Optional<Account> findByRequisite(String passport, String requisite) {    // Переделываем на Optional
            //User user = findByPassport(passport);                                  // Переделываем на Optional
        Optional<User> user = findByPassport(passport);                              // Переделываем на Optional
        Optional<Account> rsl = Optional.empty();                                    // Переделываем на Optional
        //if (user != null) {                                                        // Переделываем на Optional
        if (user.isPresent()) {                                                      // Переделываем на Optional
           // List<Account> accounts = users.get(user);                              // Переделываем на Optional
            List<Account> accounts = users.get(user.get());                          // Переделываем на Optional
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                   // return account;                                                // Переделываем на Optional
                    rsl = Optional.of(account);                                      // Переделываем на Optional
                    break;                                                           // Переделываем на Optional
                }
            }
        }
        //return null;                                                               // Переделываем на Optional
        return rsl;                                                                  // Переделываем на Optional


       /* User user = findByPassport(passport);                                   // Переделываем на stream api :
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;*/
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
       // Account out = findByRequisite(srcPassport, srcRequisite);                       // Переделываем на Optional
       // Account in = findByRequisite(destPassport, destRequisite);                      // Переделываем на Optional
        Optional<Account> out = findByRequisite(srcPassport, srcRequisite);               // Переделываем на Optional
        Optional<Account> in = findByRequisite(destPassport, destRequisite);              // Переделываем на Optional
        //if (out != null && in != null && out.getBalance() >= amount) {                  // Переделываем на Optional
            //if (out.getBalance() >= amount) {                                           // Переделываем на Optional
           //in.setBalance(in.getBalance() + amount);                                     // Переделываем на Optional
          // out.setBalance(out.getBalance() - amount);                                   // Переделываем на Optional
        if (out.isPresent() && in.isPresent() && out.get().getBalance() >= amount) {                                                 // Переделываем на Optional
            in.get().setBalance(in.get().getBalance() + amount);                                      // Переделываем на Optional
            out.get().setBalance(out.get().getBalance() - amount);                                    // Переделываем на Optional
            rsl = true;
        }
        return rsl;
    }

}