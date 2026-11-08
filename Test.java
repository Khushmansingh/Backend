// class PrintNumbers extends Thread {
//     public void run() {
//         System.out.println("Numbers from 1 to 5:");
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }

// class SumNumbers extends Thread {
//     public void run() {
//         int sum = 0;

//         for (int i = 1; i <= 5; i++) {
//             sum += i;
//         }

//         System.out.println("Sum of 1 to 5: " + sum);
//     }
// }

// class Calculator extends Thread {
//     public void run() {
//         int a = 10;
//         int b = 5;

//         System.out.println("Calculator Results:");
//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         PrintNumbers t1 = new PrintNumbers();
//         SumNumbers t2 = new SumNumbers();
//         Calculator t3 = new Calculator();

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }


class Test {
    public static void main(String[] args){
        for ( int i=0;i<1000;i++){
            System.out.println(i);
        }
    }
}
