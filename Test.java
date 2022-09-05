


import java.util.*;
 class TokenXY{

    public static int znachenie(int z) throws TokenXYException{

        if(z<1||z>10) throw new TokenXYException("throws Exception //т.к.Число должно быть от 1 до 10");

        return z;
    }
}

class TokenXYException extends Exception {


    public TokenXYException(String message) {

        super(message);
        return;
    }
}


public class Test {
    static String[] arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    static String[] rimsk = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C","CI"};
    static int result, x, y;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String s = scan.nextLine();
        String delims = " ";
        String[] tokens = s.split(delims);
        int length1 = s.split(delims).length;
        int ty=-999999999;
        int tx=-999999999;
try {


    try {
        tx = Integer.parseInt(tokens[0]);
    } catch (NumberFormatException e) {
    }

    for (int w = 0; w <= 100; w++)
        if ((tx > -999999998 && tokens[2].equals(rimsk[w])) == false) {

        } else {
            System.out.println("throws Exception //т.к.  разные системы счисления");
        return;}

    try {
        ty = Integer.parseInt(tokens[2]);
    } catch (NumberFormatException e) {
    }
    for (int w = 0; w < 11; w++)

        if ((tokens[0].equals(rimsk[w]) && ty > -999999998) == false) {

        } else {
            System.out.println("throws Exception //т.к.  разные системы счисления");return;
        }

} catch (ArrayIndexOutOfBoundsException e){System.out.println("throws Exception //т.к. строка не является математической операцией");return;}




        if (length1 > 3) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) ");
        } else {

            for (int i = 0; i<=100; i++) {

                if (tokens[0].equals(rimsk[i])) {


                    try{
                    x = TokenXY.znachenie(i);}
                    catch (TokenXYException ex){System.out.println(ex.getMessage());return;}


                    for (int a = 0; a <= 100; a++) {

                        if (tokens[2].equals(rimsk[a])) {

                            try{
                                y = TokenXY.znachenie(a);}
                            catch (TokenXYException ex){System.out.println(ex.getMessage());return;}


                            switch (tokens[1]) {
                                case "+":
                                    result = x + y;
                                    break;
                                case "-":
                                    result = x - y;
                                    break;
                                case "*":
                                    result = x * y;
                                    break;
                                case "/":
                                    result = x / y;
                                    break;
                                default:
                                    System.out.println("throws Exception //Неверный формат знака функции");
                                    return;
                            }

                            if (result > 0) {
                                System.out.println("Output :");
                                System.out.println(rimsk[result]);
                            } else {
                                System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                            }

                        }




                    }
                }
            }
        }

        try{
            tx=Integer.parseInt(tokens[0]);
        }catch (NumberFormatException e){

        }


         if(tx>-999999998){
            try{

                ty=Integer.parseInt(tokens[2]);
            }catch (NumberFormatException e){
                System.out.println("throws Exception //т.к. введенные данные не корректны");
                return;
            }
            try{
                x=TokenXY.znachenie(tx);
                y=TokenXY.znachenie(ty);
            }catch (TokenXYException ex){System.out.println(ex.getMessage());return;}


            switch (tokens[1]) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    System.out.println("throws Exception //Неверный формат знака функции");
                    return;
            }
            System.out.println("Output :");
            System.out.println(result);
             System.out.println("Kata");


}

    }
}









