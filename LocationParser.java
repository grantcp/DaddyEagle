Stores store[];
String ID;
String name;
String temp;
int position = 0;
int count;

public void storeInfo(String data){
	count = 0;

	temp = substring(data.indexOf("<ID>"))
	{
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
				
			
	}

	count = 0;

	temp = substring(temp.indexOf("<Name>"))
	if(temp.charAt(count)=='<')
	{

		count = count + 6;
		while(temp.charAt(count) != '<')
		{
			name = name + temp.charAt(count);
			count++;
		}
						
	}

	count = 0;

	temp = substring(temp.indexOf("<FormattedAddress>"))
	if(temp.charAt(count)=='<')
	{

		count = count + 18;
		while(temp.charAt(count) != '<')
		{
			address = address + temp.charAt(count);
			count++;
		}
								
	}

	Stores[position]= new store(ID, name, address);
	position++;
	storeInfo(temp);

}

public store(String ID, String name, String address)
{
	this.ID = ID;
	this.name= name;
	this.address = address;
}