
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals (Object compared){
        // check if variables are located in the same position. if they are they are equal
        if(this == compared){
            return true;
        }
        // check if compared object is of the same type, if not of type Person then they are not equal
        if(!(compared instanceof Person)) {
            return false;
        }
        // convert the object into a Person object
        Person comparedPerson = (Person) compared;
        // check if values of the object variables are equal.
        if (this.name.equals(comparedPerson.name)&&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight &&
            this.birthday.equals(comparedPerson.birthday)){
            return true;
            }
        
        return false;
            
        
    }
}
