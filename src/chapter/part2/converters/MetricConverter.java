
package chapter.part2.converters;

public class MetricConverter implements IDoubleConverter {
    @Override
    public double convert(double mi) {
        return mi * 1.60934;
    }
}
