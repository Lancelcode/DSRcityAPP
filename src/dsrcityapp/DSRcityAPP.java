package dsrcityapp;

/**
 *
 * @author ec2125613
 */
import java.util.Arrays;
import java.util.Comparator;

public class DSRcityAPP {

    public static void main(String[] args) {
        DSRFile dsr = new DSRFile();
        CityData city = new CityData();
        CityData[] cd = dsr.loadFile("1000 Usa Cities.txt");

        // Sort the data based on absolute latitude using a comparator
        Arrays.sort(cd, new AbsoluteLatitudeComparator());

        // Display the sorted data with country, city, and coordinates
        for (CityData cityData : cd) {
            System.out.println("Country: USA, City: " + cityData.getCity() +
                    ", Latitude: " + cityData.getLatitud() + ", Longitude: " + cityData.getLongitude());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        city.getMinName(cd);
        city.getMaxName(cd);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        city.findMaxLatitudeCity(cd);
        city.findMinLatitudeCity(cd);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        city.findMinLongitudeCity(cd);
        city.findMaxLongitudeCity(cd);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    // Comparator class for sorting based on absolute latitude
    private static class AbsoluteLatitudeComparator implements Comparator<CityData> {
        @Override
        public int compare(CityData a, CityData b) {
            return Double.compare(Math.abs(a.getLatitud()), Math.abs(b.getLatitud()));
        }
    }
}

