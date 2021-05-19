public class CoinChange {
    public static void main(String args[]) {
      int change = 1260; 
      int cnt = 0; 
      int[] coinTypes = {500, 100, 50, 10};
      
      for(int i=0; i< coinTypes.length; i++){
          int coin = coinTypes[i]; 
          cnt += change /coin; 
          change %=coin; 
         }
      
    System.out.println(cnt); 
    }
}
