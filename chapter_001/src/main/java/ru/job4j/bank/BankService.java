package ru.job4j.bank;

import java.util.*;
/**
 * The class describes the operation of the bank transfer system model,
 * with the addition of users, their accounts, search by username and account,
 * and transfer of money between accounts
 * @author SERGEY BARANOV
 * @version 1.0
 */
public class BankService {
    /**
     * The task is stored in the map,
     * the key in which is the User model, and the value is
     * Account model List
     */
    private Map<User, List<Account>> users = new HashMap<>();
    /**
     * The method accepts an object of the User type as input
     * and adds it to the map, creating for it a Sheet of type
     * Account, along the way checking that such an element is not yet in
     * map.
     * @param user is the User model object that is added to
     * card.
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }
   /**
       * The method accepts an object of type Account as input
       * and a line with the name of the User model passport
       * and then, using the FindByPassport method, finds
       * matching User model object, checks that it is not
       * null, checks that this account is no longer attached to the object
       * and then adds an account.
       * @param passport - a string with the name of the object's passport
       * type User
       * @param account - a model object of type Account
       */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccount = users.get(user.get());
            if (!userAccount.contains(account)) {
                userAccount.add(account);
                users.put(user.get(), userAccount);
            }
        }
    }
    /**
     * The method accepts a string with the name of the passport as input
       * User models
       * and gives the first match from the map as an object
       * User type.
       * @param passport - a line with the name of the object's passport
       * type User
       * @return object User type.
       */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }
     /**
       * The method accepts a string with the name of the passport as input
       * User's model and a string with the name of the model's details
       * Account
       * further, according to the passport, we find an object of the User type
       * and then in the map using a key of the User type, we find the Account, by
       * requisites.
       * @param passport - a string with the name of the object's passport
       * type User
       * @param requisite - a string with the name of the object's requisites
       * type Account
       * @return object Account type.
       */
        public Optional<Account> findByRequisite(String passport, String requisite) {
            Optional<User> user = findByPassport(passport);
            Optional<Account> rsl = Optional.empty();
            return user.map(value -> users.get(value)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst())
                    .orElse(rsl);
        }
    /**
     * the method finds the accounts of the sender and the recipient,
     * checks the balance of the sender, and, if there is enough money, transfers
     * The method accepts as input a :
     * @param srcPassport - string with the name of the sender's passport
     * @param srcRequisite - string with the name of the sender's requisites
     * @param destPassport - string with the name of the recipient's passport
     * @param destRequisite - string with the name of the recipient's requisites
     * @param amount - transfer amount
     *
     * @return money transfer result - true/false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> out = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> in = findByRequisite(destPassport, destRequisite);
        if (out.isPresent() && in.isPresent() && out.get().getBalance() >= amount) {
            in.get().setBalance(in.get().getBalance() + amount);
            out.get().setBalance(out.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

}