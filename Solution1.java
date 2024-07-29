public class Solution1 {
    public static int reverse(int x) {
        int INT_MAX = 2147483647; // 2^31 - 1
        int INT_MIN = -2147483648; // -2^31
        
        int reversed_x = 0;
        
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            // Check for overflow
            if (reversed_x > INT_MAX / 10 || (reversed_x == INT_MAX / 10 && pop > 7)) {
                return 0;
            }
            if (reversed_x < INT_MIN / 10 || (reversed_x == INT_MIN / 10 && pop < -8)) {
                return 0;
            }
            
            reversed_x = reversed_x * 10 + pop;
        }
        
        return reversed_x;
    }
    
    public static void main(String[] args) {
        System.out.println(reverse(123));   
        System.out.println(reverse(-123));  
        System.out.println(reverse(120));   
    }
}
//Follow these steps to run the program:
// 1. javac Solution1.java
// 2. java Solution

//Output
// 321
// -321
// 21