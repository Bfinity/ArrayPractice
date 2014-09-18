package com.sample.arraypractice;

/**
 * Created by BFineRocks on 9/18/14.
 */
public class ArrayPractice {
    public static double[] dailyAverageTemp = {98.5, 99.2, 97.8, 99.0, 98.8, 97.6, 97.4};

    public static void main(String[] args) {

       System.out.println("It's been a really hot week.");
        System.out.println("The week's daily temperature was ");
        printOutDailyAverageTemps();
        System.out.println("The week's average was " + calculateAverage());

    }

    public static void printOutDailyAverageTemps()
    {
        for(double temps: dailyAverageTemp)
        {
            System.out.println(temps);

        }
     }

    public static double calculateAverage()
    {
        double sum = 0;
        int count = 0;
        double weekAverage;
        for(double temps: dailyAverageTemp)
        {
            sum = sum + temps;
            count++;
        }
        weekAverage = sum/count;

        return weekAverage;

    }
}
