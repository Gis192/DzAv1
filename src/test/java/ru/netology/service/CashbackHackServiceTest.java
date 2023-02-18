package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
