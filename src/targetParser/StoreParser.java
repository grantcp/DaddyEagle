package targetParser;

public class ProductParser{

    String status;
            
	public ProductParser(String input)
	{

		parser(input);

	}

        public String getStatus() {
            return getStatus;
        }
        

        
		public void parser(String data)
		{
		
			status ="";
			String temp;
			int position = 0;
			int count = 0;

			temp = data.substring(data.indexOf("AvailablityStatus")+8);
						//Once first letter is determined, use it to just send back a boolean value to represent availability. 
                        status = temp.substring(0,temp.indexOf(",")-1);

	}
}