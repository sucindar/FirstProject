package academy.learnprogramming;

import java.util.ArrayList;

public class pangram {

    public static void main(String[] args){

        ArrayList<String> PList = new ArrayList<>();
        PList.add("The quick brown fox jumps over a lazy dog");
        //PList.add("Waltz, bad nymph, for quick jigs vex");
        PList.add("Come");
        //PList.add("Jived fox nymph grabs quick waltz");
        String strResult = PangramCheck(PList);
        System.out.println(strResult);
    }

    public static String PangramCheck(ArrayList<String> Plist){

        String strResult = "";
        int intResult = 1;
        for (String strPan : Plist) {
            boolean[] arrayTest = new boolean[26];
            int index = 0;
            
            System.out.println(strPan);
            for (int j = 0; j < strPan.length(); j++) {
                //check with char decimal
                if (strPan.charAt(j) >= 'A' && strPan.charAt(j) <= 'Z') {
                    index = strPan.charAt(j) - 'A';
                } else if (strPan.charAt(j) >= 'a' && strPan.charAt(j) <= 'z') {
                    index = strPan.charAt(j) - 'a';
                }
                //System.out.println("index "+index);
                arrayTest[index] = true;
            }
            for (int k = 0; k < 25; k++) {
                if (arrayTest[k]) {
                    intResult = 0;
                } else {
                    intResult = 1;
                }
            }
            if (intResult == 0) {
                strResult = "This is a pangram";
            } else {
                strResult = "This is NOT a pangram";
            }
        }
        return strResult;
    }
}
