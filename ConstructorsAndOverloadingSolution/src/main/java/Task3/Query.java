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
        this.database = new Database();
        for(Map.Entry<Integer, Person> person : people.entrySet()){
            this.database.addEntity(person.getKey(), person.getValue());
        }
    }

    public Query(List<Person> people){
        // TODO save people
        this.database = new Database();
        for(Person person : people){
            this.database.addEntity(person);
        }
    }

    public Query(Database database){
        // TODO save copy of databased people
        this.database = database.copy();
    }

    /**
     * Select people that are younger than 18
     * @return this to be able additional queries
     */
    public Query whereAgeBelow(int age){
        Map<Integer, Person> result = new HashMap<>();
        for(byte i = 0; i < age; i++){
            result.putAll(database.get(i));
        }
        database = new Database(result);
        return this;
    }

    /**
     * @return this to be able additional queries
     */
    public Query whereAgeAbove(int age){
        // TODO do NOT create new Query
        Map<Integer, Person> underaged = new HashMap<>();
        for(byte i = -1; i <= age; i++){
            underaged.putAll(database.get(i));
        }

        Map<Integer, Person> result = database.get();

        for(int id : underaged.keySet()){
            result.remove(id);
        }

        database = new Database(result);
        return this;
    }

    /**
     * Select people that has specific string in (name or surname)
     * @param include string that has to be in person name
     * @return this to be able additional queries
     */
    public Query whereNameSurnameContains(String include){
        // TODO do NOT create new Query
        Map<Integer, Person> result = database.get();
        for(Map.Entry<Integer, Person> entry : database.get().entrySet()){
            Person currentPerson = entry.getValue();

            if(!(currentPerson.getName().contains(include) || currentPerson.getSurname().contains(include))){
                result.remove(entry.getKey());
            }
        }

        database = new Database(result);

        return this;
    }

    /**
     * Select people that has specific string in (name or surname) it but does not have another string
     * @param include string that has to be in person name
     * @param exclude string that has not to be in person name
     * @return this to be able additional queries
     */
    public Query whereNameSurnameContains(String include, String exclude){
        // TODO do NOT create new Query

        Map<Integer, Person> result = database.get();
        for(Map.Entry<Integer, Person> entry : database.get().entrySet()){
            Person currentPerson = entry.getValue();

            if(!(currentPerson.getName().contains(include) || currentPerson.getSurname().contains(include))
                || (currentPerson.getName().contains(exclude) || currentPerson.getSurname().contains(exclude))){
                result.remove(entry.getKey());
            }
        }

        database = new Database(result);
        return this;
    }

    /**
     * Select people that has specified gender
     * @param gender gender to be find
     * @return this to be able additional queries
     */
    public Query whereGender(Gender gender){
        // TODO do NOT create new Query
        database = new Database(database.get(gender));
        return this;
    }

    /**
     * Select people that has gender1 or gender2
     * @param gender1 gender to be find
     * @param gender2 gender to be find
     * @return this to be able additional queries
     */
    public Query whereGender(Gender gender1, Gender gender2){
        // TODO do NOT create new Query
        Map<Integer, Person> result = database.get(gender1);
        result.putAll(database.get(gender2));
        database = new Database(result);
        return this;
    }

    /**
     * Get all people from database
     * @return all people
     */
    public Database get(){
        // TODO return saved people
        return database;
    }



}
