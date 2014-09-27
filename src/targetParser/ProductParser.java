package targetParser;

public class ProductParser{

    String partNo;
    String partName;
            
	public ProductParser(String input)
	{

		parser(input);

	}

        public String getPartNo() {
            return partNo;
        }
        
        public String getPartName() {
            return partName;
        }
        
		public void parser(String data)
		{
		
			partNo ="";
			partName ="";
			String temp;
			int position = 0;
			int count = 0;


			temp = data.substring(data.indexOf("description"));
				count = count + 15;
					while(temp.charAt(count) != '"')
					{
						partName = partName + temp.charAt(count);
						count++;
					}	

			count = 0;

			temp = temp.substring(data.indexOf("partNumber"));
				count = count + 14;
					while(temp.charAt(count) != '"')
					{
						partNo = partNo + temp.charAt(count);
						count++;
					}		

	}
}