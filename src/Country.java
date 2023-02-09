public class Country {
    private   String name;
    private  String president;
    private  int population;
    public Country(String name, String president, int population){
        this.name = name;
        this.president = president;
        this.population = population;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPresident(String president) {
        this.president = president;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public String getPresident() {
        return president;
    }
    public int getPopulation() {
        return population;
    }
}

