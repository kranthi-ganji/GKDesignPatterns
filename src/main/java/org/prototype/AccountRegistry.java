package org.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountRegistry {
    private static final Map<String, BankAccount> registry = new HashMap<>();

    static {
        registry.put("Savings", new BankAccount("Savings", 3.5, 1000));
        registry.put("Current", new BankAccount("Current", 0.0, 5000));
        registry.put("Premium", new BankAccount("Premium", 5.0, 10000));
    }

    public static BankAccount getAccount(String type) {
        BankAccount prototype = registry.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("Unknown account type: " + type);
    }
}
