import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader userField = new BufferedReader(new InputStreamReader(System.in));
        String user = userField.readLine();
        ArrayList<String> stroka = new ArrayList<>();
        RimTest rimResult = new RimTest();
        ReturnRim returnRes = new ReturnRim();
        String gotRes = "";


        for (int i=0; i<user.length(); i++){
            stroka.add(String.valueOf(user.charAt(i)));         //zapisali user v stroka

        }
        ArrayList<String> roman = new ArrayList<>();
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
        for (int i=0; i< stroka.size();i++){
            if (stroka.get(i).equals(roman.get(i))){                        // esli est' romanskie
                String riR = rimResult.result(user);                      // peredat' STROKU v RimTest i return arab
                //System.out.println(riR+" test1");                          // proverka arab
                int c =calc(riR);
                if (c>=1) {
                    gotRes = String.valueOf(c);                 //write otvet(int v string) na arab
                } else System.out.println("otvet ne mozhet bit' otricatel'nim");
                    //System.out.println(gotRes);
                String romanOtvet = (returnRes.returnRim(gotRes));            //peredat' arab i vernut' roman otvet
                System.out.println(romanOtvet);
            }
            else{
                String getres = String.valueOf(calc(user));                 //peredat' i vernut' arab otvet
                System.out.println(getres);                                 //print arab otvet

            }
            //zdes print
        }
    }

    public static int calc (String input) {
        ArrayList<String> stroke = new ArrayList<>();
        int result = 0;
        String znak = "";
        int position = 0;
        int a = 0;
        int b = 0;
        for (int i =0; i<input.length(); i++){
            stroke.add(String.valueOf(input.charAt(i)));                //write stroki v massiv
        }

        for (int i =0; i<stroke.size()-1; i++) {
            if (stroke.get(i).equals("+") || stroke.get(i).equals("-") || stroke.get(i).equals("*") || stroke.get(i).equals("/")) {
                znak = stroke.get(i);                                   // zapis' arif znaka dlya switch perebora
                position = i;                                           // zapis' indeksa arif znaka
                //System.out.println(position);
            }
        }
        if (position == 1){                                               //esli znak na indekse 1, to arab chislo iz 1 cifri
            //0+23
            a = Integer.parseInt(stroke.get(0));
            b = Integer.parseInt(input.substring(2, stroke.size()));
            // i =0 and z=2,3
        }
        if (position==2) {
            //i = 0,1 and z = 3,4
            a = Integer.parseInt(input.substring(0,2));
            b = Integer.parseInt(input.substring(3, stroke.size()));
        }
        if (position>=3){
            //error
            System.out.println("error");
        }
        if (a>10 || b>10){
            System.out.println("oshibka");                             //esli chislo bol'she 10, to exception vibrosit'
        }

try {
    switch (znak) {
        case "+" -> result = a + b;
        case "-" -> result = a - b;
        case "*" -> result = a * b;
        case "/" -> result = a / b;
        //default -> System.out.println("некорректно ввели ариф. операцию"); // postavit' exeption!!!NE ZABUD'!!!
    }
} catch (Exception e) {
    System.out.println("oshibka1"); //ckjfbarebenra
}

        return result;
    }
}