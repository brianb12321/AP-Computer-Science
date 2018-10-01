
package chapter.part2;
import java.text.DecimalFormat;

public class Telephone {
    public void doStuff() {
        DecimalFormat df = new DecimalFormat("000");
        DecimalFormat df2 = new DecimalFormat("0000");
        int p1 = (int)(Math.random() * 778);
        int p2 = (int)(Math.random() * 742);
        int p3 = (int)(Math.random() * 10000);
        System.out.println(df.format(p1) + "-" + df.format(p2) + "-" + df2.format(p3));
    }
}
