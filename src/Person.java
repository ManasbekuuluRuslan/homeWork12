public class Person {
    private String firstName;
    private String lastName;
    private String professional;

    public Person(String firstName, String lastName, String professional){
        this.firstName = firstName;
        this.lastName = lastName;
        this.professional = professional;
    }
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setProfessional(String professional) {
        this.professional = professional;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getProfessional() {
        return professional;
    }
}

