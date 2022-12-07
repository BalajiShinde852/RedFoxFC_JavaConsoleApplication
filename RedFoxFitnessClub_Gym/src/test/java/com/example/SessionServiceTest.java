package com.example;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.example.Model.Session;
import com.example.Service.SessionService;

public class SessionServiceTest {

    @Test
    public void test1() {
        Session s = new Session();
        s.setMaxMembers(25);

        assertNotEquals(s,new SessionService().publishSession());
    }

    @Test
    public void test2() {
        Session s = new Session();
        s.setMaxMembers(25);
        s.setRemainingMembers(0);

        assertNotEquals(s,new SessionService().publishOneonOne());
    }
    
}
