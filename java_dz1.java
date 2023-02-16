// import java.util.Scanner;

// public class triangular_number {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.print("Введите число: ");
//             int numb = in.nextInt();
//             int s=0;
//             int f=1;
//             for (int i = 1; i <= numb; i++) {                
//                s+=i;
//                f*=i;
//             }
//             System.out.println("Треугольного число: " + s);
//             System.out.println("Факториал числа: " + f);
//         }
//     }
// }



//Вывести все простые числа от 1 до 1000
// public class output_of_prime_numbers {
//     public static void main(String[] args) {
//         boolean b = true;
//         for (int q = 2; q <= 1000; q++) {
//             for (int i = 2; i < q; i++) {
//                 if (q % i == 0) {
//                     b = false;
//                     break;
//                 }
//             }
//             if (b) System.out.println(q);
//             else b = true;
//         }
//     }
// } 



// import java.util.Scanner;

// public class calс {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите первое число: ");
//         int numb_a = in.nextInt();
//         System.out.print("Введите второе число: ");
//         int numb_b = in.nextInt();
//         System.out.println("Введите операцию + - / *: ");
//         char operation;
//         operation = in.next().charAt(0);
//         int res;
//         switch (operation) {
//             case '+':
//                 res = numb_a + numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '-':
//                 res = numb_a - numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '/':
//                 res = numb_a / numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '*':
//                 res = numb_a * numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;

//         }
//         in.close();
//     }
// }