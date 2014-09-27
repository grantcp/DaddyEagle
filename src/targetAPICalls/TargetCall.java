/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetAPICalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author awershow
 * @author Obssa
 */
public class TargetCall {
    
    //Constructor
    private TargetCall() {
        
    }
    
    private static String swapSpaceWithComma(String spaceString) {
        String temp = spaceString;
        StringBuilder result = new StringBuilder("");
            
        while (temp.indexOf(" ")>0) {
            result.append(temp.substring(0, temp.indexOf(" ")));
            result.append(",");
            temp = temp.substring(temp.indexOf(" ")+1);
        }
        result.append(temp);
        
        return result.toString();
    }   
    
    //Get Product
    public static String getTargetProduct(String term) {
        //Declarations
        StringBuilder result = new StringBuilder("");
        String temp = null;
        String convertedTerm = swapSpaceWithComma(term);
        //System.out.println("term: "+convertedTerm);
        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet("https://api.target.com/v2/products/search?searchTerm="+convertedTerm+"&pagenumber=1&key=J5PsS2XGuqCnkdQq0Let6RSfvU7oyPwF");
            HttpResponse response = client.execute(request);
            BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            temp = rd.readLine();
            while (temp != null){
                result.append(temp);
                //System.out.println(temp);
                temp = rd.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
        return result.toString();
    }

    //Get Location
    public static String getTargetLocation(String zip) {
        //Declarations
        StringBuilder result = new StringBuilder("");
        String temp = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet("http://api.target.com/v2/store?nearby="+zip+"&range=100&limit=10&locale=en-US&&key=J5PsS2XGuqCnkdQq0Let6RSfvU7oyPwF");
            HttpResponse response = client.execute(request);
            BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            temp = rd.readLine();
            while (temp != null){
                result.append(temp);
                //System.out.println(temp);
                temp = rd.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
        return result.toString();
    }
}
