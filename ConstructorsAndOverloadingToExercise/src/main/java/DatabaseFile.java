import Task1.Person;

import java.util.ArrayList;
import java.util.List;

public class DatabaseFile{
    public static List<Person> getPeople(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Adam", "Holec"));
        list.add(new Person("Pepa", "Holec", 1994, true));
        list.add(new Person("Eva", "Holec", 1995, false));
        list.add(new Person("Jirka", "Holc", 1984, true));
        list.add(new Person("Marcela", "Hec", 1594, false));
        list.add(new Person("Jarda", "Hol", 1990, true));
        list.add(new Person("Kaja", "Hoc", 1978, true));
        list.add(new Person("Marek", "Hole", 1968, true));
        list.add(new Person("Jitka", "Holemek", 1973, false));
        list.add(new Person("Michal", "Holecek", 2001, true));
        list.add(new Person("Lucka", "Holecep", 2003, false));
        list.add(new Person("Franta", "Holecok", 2010, true));
        list.add(new Person("Kamil", "Holecak", 1981, true));
        list.add(new Person("Beda", "Holec", 2013, true));
        list.add(new Person("Lenka", "K"));
        list.add(new Person("Pavel", "Kvetak"));
        list.add(new Person("Martina", "Holecova"));
        return list;
    }
}