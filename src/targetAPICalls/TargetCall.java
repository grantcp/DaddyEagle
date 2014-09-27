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
    
    //Get Product ID
    public static String getTargetProduct(String term) {
        //Declarations
        StringBuilder result = new StringBuilder("");
        String temp = null;
        
        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet("https://api.target.com/v2/products/search?searchTerm="+term+"&key=J5PsS2XGuqCnkdQq0Let6RSfvU7oyPwF");
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
