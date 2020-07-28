package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    protected final User emptyUser = new User("empty", "empty");
    protected final Account emptyAccount = new Account("empty", 0);

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        List<Account> accounts = users.get(findByPassport(passport));
        try {
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        } catch (NullPointerException e) {
            System.out.println("Can't find User with passport:" + passport);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return emptyUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = users.get(findByPassport(passport));
        try {
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Can't find User with passport:" + passport);
        }
        return emptyAccount;
    }

    public boolean transferMoney(
            String srcPassport, String srcRequisites,
            String destPassport, String destRequisites,
            double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisites);
        Account destAccount = findByRequisite(destPassport, destRequisites);
        if (srcAccount != emptyAccount && destAccount != emptyAccount && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return rsl;
    }
}
