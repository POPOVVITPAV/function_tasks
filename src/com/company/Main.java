package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(minNum(10,5));
        System.out.println(minNum(7,25));
        System.out.println(evenNum(4));
        System.out.println(evenNum(5));
        System.out.println(evenNum(6));
        System.out.println(pow(3,2));
        System.out.println(pow(2,6));
        System.out.println(pow(5,2));
        System.out.println(pow(3,2)+pow(2,6));
        System.out.println(NumBool(6));
        System.out.println(NumBool(4));
    }
    /*Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
    Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.*/
    public static int minNum(int a, int b){
        if(a < b){
            return a;
        }else {
            return b;
            }
        }
        /*Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет. Например,

            если число 4, тогда метод должен возвращать true
            если число 5, тогда метод должен возвращать false
            если число 6, тогда метод должен возвращать true
            и т.д.
         */
        public static boolean evenNum(int a){
            if (a % 2 != 0){
                return false;
                }else{
                return true;
            }/* return (a % 2==0) */
        }
        /*
            Необходимо написать метод, который бы возводил число в степень. И далее два числа,
            возведенные в степень, должны быть просуммированы, а результат выведен в консоль.

                Например,
                3^2 = 3*3 = 9
                2^6 = 2*2*2*2*2*2 = 64

                9 + 64 = 73;

                И, таким образом, в консоли мы должны увидеть число 73.
        */

        static int pow(int num, int powNum){
            int res=1;
            //int res = num;
            for (int i = 1; i <=powNum;/*i < powNum;*/ i++) {
                res *= num;
            }return res;
        }
        /*Напишите метод, который бы возвращал в консоль:

        true, если число больше 5
        и false, если число меньше 5*/
        static boolean NumBool(int a){
            if(a > 5){
                return true;
            }else{
                return false;
            }/*return (a > 5)*/
        }
    }

