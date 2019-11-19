package Task4;

import Enums.Gender;
import Task1.Person;
import Task2.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceTest {
    private Service service;
    private static final int fifteen = LocalDateTime.now().getYear() - 15;

    @BeforeEach
    void generateService(){

        Map<Integer, Person> map = new HashMap<>();
        map.put(0, new Person("a","a", fifteen, true));
        map.put(1, new Person("b","c", fifteen - 20, false));
        map.put(2, new Person("c","a", fifteen + 10));
        map.put(3, new Person("ca","c", fifteen - 10));
        map.put(4, new Person("cb","c", fifteen));
        map.put(5, new Person("d","d"));

        service = new Service(new Database(map));
    }

    @Test
    void getUnderageFemales() {
        service.add(new Person("d", "d", fifteen, false));

        List<Person> result = service.getUnderageFemales();
        assertEquals(1, result.size());
        assertEquals(Gender.FEMALE, result.get(0).getGender());
        assertEquals(15, result.get(0).getAge());
    }

    @Test
    void getAdultMales() {
        service.add(new Person("d", "d", fifteen - 20, true));

        List<Person> result = service.getAdultMales();
        assertEquals(1, result.size());
        assertEquals(Gender.MALE, result.get(0).getGender());
        assertEquals(35, result.get(0).getAge());
    }

    @Test
    void getAdultMalesOrFemales() {
        service.add(new Person("d", "d", fifteen - 3, false));

        List<Person> result = service.getAdultMalesOrFemales();
        assertEquals(2, result.size());

        for(Person p : result){
            assertTrue(p.getGender() == Gender.MALE || p.getGender() == Gender.FEMALE);
            assertTrue(p.getAge() >= 18);
        }
    }

    @Test
    void removeAdults() {
        service.removeAdults();

        List<Person> result = service.getAdultMalesOrFemales();
        assertEquals(0, result.size());
    }
}