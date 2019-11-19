package Task3;

import Enums.Gender;
import Task1.Person;
import Task2.Database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Does queries under given database
 *
 */
public class Query {
    private Database database;

    public Query(Map<Integer, Person> people){
        // TODO save people
        throw new RuntimeException("Not implemented yet");
    }

    public Query(List<Person> people){
        // TODO save people
        throw new RuntimeException("Not implemented yet");
    }

    public Query(Database database){
        // TODO save copy of databased people
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Select people that are younger than 18
     * @return this to be able additional queries
     */
    public Query whereAgeBelow(int age){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return this to be able additional queries
     */
    public Query whereAgeAbove(int age){
        // TODO do NOT create new Query
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Select people that has specific string in (name or surname)
     * @param include string that has to be in person name
     * @return this to be able additional queries
     */
    public Query whereNameSurnameContains(String include){
        // TODO do NOT create new Query
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Select people that has specific string in (name or surname) it but does not have another string
     * @param include string that has to be in person name
     * @param exclude string that has not to be in person name
     * @return this to be able additional queries
     */
    public Query whereNameSurnameContains(String include, String exclude){
        // TODO do NOT create new Query
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Select people that has specified gender
     * @param gender gender to be find
     * @return this to be able additional queries
     */
    public Query whereGender(Gender gender){
        // TODO do NOT create new Query
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Select people that has gender1 or gender2
     * @param gender1 gender to be find
     * @param gender2 gender to be find
     * @return this to be able additional queries
     */
    public Query whereGender(Gender gender1, Gender gender2){
        // TODO do NOT create new Query
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Get all people from database
     * @return all people
     */
    public Database get(){
        // TODO return saved people
        throw new RuntimeException("Not implemented yet");
    }



}
