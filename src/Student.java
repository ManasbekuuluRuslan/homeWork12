import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfBrith;
    private int phoneNumber;
    private String nationality;

    public Student(String name, LocalDate dateOfBrith,String nationality ,int phoneNumber){
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }
}
