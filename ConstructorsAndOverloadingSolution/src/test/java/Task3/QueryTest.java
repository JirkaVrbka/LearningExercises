package Task3;

import Enums.Gender;
import Task1.Person;
import Task2.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class QueryTest {

    private Query query;
    private static final int fifteen = LocalDateTime.now().getYear() - 15;

    @BeforeEach
    void generateQuery(){

        Map<Integer, Person> map = new HashMap<>();
        map.put(0, new Person("a","a", fifteen + 5, true));
        map.put(1, new Person("b","c", fifteen - 5, false));
        map.put(2, new Person("c","a", fifteen + 10));
        map.put(3, new Person("ca","c", fifteen - 10));
        map.put(4, new Person("cb","c", fifteen));
        map.put(5, new Person("d","d"));

        query = new Query(new Database(map));
    }

    @Test
    void whereAgeBelow() {
        Map<Integer, Person> result = query.whereAgeBelow(-44).get().get();
        assertEquals(0, result.size());

        generateQuery();
        result = query.whereAgeBelow(15).get().get();
        assertEquals(2, result.size());

        for(Person person : result.values()){
            assertTrue(person.getAge() < 15);
            assertEquals("a", person.getSurname());
        }
    }

    @Test
    void whereAgeAbove() {
        Map<Integer, Person> result = query.whereAgeAbove(100).get().get();
        assertEquals(0, result.size());

        generateQuery();
        result = query.whereAgeAbove(15).get().get();
        assertEquals(2, result.size());

        for(Person person : result.values()){
            assertTrue(person.getAge() > 15);
            assertEquals("c", person.getSurname());
        }
    }

    @Test
    void whereNameContains() {
        Map<Integer, Person> result = query.whereNameSurnameContains("cdd").get().get();
        assertEquals(0, result.size());

        generateQuery();
        result = query.whereNameSurnameContains("c").get().get();
        assertEquals(4, result.size());

        for(Person person : result.values()){
            assertTrue(person.getSurname().contains("c") || person.getName().contains("c"));
        }
    }

    @Test
    void whereNameContainsWithExclude() {
        Map<Integer, Person> result = query.whereNameSurnameContains("cdd", "").get().get();
        assertEquals(0, result.size());

        generateQuery();
        result = query.whereNameSurnameContains("c", "z").get().get();
        assertEquals(4, result.size());

        for(Person person : result.values()){
            assertTrue(person.getSurname().contains("c") || person.getName().contains("c"));
        }

        generateQuery();
        result = query.whereNameSurnameContains("c", "a").get().get();
        assertEquals(2, result.size());

        for(Person person : result.values()) {
            assertTrue(person.getSurname().contains("c") || person.getName().contains("c"));
            assertTrue(!person.getSurname().contains("a") && !person.getName().contains("a"));
        }
    }

    @Test
    void whereGender() {
        Map<Integer, Person> result = query.whereGender(Gender.MALE).get().get();
        assertEquals(1, result.size());
        for(Person person : result.values()){
            assertEquals(Gender.MALE, person.getGender());
        }

        generateQuery();
        result = query.whereGender(Gender.FEMALE).get().get();
        assertEquals(1, result.size());
        for(Person person : result.values()){
            assertEquals(Gender.FEMALE, person.getGender());
        }

        generateQuery();
        result = query.whereGender(Gender.UNKNOWN).get().get();
        assertEquals(4, result.size());
        for(Person person : result.values()){
            assertEquals(Gender.UNKNOWN, person.getGender());
        }
    }

    @Test
    void whereMultipleGenders() {
        Map<Integer, Person> result = query.whereGender(Gender.MALE, Gender.MALE).get().get();
        assertEquals(1, result.size());
        for(Person person : result.values()){
            assertEquals(Gender.MALE, person.getGender());
        }

        generateQuery();
        result = query.whereGender(Gender.FEMALE, Gender.MALE).get().get();
        assertEquals(2, result.size());
        for(Person person : result.values()){
            assertTrue(person.getGender() == Gender.MALE || person.getGender() == Gender.FEMALE);
        }
    }

}