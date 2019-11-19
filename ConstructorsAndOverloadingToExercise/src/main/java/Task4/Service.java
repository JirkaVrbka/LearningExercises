package Task4;

import Enums.Gender;
import Task1.Person;
import Task2.Database;
import Task3.Query;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private Database database;

    /**
     * Saves database to work with in a future
     * @param database
     */
    public Service(Database database){
        //TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     *
     * @return all females with age below 18
     */
    public List<Person> getUnderageFemales(){
        // TODO use Query for this task
        throw new RuntimeException("Not implemented yet");
    }

    /**
     *
     * @return all adult males
     */
    public List<Person> getAdultMales(){
        // TODO use Query for this task
        throw new RuntimeException("Not implemented yet");
    }

    /**
     *
     * @return all adult males or females
     */
    public List<Person> getAdultMalesOrFemales(){
        // TODO use Query for this task
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Removes all adults from database
     */
    public void removeAdults(){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Adds new person into database
     * @param person to be added
     * @return true if added
     */
    public boolean add(Person person){
        // TODO
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Get all people from database
     * @return all people
     */
    public List<Person> get(){
        //TODO
        throw new RuntimeException("Not implemented yet");
    }


}
