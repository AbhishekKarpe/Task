public class Question2 {

    public static void printTheSequence(int a, int b, int n) {
        int sum = a;
        int term = 1;
        
        for (int i = 0; i < n; i++) {
            sum += term * b;
            System.out.print(sum);
            if (i < n - 1) {
                System.out.print(" ");
            }
            term *= 2;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        printTheSequence(0, 2, 10); // Should print: 2 6 14 30 62 126 254 510 1022 2046
        printTheSequence(5, 3, 5);  // Should print: 8 14 26 50 98
    }
}