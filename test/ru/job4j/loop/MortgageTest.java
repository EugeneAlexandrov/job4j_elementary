package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(150, 150, 50);
        assertThat(year, is(2));
    }

    @Test
    public void whenLoanEqualSalaryYear() {
        int year = Mortgage.year(100, 150, 50);
        assertThat(year, is(1));
    }
}