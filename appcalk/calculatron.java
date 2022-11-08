package appcalk;

import java.util.Scanner;
public class calculatron {
    public static int calculator(int first,String operator, int second ) {



        int result = 0;

        if ((first <= 10 && first > 0) && (second <= 10 && second > 0)) {

            if (operator.equals("*")) {
                result = first * second;
            }
            if (operator.equals("/")) {
                result = first / second;
            }
            if (operator.equals("+")) {
                result = first + second;
            }
            if (operator.equals("-")) {
                result = first - second;
            }
        }


        return result;
    }
}




class Main {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Введите пример из двух римских или арабских чисел от 1 до 10");
        RomanNum.RomanorArab(read.next(), read.next(), read.next());
    }

}