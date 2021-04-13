package academy.learnprogramming;

import java.util.ArrayList;

public class pangram {

    public static void main(String[] args){

        ArrayList<String> PList = new ArrayList<>();
        PList.add("The quick brown fox jumps over a lazy dog");
        //PList.add("Waltz, bad nymph, for quick jigs vex");
        PList.add("Come");
        //PList.add("Jived fox nymph grabs quick waltz");
        PangramCheck(PList);
    }

    public static String PangramCheck(ArrayList<String> Plist){

        String strResult = "0";
        for (int i=0; i < Plist.size();i++)
        {
            boolean[] arrayTest = new boolean[26];
            int index =0;
            int intResult = 1;
            String strPan = Plist.get(i);
            System.out.println(strPan);
            for (int j=0; j < strPan.length();j++){
                if (strPan.charAt(j) >= 'A' && strPan.charAt(j) <= 'Z'){
                    index = strPan.charAt(j) - 'A';
                }
                else if (strPan.charAt(j) >= 'a' && strPan.charAt(j) <= 'z'){
                    index = strPan.charAt(j) - 'a';
                }
                //System.out.println("index "+index);
                arrayTest[index] = true;
            }
            for (int k=0; k < 25;k++){
                if (arrayTest[k] == true) {
                    intResult = 0;
                }
                else {
                    intResult = 1;
                }
            }
            if(intResult == 0) {
                System.out.println("This is a pangram");
            }
            else {
                System.out.println("This is NOT a pangram");
            }
        }
        return strResult;
    }
}
