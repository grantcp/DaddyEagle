package targetParser;

public class LocationParser{

	private String[] info = new String[10];
	private String ID;
	private String name;
	private String address;
	private String city;
        private String state;
        private String zip;

	public  LocationParser(){
		
	}
        
        public String getID() {
            return ID;
        }
        
        public String getName() {
            return name;
        }
        
        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }
        
        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

	public String parser(String data){
            String temp;
            
            //System.out.println("Location: "+data);
            
            //Retrieve data for the store listed first
            ID = data.substring(data.indexOf("<ID>")+4,data.indexOf("</ID>"));
            name = data.substring(data.indexOf("<Name>")+6,data.indexOf("</Name>"));
            city = data.substring(data.indexOf("<City>")+6,data.indexOf("</City>"));
            state = data.substring(data.indexOf("<Subdivision>")+13,data.indexOf("</Subdivision>"));
            zip = data.substring(data.indexOf("<PostalCode>")+12,data.indexOf("</PostalCode>"));
            
            //Remove first store & return the remaining string
            temp = data.substring(data.indexOf("<CountryName>"));
            System.out.println(temp);
            if (temp.indexOf("<Name>")>0) 
                temp = data.substring(data.indexOf("<Name>"));
            else
                temp = null;
            System.out.println(temp);
            //Return the remaining string
            return temp;
	}

}