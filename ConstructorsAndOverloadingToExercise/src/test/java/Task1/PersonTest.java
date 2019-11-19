package Task1;

import Enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetAge() {
        Person p = new Person("Ales", "Hornak");
        Assertions.assertTrue(p.getAge() < 0);


        p = new Person("Ales", "Hornak", 1996);
        Assertions.assertEquals(LocalDateTime.now().getYear() - 1996, p.getAge());
    }

    @Test
    void getGenderTest() {
        Person p = new Person("Ales", "Hornak");
        assertSame(Gender.UNKNOWN, p.getGender());

        p = new Person("Ales", "Hornak", 1996);
        assertSame(Gender.UNKNOWN, p.getGender());

        p = new Person("Ales", "Hornak", 1996, true);
        assertSame(Gender.MALE, p.getGender());

        p = new Person("Ales", "Hornak", 1996, false);
        assertSame(Gender.FEMALE, p.getGender());
    }

    @Test
    void copy() {
        Person origin = new Person("Ales", "Hornak", 1996, false);
        Person copy = origin.copy();

        assertNotSame(origin, copy);
        assertEquals(origin.getName(), copy.getName());
        assertEquals(origin.getSurname(), copy.getSurname());
        assertEquals(origin.getGender(), copy.getGender());
        assertEquals(origin.getAge(), copy.getAge());


        origin = new Person("Ales", "Hornak");
        copy = origin.copy();

        assertNotSame(origin, copy);
        assertEquals(origin.getName(), copy.getName());
        assertEquals(origin.getSurname(), copy.getSurname());
        assertEquals(origin.getGender(), copy.getGender());
        assertEquals(origin.getAge(), copy.getAge());
    }
}