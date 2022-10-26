package kn222.rebrii;
import java.util.Scanner; // импорт сканера

public abstract class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Введите размер массива");
        length=scanner.nextInt();

        int [] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }

        System.out.println(isSorted(array));
        System.out.println(FizzBuzz());
    }
    private static boolean isSorted(int [] array) {

        if(array.length>=2) {

            boolean flag = false;

            for (int i = 0; i < array.length-1; i++) {
                if(array[i+1]==array[i]) {
                    flag = true;
                }
                else {
                    flag=false;
                    break;
                }
            }
            return flag;
        }

        return false;

    }
    private static int FizzBuzz() {
        for (int i =1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return 0;
    }
}


