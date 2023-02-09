public class Shark {
     private String color;
     private int weight;
     private int age;
     public Shark(){

     }
     public Shark(String color, int weight, int age){
         this.color = color;
         this.weight = weight;
         this.age = age;

     }
    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
