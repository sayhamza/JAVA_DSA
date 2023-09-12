package MyPractise.Arrays;

public class ProfitStocks {

        public static int BuySell(int Prices[]){
            int BuyPrice=Integer.MAX_VALUE;
            int MaxProfit =0;
            for (int i = 0; i < Prices.length; i++) {
                if(BuyPrice<Prices[i]){
                    int profit = Prices[i]-BuyPrice;
                    MaxProfit=Math.max(MaxProfit, profit);
                }
                else{
                    BuyPrice=Prices[i];

                }
                
            }
            return MaxProfit;
        }
    

    public static void main(String[] args) {
        int Prices[]={7,1,5,3,10,4};
        System.out.println(BuySell(Prices));
    }
    
}
