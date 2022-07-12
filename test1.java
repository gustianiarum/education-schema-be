/**
 * Hello
 */
public class test1 {
    public static void main(String[] args) {
        int[] myNum = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        for (int i=0; i< myNum.length; i++){
            if(myNum[i] == 5){
               System.out.println("Fizz");
            } else if(myNum[i] == 11){
                System.out.println("Buzz");
            } else if(myNum[i] == 11 && myNum[i] == 5) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(myNum[i]);
            }
        }
    }
}

    