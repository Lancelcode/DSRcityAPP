package dsrcityapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author ec2125613
 */
public class DSRFile 
{

    public DSRFile() {}
    
    public CityData[] loadFile(String filename)
    {
     File myFile = new File(filename);   
    ArrayList<CityData> arrList = new ArrayList<>();
    
    try{
        FileReader fr = new FileReader(myFile);
        BufferedReader br = new BufferedReader(fr);
        
        String data="";
        while ((data = br.readLine()) != null )
        {
            StringTokenizer st = new StringTokenizer(data,","); // this are the scisors to cut the data 
            
            while (st.hasMoreTokens())
            {
            CityData cd = new CityData();
            
            cd.setCity(st.nextToken().trim());
            cd.setGrowth(Double.parseDouble(st.nextToken().trim()));
            cd.setLatitud(Double.parseDouble(st.nextToken().trim()));
            cd.setLongitude(Double.parseDouble(st.nextToken().trim()));
            cd.setPopulation(Integer.parseInt(st.nextToken().trim()));
            cd.setRank(Integer.parseInt(st.nextToken().trim()));
            cd.setState(st.nextToken().trim());
            arrList.add(cd);
            
            }
            
        }// end of reading data 
     br.close(); 
    }
    
    catch(IOException e)
    {
        System.out.println("Error loading File");
    }
    
    CityData[] result = new CityData[arrList.size()];
    result = arrList.toArray(result);
    
    return result;
    }
    
    
}
