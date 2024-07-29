public class Solution4{

    public static void main(String[] args) {
              
        int n = 15;
        int m = 20;
        int s = 4;

        int lt, seat, lMinusN;
        int rem = m % n;

        if (s == 1) {
            if (rem == 0) {
                seat = n;
            } else {
                seat = rem;
            }

        } else {
            lt = s - 1;

            if (rem == 0) {

                seat = lt;
            }
            else {
                int temp = lt + rem;
                if (temp <= n) {
                    seat = temp;                 
                } else {

                    lMinusN = Math.abs(lt - n);
                    seat = rem - lMinusN;

                }
            }

        }

        System.out.println("warn seat " + seat);
    }
    
}

//To run the program follow these steps:
//1. javac Solution4.java
//2. java Solution

//Expected Output
// warn seat  8
