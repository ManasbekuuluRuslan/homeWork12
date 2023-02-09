public class Ttriangle {
    private double uzunu;
    private double tuurasy;

    public Ttriangle(double uzunu , double tuurasy){
        this.uzunu = uzunu;
        this.tuurasy = tuurasy;

    }
    public void setUzunu(double uzunu) {
        this.uzunu = uzunu;
    }

    public void setTuurasy(double tuurasy) {
        this.tuurasy = tuurasy;
    }

    public double getUzunu() {
        return uzunu;
    }
    public double getTuurasy() {
        return tuurasy;
    }
    public double kvadraty(){
       return (uzunu * tuurasy) /2;
    }
}
