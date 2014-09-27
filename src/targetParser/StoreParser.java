package targetParser;

public class StoreParser{

    String status;
            
	public StoreParser(String input)
	{

		parser(input);

	}

        public String getStatus() {
            return status;
        }
        

        
		public void parser(String data)
		{
		
			status ="";
			String temp;
			int position = 0;
			int count = 0;

			temp = data.substring(data.indexOf("AvailablityStatus")+8);
						//Once first letter is determined, use it to just send back a boolean value to represent availability. A is true, N is false.
						//Even better A is true, not A is false.
                        status = temp.substring(0,temp.indexOf(",")-1);

	}
}