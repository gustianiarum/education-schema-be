/*
var data = [1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1];

    hasil yang di inginkan: 
    - index ke 0 adalah integer dengan data 1
    - index ke 1 adalah string dengan data kawah
    - dan jika nilai dari index itu kurang dari  0 maka keluarkan output:  Tidak bisa di validasi sistem
*/

public class test2 {
   public static void main(String[] args) {
    Object[] data = {1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};
    //Object[] data = {1, "mantap", 0 };

    
    int index= 0;
    for(Object obj: data){
           if (obj instanceof String){
            System.out.println("- index ke "+index+" adalah string dengan data "+obj);     
            } else if (obj instanceof Integer){
                int value = (Integer) obj;
                if(value < 0 ) {
                    System.out.println("- Tidak bisa di validasi sistem");
                } else {
                    System.out.println("- index ke "+index+" adalah integer dengan data "+obj);
                }
            }
            index++;
     }
    
   } 
}
