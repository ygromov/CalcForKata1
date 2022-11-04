import java.util.ArrayList;

public class ReturnRim {

    String returnRim(String input) {


        int x = Integer.parseInt(input);
        int units = x % 10;
        int tens = (x % 100) / 10;
        int hundreds = (x % 1000) / 100;
        String text=(Hundreds(hundreds) + Tens(tens) + Units(units));
        return text;
    }
        public static String Units(int units) {
            String s_units="";
            switch (units) {
                case 1: s_units = "I";break;
                case 2: s_units = "II";break;
                case 3: s_units = "III";break;
                case 4: s_units = "IV";break;
                case 5: s_units = "V";break;
                case 6: s_units = "VI";break;
                case 7: s_units = "VII";break;
                case 8: s_units = "VIII";break;
                case 9: s_units = "IX";break;
            }
            return s_units;
        }
        public static String Tens(int tens) {
            String s_tens="";
            switch (tens) {
                case 1: s_tens = "X"; break;
                case 2: s_tens = "XX";break;
                case 3: s_tens = "XXX";break;
                case 4: s_tens = "XL";break;
                case 5: s_tens = "L";break;
                case 6: s_tens = "LX";break;
                case 7: s_tens = "LXX";break;
                case 8: s_tens = "LXXX";break;
                case 9: s_tens = "XC";break;
            }
            return s_tens;
        }
        public static String Hundreds(int hundreds) {
            String s_hundreds="";
            switch (hundreds) {
                case 1: s_hundreds = "C";
            }
            return s_hundreds;
        }
    }

