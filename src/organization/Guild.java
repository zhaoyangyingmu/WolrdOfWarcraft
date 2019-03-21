package organization;

import account.Account;

import java.util.HashSet;
import java.util.Set;

public class Guild {
    Set<Account> members;
    public Guild() {
        members = new HashSet<>();
    }

    public void addMember(Account account) {
        members.add(account);
    }

    public void removeMember(Account account) {
        members.remove(account);
    }
}
