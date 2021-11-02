package LabForInterface;

public class City implements Comparable<City> {

    private String cityName;
    private double temperature;

    public City() {
        cityName = " No name";
        temperature = 4;
    }

    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City o) {
        if(temperature>o.temperature)
            return 1 ;
        else if (temperature==o.temperature)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
