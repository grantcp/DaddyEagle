package targetParser;

import targetAPICalls.*;

public class optimalStore{

    //The most optimal store
    String opStore;
    //Most products helf by a store that doesn't have all of them
    int opProd;
    //Has all items
    private int opIndex;
            
    public optimalStore()
	{
            
	}

        public String getOpStore() {
            return opStore;
        }
        
        public int getOpIndex() {
            return opIndex;
        }
	public void optimal(String[] storeIds, String[] shoppingList)
	{
            int opProdCount = 0;
            for(int i = 0; i<storeIds.length;i++)
            {
		for (int j=0; j<shoppingList.length;j++)
                {
                    if (storeIds[i]!=null && shoppingList[j]!=null) {
                        String temp = TargetAvail.getTargetAvail(storeIds[i], shoppingList[j]);
                        if (AvailableParser.isAvailable(temp))
                        {
                            opProdCount++;
                            if(opProdCount>opProd)
                            {
                                opStore = storeIds[i];
                                opIndex = i;
                            }
                        }
                        opProdCount = 0;
                    }
		}
            }
        }
}