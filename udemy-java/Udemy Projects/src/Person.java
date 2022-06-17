public class Person {
    private String firstName, lastName;
    private int age;

    public void setFirstName(String nameIn) {
        this.firstName = nameIn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String nameIn) {
        this.lastName = nameIn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int ageIn) {
        if(ageIn<0 || ageIn>100) {
            this.age=0;
        }
        else {
            this.age = ageIn;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen () {
        if(age>12 && age <20) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getFullName() {
        boolean fNBlank, lNBlank;
        fNBlank = firstName.isEmpty();
        lNBlank = lastName.isEmpty();

        if(fNBlank && lNBlank) { //if both are blank return null
            return "";
        }
        else if(fNBlank && !lNBlank) { //if first is blank return last
            return lastName;
        }
        else if(!fNBlank && lNBlank) { //if last is blank return first
            return firstName;
        }
        else{
            return firstName + " " + lastName;
        }
    }
}
