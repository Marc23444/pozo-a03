package baseline;

public class Employee {

    String firstName;
    String lastName;
    String position;
    String seperationDate;


    //Constructor sets the values of each employee
    public Employee(String firstName, String lastName, String position, String seperationDate)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.position = position;
        this.seperationDate = seperationDate;
    }

    //THESE 4 FUNCTIONS RETURN FIELDS, THEY ARE GETTER METHODS

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPosition()
    {
        return position;
    }

    public String getSeperationDate()
    {
        return seperationDate;
    }



}
