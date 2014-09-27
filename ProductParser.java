public class ProductParser{


	public ProductParser(String input)
	{

		parser(input);

	}

		public void parser(String data)
		{
		
			String partNo ="";
			String partName ="";
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