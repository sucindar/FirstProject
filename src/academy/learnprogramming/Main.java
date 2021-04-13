package academy.learnprogramming;

import static java.lang.Long.MAX_VALUE;

public class Main {

    public static void main(String[] args){

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min "+myMinValue);
        System.out.println("Integer Max "+myMaxValue);

        byte myminbytevalue = Byte.MIN_VALUE;
        byte mymaxbytevalue = Byte.MAX_VALUE;
        System.out.println(myminbytevalue);
        System.out.println(mymaxbytevalue);

        short myminshortvalue = Short.MIN_VALUE;
        short mymaxshortvalue = Short.MAX_VALUE;
        System.out.println(myminshortvalue);
        System.out.println(mymaxshortvalue);

        long myminlongvalue = Long.MIN_VALUE;
        //long mymaxlongvalue = MAX_VALUE;
        System.out.println(myminlongvalue);
        System.out.println(Long.MAX_VALUE);

        byte mybytevalue = (byte) (myminbytevalue/2);
        System.out.println("mybytevalue "+mybytevalue);

        byte mytestbytevalue = 100;
        short mytestshortvalue = 10000;
        int mytestintvalue = 200000;
        long mytestlongvalue = 50000;
        mytestlongvalue = mytestlongvalue + 10*(mytestbytevalue+mytestshortvalue+mytestintvalue);
        System.out.println("long "+mytestlongvalue);

        //float myfloat = 5f;
        System.out.println(5);
    }
}
