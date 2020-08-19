package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    List<Profile> profiles;

    @Before
    public void setUp() throws Exception {
        profiles = List.of(
                new Profile("User1", new Address("Moscow", "Smolnaya", 15, 15)),
                new Profile("User2", new Address("Saint-Petersburg", "Nevskyi prospect", 10, 4)),
                new Profile("User3", new Address("Astrakhan", "Vlasova", 4, 35)),
                new Profile("User4", new Address("Saint-Petersburg", "Nevskyi prospect", 10, 4))
        );
    }

    @Test
    public void testCollect() {
        List<Address> rsl = Profiles.collect(profiles);
        List<Address> expected = List.of(
                new Address("Astrakhan", "Vlasova", 4, 35),
                new Address("Moscow", "Smolnaya", 15, 15),
                new Address("Saint-Petersburg", "Nevskyi prospect", 10, 4)
        );
        assertEquals(rsl, expected);
    }
}