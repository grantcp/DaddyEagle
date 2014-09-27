/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetParser;

/**
 *
 * @author awershow
 */
public class AvailableParser {
    //Constructor
    private AvailableParser() {
        
    }
    
    public static boolean isAvailable(String data) {
        String temp = null;
        boolean available = false;
        
        if (data != null) {
            temp = data.substring(data.indexOf("<AvailabilityStatus>")+20, data.indexOf("</AvailabilityStatus>"));
            //System.out.println(temp);
            if (temp.equalsIgnoreCase("Available"))
                available = true;
        }

        return available;
    }
}
