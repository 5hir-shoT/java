public class swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

/* 

Output:

Before swap: a = 5, b = 10
After swap: a = 10, b = 5

 */