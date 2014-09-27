/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductID;

import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.method.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author Obssa
 */

public class ProductID{
    
    public static void main (String[] args) throws ClientProtocolException, IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet request = HttpGet('api.target.com');
        HttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String line = '';
        while ((line - rd.readLine() != null)){
            System.out.println(line);
        }
    }
    
    /*public static void main(String Data) throws Exception {
        
        int ItemAttributes;
        if("ItemsAttributes" = true)
            then 
            

        // Now do the magic.
        Data data = new Gson().fromJson(json, Data.class);

        // Show it.
        System.out.println(data);
    }

}

class Data {
    private String title;
    private Long id;
    private Boolean children;
    private List<Data> groups;

    public String getTitle() { return title; }
    public Long getId() { return id; }
    public Boolean getChildren() { return children; }
    public List<Data> getGroups() { return groups; }

    public void setTitle(String title) { this.title = title; }
    public void setId(Long id) { this.id = id; }
    public void setChildren(Boolean children) { this.children = children; }
    public void setGroups(List<Data> groups) { this.groups = groups; }

    public String toString() {
        return String.format("title:%s,id:%d,children:%s,groups:%s", title, id, children, groups);
    }*/
    
    
}