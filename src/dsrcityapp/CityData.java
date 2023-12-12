package dsrcityapp;

import java.util.Objects;

/**
 *
 * @author ec2125613
 */
public class CityData 
        
{

    public CityData() {}
    
    private String city; // Holds the name of the city.
    private double growth; //holds population growth.
    private double latitud; //gps coordinates
    private double longitude;
    private int    population;
    private int    rank;
    private String state;

    public CityData(String city,
                    double growth,
                    double latitud,
                    double longitude,
                    int population,
                    int rank,
                    String state) 
    {
        this.city = city;
        this.growth = growth;
        this.latitud = latitud;
        this.longitude = longitude;
        this.population = population;
        this.rank = rank;
        this.state = state;
    }

    
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.population;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CityData other = (CityData) obj;
        if (Double.doubleToLongBits(this.latitud) != Double.doubleToLongBits(other.latitud)) {
            return false;
        }
        if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(other.longitude)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CityData{" + "city=" + city + 
                             ", growth=" + growth + 
                             ", latitud=" + latitud + 
                             ", longitude=" + longitude + 
                             ", population=" + population + 
                             ", rank=" + rank + 
                             ", state=" + state + '}';
    }
    
    public void getMinName( CityData[] CityInfo){
        int minCity = CityInfo[0].getCity().length();
        int position   = -1; // outside of the array
        
        for (int k=1; k<CityInfo.length;k++)
        {
            if(CityInfo[k].getCity().length()<minCity)
            {
                minCity=CityInfo[k].getCity().length();
                position = k;
            }
        }
        
        if(position>=0)
        {
            System.out.println(CityInfo[position].getCity()+ " has the least letters");
        }
    }
}
