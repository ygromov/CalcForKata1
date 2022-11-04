import java.util.ArrayList;

class RimTest {

    String result (String stroke) {
        ArrayList<String> stroka = new ArrayList<>();
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

        ArrayList<String> arabian = new ArrayList<>();
        arabian.add("1");
        arabian.add("2");
        arabian.add("3");
        arabian.add("4");
        arabian.add("5");
        arabian.add("6");
        arabian.add("7");
        arabian.add("8");
        arabian.add("9");
        arabian.add("10");

        int position;
        String znak = "";
        String one = "";
        String two = "";

        for (int i=0; i<stroke.length(); i++) {
            stroka.add(String.valueOf(stroke.charAt(i)));
            }
        for (int i = 0; i < stroke.length(); i++) {
            if (stroka.get(i).equals("+") || stroka.get(i).equals("-") || stroka.get(i).equals("*") || stroka.get(i).equals("/")) {
                znak = stroka.get(i);
                position = i;
                if (position == 1) {
                    one = stroke.substring(0,1);
                    two =stroke.substring(2, stroka.size());
                }
                if (position == 2) {
                    one = stroke.substring(0,2);
                    two =stroke.substring(3, stroka.size());
                }
                if (position == 3) {
                    one = stroke.substring(0,3);
                    two =stroke.substring(4, stroka.size());
                }
                if (position == 4) {
                    one = stroke.substring(0,4);
                    two =stroke.substring(5, stroka.size());

                }
            }
        }
            for (int i =0; i< roman.size();i++){

                if(roman.get(i).equals(one)){
                    one=arabian.get(i);
                } else System.out.println("ne korrektno vvedena operaciya");
            }
            for (int i =0; i< roman.size();i++){
                if(roman.get(i).equals(two)){
                    two=arabian.get(i);
                } else System.out.println("ne korrektno vvedena operaciya");
            }
        String text = one + znak + two;
        return text;
    }
}
