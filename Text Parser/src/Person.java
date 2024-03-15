import java.util.Arrays;

public class Person {

    private String name;
    private String firstName;
    private String city;

    Person(String datePerson){
        String[] dateExtrase = datePerson.split("/");

        String[] numeIntreg = dateExtrase[0].split("\\.");

        this.name = numeIntreg[1];
        this.firstName = numeIntreg[0];
        this.city = dateExtrase[1];
    }

    public String getInfo(){
        return firstName + " " + name + " " + city;
    }

}


