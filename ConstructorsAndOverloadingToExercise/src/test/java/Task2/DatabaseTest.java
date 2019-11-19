package Task2;

import Enums.Gender;
import Task1.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;

    @BeforeEach
    void before(){
        Map<Integer, Person> map = new HashMap<>();
        map.put(0, new Person("a","a", 1990, true));
        map.put(1, new Person("b","b", 1991, false));
        map.put(2, new Person("c","c", 1992));
        map.put(3, new Person("d","d"));

        database = new Database(map);
    }

    @Test
    void addEntity() {
        Person p = new Person("e", "e");
        assertTrue(database.addEntity(p));
        assertFalse(database.addEntity(p));


        assertFalse(database.addEntity(4, p));
        assertFalse(database.addEntity(1, p));
        assertTrue(database.addEntity(3, new Person("f", "f")));
        assertFalse(database.addEntity(14, p));
    }

    @Test
    void remove() {
        assertNotNull(database.remove(0));
        assertNull(database.remove(0));

        Person p = new Person("a", "a");
        database.addEntity(p);
        assertNotNull(database.remove(p));
        assertNull(database.remove(new Person("g", "g")));
    }

    @Test
    void getPeopleCount() {
        assertEquals(4, database.getPeopleCount());

        database.addEntity(new Person("a", "b"));
        assertEquals(5, database.getPeopleCount());
    }

    @Test
    void getById(){
        Person p = new Person("a", "a");

        database.addEntity(0, p);
        assertSame(p, database.get((int) 0));
        assertNotSame(p, database.get((int) 1));
        assertNotSame(p, database.get((int) 2));
    }

    @Test
    void getByName(){
        Person p = new Person("b", "b");

        database.addEntity(0, p);
        assertEquals(2, database.get("b").size());

        for(Person person : database.get("b").values()){
            assertEquals("b", person.getName());
        }
    }

    @Test
    void getByAge(){
        Person p = new Person("b", "b", LocalDateTime.now().getYear()-1);
        Person p2 = new Person("bc", "b", LocalDateTime.now().getYear()-1);

        database.addEntity(p);
        database.addEntity(p2);

        assertEquals(2, database.get((byte) 1).size());

        for(Person person : database.get((byte)1).values()){
            assertEquals(1, person.getAge());
        }
    }

    @Test
    void getByGender(){
        Person p = new Person("b", "b", LocalDateTime.now().getYear()-1, true);
        Person p2 = new Person("bc", "b", LocalDateTime.now().getYear()-1);

        database.addEntity(p);
        database.addEntity(p2);

        assertEquals(2, database.get(Gender.MALE).size());

        for(Person person : database.get(Gender.MALE).values()){
            assertEquals(Gender.MALE, person.getGender());
        }
    }

    @Test
    void getByNameSurname(){
        Person p = new Person("b", "b", LocalDateTime.now().getYear()-1, true);
        Person p2 = new Person("bc", "b", LocalDateTime.now().getYear()-1);

        database.addEntity(p);
        database.addEntity(p2);

        assertEquals(2, database.get("b", "b").size());

        for(Person person : database.get("b", "b").values()){
            assertEquals("b", person.getName());
            assertEquals("b", person.getSurname());
        }
    }

    @Test
    void copy() {
        Database copy = database.copy();

        assertNotSame(database, copy);
        assertEquals(database.getPeopleCount(), copy.getPeopleCount());

        for(Map.Entry e : database.get().entrySet()){
            assertEquals(e.getValue(), copy.get((int)e.getKey()));
            assertNotSame(e.getValue(), copy.get((int)e.getKey()));
        }
    }
}