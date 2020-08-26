package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> optUser = findByPassport(passport);
        if (optUser.isPresent()) {
            List<Account> accounts = users.get(optUser.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> optUser = findByPassport(passport);
        if (optUser.isPresent()) {
            List<Account> accounts = users.get(optUser.get());
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return Optional.of(account);
                }
            }
        }
        return Optional.empty();
    }

    public boolean transferMoney(
            String srcPassport, String srcRequisites,
            String destPassport, String destRequisites,
            double amount) {
        Optional<Account> optSrcAccount = findByRequisite(srcPassport, srcRequisites);
        Optional<Account> optDestAccount = findByRequisite(destPassport, destRequisites);
        if (optSrcAccount.isPresent() && optDestAccount.isPresent()) {
            Account srcAccount = optSrcAccount.get();
            Account destAccount = optDestAccount.get();
            if (srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                return true;
            }
        }
        return false;
    }
}
