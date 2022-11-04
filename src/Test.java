import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int units = x%10;
    int tens = (x%100)/10;
    int hundreds = (x%1000)/100;

        System.out.println(Hundreds(hundreds) + Tens(tens) + Units(units));
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
//    public static void main(String[] args) throws IOException {
//        BufferedReader userField = new BufferedReader(new InputStreamReader(System.in));
//        String user = userField.readLine();
//        ArrayList<String> stroka = new ArrayList<>();
//        RimTest rimResult = new RimTest();
//        ReturnRim returnRes = new ReturnRim();
//
//        for (int i=0; i<user.length(); i++){
//            stroka.add(String.valueOf(user.charAt(i)));         //zapisali user v stroka
//        }
//        ArrayList<String> roman = new ArrayList<>();
//        roman.add("I");
//        roman.add("II");
//        roman.add("III");
//        roman.add("IV");
//        roman.add("V");
//        roman.add("VI");
//        roman.add("VII");
//        roman.add("VIII");
//        roman.add("IX");
//        roman.add("X");
//        for (int i=0; i< stroka.size();i++){
//            if (stroka.get(i).equals(roman.get(i))){                        // esli est' romanskie
//                String riR = rimResult.result(user);                      // peredat' STROKU v RimTest i return arab
//                //System.out.println(riR+" test1");                          // proverka arab
//                String gotRes = String.valueOf(calc(riR));                 //write otvet na arab
//                System.out.println(returnRes.returnRim(gotRes)+" test5");            //peredat' arab i vernut' roman otvet
//                }
//            else{
//                String getres = String.valueOf(calc(user));                 //peredat' i vernut' arab otvet
//                System.out.println(getres+" test4");                                 //print arab otvet
//            }
//            //zdes print
//        }
//       }
//
//    public static int calc (String input) {
//        ArrayList<String> stroke = new ArrayList<>();
//        int result = 0;
//        String znak = "";
//        int position = 0;
//        int a = 0;
//        int b = 0;
//        for (int i =0; i<input.length(); i++){
//            stroke.add(String.valueOf(input.charAt(i)));                //write stroki v massiv
//        }
//
//        for (int i =0; i<stroke.size()-1; i++) {
//            if (stroke.get(i).equals("+") || stroke.get(i).equals("-") || stroke.get(i).equals("*") || stroke.get(i).equals("/")) {
//                znak = stroke.get(i);                                   // zapis' arif znaka dlya switch perebora
//                position = i;                                           // zapis' indeksa arif znaka
//                System.out.println(position);
//            }
//        }
//        if (position == 1){                                               //esli znak na indekse 1, to arab chislo iz 1 cifri
//            //0+23
//            a = Integer.parseInt(stroke.get(0));
//            b = Integer.parseInt(input.substring(2, stroke.size()));
//            // i =0 and z=2,3
//        }
//        if (position==2) {
//            //i = 0,1 and z = 3,4
//            a = Integer.parseInt(input.substring(0,2));
//            b = Integer.parseInt(input.substring(3, stroke.size()));
//        }
//        if (position>=3){
//            //error
//            System.out.println("error");
//        }
//        if (a>10 || b>10){
//            System.out.println("oshibka");                             //esli chislo bol'she 10, to exception vibrosit'
//        }
//
//        switch (znak) {
//            case "+" -> result = a + b;
//            case "-" -> result = a - b;
//            case "*" -> result = a * b;
//            case "/" -> result = a / b;
//            default -> System.out.println("некорректно ввели ариф. операцию"); // postavit' exeption!!!NE ZABUD'!!!
//        }
//        return result;
//    }
