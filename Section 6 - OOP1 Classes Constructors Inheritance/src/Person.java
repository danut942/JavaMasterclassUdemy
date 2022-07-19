public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public boolean isTeen () {
        if (this.age > 12 && this.age < 22){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName () {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "...";
        } else if (this.firstName.isEmpty()) {
            return lastName;
        } else if (this.lastName.isEmpty()) {
            return firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}
