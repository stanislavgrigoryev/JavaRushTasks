package com.javarush.task.jdk13.task41.task4103.blood;

import com.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() throws IOException {
        security = new SecuritySystem();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String login = reader.readLine();
        String password = reader.readLine();
        security.authorize(login, password);
        if (security.isAuthorized()) {
            db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized()) {
            db.getById(id);
        }
        return denied;
    }

    @Override
    public List<BloodSample> find(String request) {
        List<BloodSample> list = new ArrayList<>();
        if (security.isAuthorized()) {
            db.find(request);
        }
        list.add(denied);
        return list;
    }
}
