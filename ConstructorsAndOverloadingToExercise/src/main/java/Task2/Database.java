package Task2;

import Enums.Gender;
import Task1.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Database {

    private int ID_GENERATOR = 0;
    // TODO variables
    private Map<Integer, Person> database = new HashMap<>();

    /**
     * Basic constructor
     */
    public Database(){
    }

    /**
     * Create Database with given data.
     * Ids are persistent.
     * @param values to be added
     */
    public Database(Map<Integer, Person> values){
        //TODO note: Dont forget to update ID_GENERATOR to be bigger than all given id`s of people to persist uniquenest
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Get next unique id using ID_GENERATOR
     * @return new (not used) id
     */
    private int getNextId(){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Gets Person with specific id in database
     * @param id to be found by
     * @return Person if found, null otherwise
     */
    public Person get(int id){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Gets all people with given age
     * @param age to be found by
     * @return all people with given age
     */
    public Map<Integer, Person> get(byte age) {
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Gets all people with given name
     * @param name to be found by
     * @return all people with given name
     */
    public Map<Integer, Person> get(String name){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Gets all people that has given name and surname
     * @param name to be found by
     * @param surname to be found by
     * @return all people with given name and surname
     */
    public Map<Integer, Person> get(String name, String surname){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Get all people from database based on given gender
     * @param gender to be selected by
     * @return all people with specified gender
     */
    public Map<Integer, Person> get(Gender gender){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Get all people from database
     * @return all people from database
     */
    public Map<Integer, Person> get(){
        //TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Adds person into database with new unique id if not added already
     * @param person to be added
     * @return true if person added, false otherwise (person is already in)
     */
    public boolean addEntity(Person person){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Check if id exists, if yes and person is not already in DB, replace person with that id, otherwise does nothing
     * @param id id to be found
     * @param person to be replaced with
     * @return true if person replaced, false otherwise
     */
    public boolean addEntity(int id, Person person){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Removes person with id
     * @param id person id that should be removed
     * @return Person that was removed (null if nobody was removed)
     */
    public Person remove(int id){
        //TODO
        throw new RuntimeException("Not implemented yet");
    }


    /**
     * Removes person from database
     * @param person person that should be removed
     * @return Person that was removed (null if nobody was removed)
     */
    public Person remove(Person person){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Number of people in database
     * @return number of people in database
     */
    public int getPeopleCount(){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Copies current database into new one (does copy of all people in it)
     * @return copy of database
     */
    public Database copy(){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }


}
