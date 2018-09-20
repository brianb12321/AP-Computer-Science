
package chapter.part2;
import chapter.part2.converters.TempConverter;
import chapter.part2.converters.MetricConverter;
import chapter.part2.converters.IDoubleConverter;
import java.util.Scanner;

public class Identify {
    public static void main(String args[]) {
        System.out.print("Enter a number to convert: ");
        Scanner scan = new Scanner(System.in);
        IDoubleConverter c = new MetricConverter();
        System.out.println(c.convert(scan.nextDouble()));
    }
}