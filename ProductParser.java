Parts part[];
String partNo;
String partName;
String temp;
int position = 0;
int count;

public void storeInfo(String data){

	count =0;

	temp = substring(data.indexOf("description"))
	{
		count = count + 15;
			while(temp.charAt(count) != '"')
			{
				partName = partName + temp.charAt(count);
				count++;
			}	
	}

	count = 0;

	temp = temp.substring(data.indexOf("partNumber"))
	{
		count = count + 14;
			while(temp.charAt(count) != '"')
			{
				partNo = partNo + temp.charAt(count);
				count++;
			}		
			
	}


	Parts[position]= new part(partName, partNo);
	position++;

}

public part(String name, String number)
{
	this.number = number;
	this.name= name;
}