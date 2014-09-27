package targetParser;

public class LocationParser{

	String[] info = new String[10];
	String ID;
	String name;
	String temp;
	String address;
	int position = 0;
	int count;

	public  LocationParser(String data){
		parser(data);
	}
        
        public String getName() {
            return name;
        }
        
        public String getAddress() {
            return address;
        }

	public void parser(String data){
		count = 0;

		temp = data.substring(data.indexOf("<ID>"));
		
			count = count + 4;
			if(temp.charAt(count)!='T')
			{
				count++;
				while(temp.charAt(count) != '<')
				{
					ID = ID + temp.charAt(count);
					count++;
				}
			}
					
		info[position] = address;
		position++;
		

		count = 0;

		temp = temp.substring(temp.indexOf("<Name>"));
			count = count + 6;
			while(temp.charAt(count) != '<')
			{
				name = name + temp.charAt(count);
				count++;
			}
		
		info[position] = address;
		position++;					

		count = 0;

		temp = temp.substring(temp.indexOf("<FormattedAddress>"));

			count = count + 18;
			while(temp.charAt(count) != '<')
			{
				address = address + temp.charAt(count);
				count++;
			}

		
		info[position] = address;
		position++;
		parser(temp);

	}

}