package ObjectsAndClasses;

public class Student {
private String firstName;
private String lastName;
private int age;
private String homeTown;

    public  Student(String firstName , String lastName, int age , String hometown) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.homeTown = hometown;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }


public String getFirstName() {
    return this.firstName;
}
public void setFirstName() {
    this.firstName = firstName;
}


}
