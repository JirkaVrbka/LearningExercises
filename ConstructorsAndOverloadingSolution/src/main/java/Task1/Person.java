package Task1;

import Enums.Gender;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private byte age;
    private Gender gender;


    /**
     * Creates new Person with given values.
     * age is set to value to be recognized as invalid age.
     * Gender is set to unknown
     * @param name of person
     * @param surname of person
     */
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        age = -1;
        gender = Gender.UNKNOWN;
    }


    /**
     * Creates new Person.
     * Counts person age using date of birth
     * @param dateBirth year of birth of person
     */
    public Person(String name, String surname, int dateBirth){
        //TODO save values. Use constructor above and save traditionally other values
        this(name, surname);
        age = (byte) (LocalDateTime.now().getYear() - dateBirth);
    }


    /**
     * Creates new Person.
     * Counts person age using date of birth
     * @param dateBirth year of birth of person
     * @param male person is male if true, female if false
     */
    public Person(String name, String surname, int dateBirth, boolean male){
        //TODO save values. Use constructor above and save traditionally other values
        this(name, surname, dateBirth);
        gender = male ? Gender.MALE : Gender.FEMALE; // this is shorted if else statement viz https://en.wikipedia.org/wiki/%3F:
    }

    public Person(Person person){
        // TODO copy values of given person to create new one. Use already created constructor
        this(person.name, person.surname);
        this.age = person.age;
        this.gender = person.gender;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    /**
     * Copies values of current Person and returns the new one
     * @return
     */
    public Person copy(){
        // TODO create copy of current Person using constructor
        return new Person(this);
    }

    /**
     * Create representation if Person as String in format:
     * name surname (male): age
     *
     * Example:
     * Jon Doe (male): 45
     *
     * or
     *
     * Liza Simpson (female): 8
     *
     * If some information is not present do not show it.
     * Example:
     * Joe Doe: 45
     *
     * or
     *
     * Joe Doe (male)
     *
     * @return representation of Person
     */
    @Override
    public String toString(){
        // TODO create copy of current Person using constructor
        String maleFemale = gender == Gender.MALE ? " (male) " : (gender == Gender.FEMALE ? " (female) " : "");
        String ageString = age != -1 ? ": " + age : "";

        return name
                + " "
                + surname
                + maleFemale
                + ageString;
    }

    /**
     * Method to compare two object of type Person.
     * @param o to be compared with
     * @return true if all parameters are the same or objects are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                gender == person.gender;
    }
}
