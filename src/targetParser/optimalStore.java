package targetParser;

import targetAPICalls.*;

public class optimalStore{

	//The most optimal store
    String opStore;
    //Most products helf by a store that doesn't have all of them
    int opProd;
    //Has all items
            
	public optimalStore(String[] storeIds, String[] shoppingList)
	{

		optimal(storeIds, shoppingList);

	}

        public String getOpStore() {
            return opStore;
        }
        

        
		public void optimal(String[] storeIds, String[] shoppingList)
		{
		
			int opProdCount = 0;

			for(int i = 0; i<storeIds.length;i++)
			{
				for(int j=0; j<shoppingList.length;j++)
				{
					if(StoreParser(TargetAvail(storeIds[i], shoppingList[j])))
					{
						opProdCount++;
						if(opProdCount>opProd)
						{
							opStore = storeIds[i];
						}
					}
					opProdCount = 0;
				}
			}

	}
}