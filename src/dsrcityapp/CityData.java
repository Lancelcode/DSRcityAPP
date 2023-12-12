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
    
    public void getMaxName(CityData[] CityInfo) 
    {
        int maxCity = CityInfo[0].getCity().length();
        int position = -1; // outside of the array

        for (int k = 1; k < CityInfo.length; k++) {
            if (CityInfo[k].getCity().length() > maxCity) {
                maxCity = CityInfo[k].getCity().length();
                position = k;
            }
        }

        if (position >= 0) {
            System.out.println(CityInfo[position].getCity() + " has the most letters");
        }
    }

    public void countRanges(CityData[] cityData) {
        int countAM = 0;
        int countNZ = 0;

        for (CityData cd : cityData) {
            char firstChar = Character.toUpperCase(cd.getCity().charAt(0));

            if (firstChar >= 'A' && firstChar <= 'M') {
                countAM++;
            } else if (firstChar >= 'N' && firstChar <= 'Z') {
                countNZ++;
            }
        }

        // Compare the counts
        if (countAM > countNZ) {
            System.out.println("There are more elements in the range A to M.");
        } else if (countNZ > countAM) {
            System.out.println("There are more elements in the range N to Z.");
        } else {
            System.out.println("The counts are equal.");
        }
    }
    
    // New method to find the town or city with the largest latitude
    public void findMaxLatitudeCity(CityData[] cityData) {
        double maxLatitude = cityData[0].getLatitud();
        int position = 0;

        for (int k = 1; k < cityData.length; k++) {
            if (cityData[k].getLatitud() > maxLatitude) {
                maxLatitude = cityData[k].getLatitud();
                position = k;
            }
        }

        System.out.println(cityData[position].getCity() + " has the largest latitude.");
    }

    // New method to find the town or city with the smallest latitude
    public void findMinLatitudeCity(CityData[] cityData) {
        double minLatitude = cityData[0].getLatitud();
        int position = 0;

        for (int k = 1; k < cityData.length; k++) {
            if (cityData[k].getLatitud() < minLatitude) {
                minLatitude = cityData[k].getLatitud();
                position = k;
            }
        }

        System.out.println(cityData[position].getCity() + " has the smallest latitude.");
    }

    // New method to find the town or city with the smallest longitude
    public void findMinLongitudeCity(CityData[] cityData) {
        double minLongitude = cityData[0].getLongitude();
        int position = 0;

        for (int k = 1; k < cityData.length; k++) {
            if (cityData[k].getLongitude() < minLongitude) {
                minLongitude = cityData[k].getLongitude();
                position = k;
            }
        }

        System.out.println(cityData[position].getCity() + " has the smallest longitude.");
    }

    // New method to find the town or city with the largest longitude
    public void findMaxLongitudeCity(CityData[] cityData) {
        double maxLongitude = cityData[0].getLongitude();
        int position = 0;

        for (int k = 1; k < cityData.length; k++) {
            if (cityData[k].getLongitude() > maxLongitude) {
                maxLongitude = cityData[k].getLongitude();
                position = k;
            }
        }

        System.out.println(cityData[position].getCity() + " has the largest longitude.");
    }
    
    // New method to generate city code
    public String generateCityCode() {
        String cityCode = "";

        // Ensure the city name and state have at least 3 characters each
        if (city.length() >= 3 && state.length() >= 3) {
            cityCode = city.substring(0, 3).toUpperCase() + state.substring(0, 3).toUpperCase();
        }

        return cityCode;
    }
    
    
}
