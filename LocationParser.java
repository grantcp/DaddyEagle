Stores store[];
String ID;
String name;
String temp;
int position = 0;
int count;

public void storeInfo(String data){
	count = 0;

	temp = substring(data.indexOf("<ID>"))
	if(temp.charAt(count)=='<')
	{
		count++;
		if(temp.charAt(count)=='I')
		{
			count++;
			if(temp.charAt(count)=='D')
			{
				count++;
				if(temp.charAt(count)=='>')
				{
					count++;
					if(temp.charAt(count)!='T')
						count++;
						while(temp.charAt(count) != '<')
						{
							ID = ID + temp.charAt(count);
							count++;
						}
				}
			}
		}
	}

	count = 0;

	temp = substring(temp.indexOf("<Name>"))
	if(temp.charAt(count)=='<')
	{
		count++;
		if(temp.charAt(count)=='N')
		{
			count++;
			if(temp.charAt(count)=='A')
			{
				count++;
				if(temp.charAt(count)=='M')
				{
					count==;
					if(temp.charAt(count)=='E')
					{
						count++;
						if(temp.charAt(count=='>'))
						{
							count++;
							while(temp.charAt(count) != '<')
							{
								name = name + temp.charAt(count);
								count++;
							}
						}
					}
				}
			}
		}
	}

	count = 0;

	temp = substring(temp.indexOf("<FormattedAddress>"))
	if(temp.charAt(count)=='<')
	{
		count++;
		if(temp.charAt(count)=='F')
		{
			count++;
			if(temp.charAt(count)=='o')
			{
				count++;
				if(temp.charAt(count)=='r')
				{
					count++;
					if(temp.charAt(count)=='m')
					{
						count++;
						if(temp.charAt(count)=='a')
						{
							count++;
							if(temp.charAt(count)=='t')
							{
								count++;
								if(temp.charAt(count)=='t')
								{
									count++;
									if(temp.charAt(count)=='e')
									{
										count++;
										if(temp.charAt(count)=='d')
										{
											count++;
											if(temp.charAt(count)=='A')
											{
												count++;
												if(temp.charAt(count)=='d')
												{
													count++;
													if(temp.charAt(count)=='d')
													{
														count++;
														if(temp.charAt(count)=='r')
														{
															count++;
															if(temp.charAt(count)=='e')
															{
																count++;
																if(temp.charAt(count)=='s')
																{
																	count++;
																	if(temp.charAt(count)=='s')
																	{
																		count++;
																		if(temp.charAt(count)=='>')
																		{
																			count++;
																			while(temp.charAt(count) != '<')
																			{
																				address = address + temp.charAt(count);
																				count++;
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
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