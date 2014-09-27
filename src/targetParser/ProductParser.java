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
                        
                        System.out.println(data);
			temp = data.substring(data.indexOf("DPCI")+8);
                        partNo = temp.substring(0,temp.indexOf(",")-1);

			count = 0;

                        temp = data.substring(data.indexOf("description"));
                        temp = temp.substring(0,temp.indexOf(",")-1);
                        while (temp.indexOf("\\u")>0) {
                            temp = temp.substring(temp.indexOf("\\u")+7);
                        }
                        partName = temp;
	}
}