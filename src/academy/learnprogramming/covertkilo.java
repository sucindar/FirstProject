package academy.learnprogramming;


public class covertkilo {

    public static void main(String[] args) {

        double dfirst = 20.00d;
        double dsecond = 80.00d;

        double dresult = (dfirst + dsecond) * 100.00d;

        double dremainder = dresult % 40.00d;

        System.out.println(dremainder);
        boolean bremainder = (dremainder == 0) ? true : false;

        //boolean bremainder = false;

        if (!bremainder) {
            System.out.println("Got remainder");
        }
    }
}
