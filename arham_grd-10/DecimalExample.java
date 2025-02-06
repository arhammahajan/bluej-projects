
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalExample {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void call(double input) {

        

        System.out.println("salary : " + input);

        // DecimalFormat, default is RoundingMode.HALF_EVEN
        System.out.println("salary : " + df.format(input));      //1205.64

        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("salary : " + df.format(input));      //1205.63

        df.setRoundingMode(RoundingMode.UP);
        System.out.println("salary : " + df.format(input));      //1205.64

    }

}