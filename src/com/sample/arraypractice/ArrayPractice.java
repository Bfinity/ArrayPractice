package com.sample.arraypractice;

/**
 * Created by BFineRocks on 9/18/14.
 */
public class ArrayPractice {
    public static double[] dailyAverageTemp = {98.5, 99.2, 97.8, 99.0, 98.8, 97.6, 97.4};

    public static void main(String[] args) {

       

    }

    public static double printOutDailyAverageTemps()
    {
        double sum = 0;
        int count = 0;
        double weekAverage = 0;
        for(double temps: dailyAverageTemp)
        {
            System.out.println(temps);
            sum = sum + temps;
            count++;
        }
        weekAverage = sum/count;

        return weekAverage;

    }
}
