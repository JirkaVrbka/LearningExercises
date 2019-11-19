package Task2;

import Enums.Gender;
import Task1.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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
        for(Map.Entry<Integer, Person> entry : values.entrySet()){
            Person currentPerson = entry.getValue();
            int currentPersonId = entry.getKey();

            if(currentPersonId > ID_GENERATOR){
                ID_GENERATOR = currentPersonId + 1;
            }

            database.put(currentPersonId, currentPerson);
        }
    }

    /**
     * Get next unique id using ID_GENERATOR
     * @return new (not used) id
     */
    private int getNextId(){
        // TODO
        return ID_GENERATOR++;
    }

    /**
     * Gets Person with specific id in database
     * @param id to be found by
     * @return Person if found, null otherwise
     */
    public Person get(int id){
        return database.get(id);
    }

    /**
     * Gets all people with given age
     * @param age to be found by
     * @return all people with given age
     */
    public Map<Integer, Person> get(byte age) {
        return database.entrySet().stream().filter(e -> e.getValue().getAge() == age).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Gets all people with given name
     * @param name to be found by
     * @return all people with given name
     */
    public Map<Integer, Person> get(String name){
        return database.entrySet().stream().filter(e -> e.getValue().getName().equals(name)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Gets all people that has given name and surname
     * @param name to be found by
     * @param surname to be found by
     * @return all people with given name and surname
     */
    public Map<Integer, Person> get(String name, String surname){
        return database.entrySet().stream().filter(e -> e.getValue().getName().equals(name) && e.getValue().getSurname().equals(surname)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Get all people from database based on given gender
     * @param gender to be selected by
     * @return all people with specified gender
     */
    public Map<Integer, Person> get(Gender gender){
        return database.entrySet().stream().filter(e -> e.getValue().getGender() == gender).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Get all people from database
     * @return all people from database
     */
    public Map<Integer, Person> get(){
        //TODO
        return this.copy().database;
    }

    /**
     * Adds person into database with new unique id if not added already
     * @param person to be added
     * @return true if person added, false otherwise (person is already in)
     */
    public boolean addEntity(Person person){
        // TODO
        if(!database.containsValue(person)) {
            database.put(getNextId(), person);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Check if id exists, if yes, replace person with that id, otherwise does nothing
     * @param id id to be found
     * @param person to be replaced with
     * @return true if person replaced, false otherwise
     */
    public boolean addEntity(int id, Person person){
        // TODO
        if(database.containsKey(id) && !database.containsValue(person)) {
            database.put(id, person);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Removes person with id
     * @param id person id that should be removed
     * @return Person that was removed (null if nobody was removed)
     */
    public Person remove(int id){
        //TODO
        return database.remove(id);
    }


    /**
     * Removes person from database
     * @param person person that should be removed
     * @return Person that was removed (null if nobody was removed)
     */
    public Person remove(Person person){
        // TODO
        int id = -1;
        for(Map.Entry<Integer, Person> entry : database.entrySet()){
            Person currentPerson = entry.getValue();
            int currentPersonId = entry.getKey();

            if(currentPerson.equals(person)){
                id = currentPersonId;
            }
        }

        return remove(id);
    }

    /**
     * Number of people in database
     * @return number of people in database
     */
    public int getPeopleCount(){
        // TODO
        return database.size();
    }

    /**
     * Copies current database into new one (does copy of all people in it)
     * @return copy of database
     */
    public Database copy(){
        Database copy = new Database();
        database.forEach((k,v) -> copy.database.put(k, v.copy()));
        copy.ID_GENERATOR = ID_GENERATOR;
        return copy;
    }


}
