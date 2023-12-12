/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsrcityapp;

/**
 *
 * @author ec2125613
 */
public class DSRcityAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSRFile dsr = new DSRFile();
        CityData city = new CityData();
        CityData[] cd = dsr.loadFile("1000 Usa Cities.txt");
        
        for(int k=0; k<cd.length; k++)
        {
            System.out.println(cd[k]);
        }
        
        city.getMinName(cd);
        //System.out.println(cd[250].getState());
        
    }
    
}
