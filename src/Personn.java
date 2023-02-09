public class Personn {
    private  String name;
    private int age;
    private String work;
    private int salary;
    private Phone phone;

    public Personn(String name, int age, String work, int salary,Phone phone){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone  getPhone() {
        return phone;
    }
}
