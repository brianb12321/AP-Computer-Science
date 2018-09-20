/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.part2.converters;

/**
 *
 * @author briajbarn42
 */
public class TempConverter implements IDoubleConverter {
    @Override
    public double convert(double f) {
        return ((f - 32) * 5) / 9;
    }
}
