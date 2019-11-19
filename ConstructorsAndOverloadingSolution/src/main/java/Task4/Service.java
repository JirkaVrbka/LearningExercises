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
        this.database = database;
    }

    /**
     *
     * @return all females with age below 18
     */
    public List<Person> getUnderageFemales(){
        // TODO
        return new ArrayList<>(new Query(database).whereAgeBelow(18).whereGender(Gender.FEMALE).get().get().values());
    }

    /**
     *
     * @return all adult males
     */
    public List<Person> getAdultMales(){
        // TODO
        return new ArrayList<>(new Query(database).whereAgeAbove(17).whereGender(Gender.MALE).get().get().values());
    }

    /**
     *
     * @return all adult males or females
     */
    public List<Person> getAdultMalesOrFemales(){
        // TODO
        return new ArrayList<>(new Query(database).whereAgeAbove(17).whereGender(Gender.FEMALE, Gender.MALE).get().get().values());
    }

    /**
     * Removes all adults from database
     */
    public void removeAdults(){
        // TODO
        for(Person person : new Query(database).whereAgeAbove(17).get().get().values()){
            database.remove(person);
        }
    }

    /**
     * Adds new person into database
     * @param person to be added
     * @return true if added
     */
    public boolean add(Person person){
        // TODO
        return database.addEntity(person);
    }

    /**
     * Get all people from database
     * @return all people
     */
    public List<Person> get(){
        //TODO
        return new ArrayList<>(database.get().values());
    }


}
