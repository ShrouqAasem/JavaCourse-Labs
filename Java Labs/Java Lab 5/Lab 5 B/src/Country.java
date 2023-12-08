
public class Country {

    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private int capital;


    public Country(String code, String name, String continent, double surfaceArea, int population, double gnp, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public int getCapital() {
        return capital;
    }


    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", surfaceArea=" + surfaceArea
                + ", population=" + population + ", gnp=" + gnp + ", capital=" + capital + "]";
    }
}
