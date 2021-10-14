import java.util.Arrays;
import java.util.Random;

public class Q1 {

    static double[] temperature = new double[365];
    static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {

        setTemprature();
        double minVal = getMinimumTemperature(temperature);
        System.out.println(minVal);
        double maxVal = getMaximumTemperature(temperature);
        System.out.println(maxVal + " " + temperature[3]);
        System.out.println(Arrays.toString(getMonthlyAverage(temperature, months)));
        System.out.println(Arrays.toString(getMonthlyTempratureRange(temperature, months)));
    }

    public static void setTemprature() {

        for (int i = 0; i < 365; i++) {
            Random rand = new Random();
            temperature[i] = Double.parseDouble(String.format("%.2f", rand.nextDouble() * 80));
        }
    }

    public static double getMinimumTemperature(double[] num) {
        double minimumValue = num[0];
        for (int i = 1; i < num.length; i++) {
            if (minimumValue > num[i]) {
                minimumValue = num[i];
            }
        }
        return minimumValue;
    }

    public static double getMaximumTemperature(double[] num) {
        double maximumValue = num[0];
        for (int i = 1; i < num.length; i++) {
            if (maximumValue < num[i])
                maximumValue = num[i];
        }
        return maximumValue;
    }

    public static double[] getMonthlyAverage(double[] temperatureArray, int[] DaysInMonths) {
        double[] monthlyAvgTemprature = new double[12];
        int startDayOfTheMonth = 0;
        int endDayOfTheMonth = DaysInMonths[0];
        for (int i = 0; i < 12; i++) {
            double sumMonthlyTemprature = 0;
            endDayOfTheMonth = startDayOfTheMonth + DaysInMonths[i];
            for (int j = startDayOfTheMonth; j < endDayOfTheMonth; j++) {
                sumMonthlyTemprature += temperatureArray[j];
            }
            monthlyAvgTemprature[i] = sumMonthlyTemprature / DaysInMonths[i];
            startDayOfTheMonth = startDayOfTheMonth + DaysInMonths[i];
        }
        return monthlyAvgTemprature;
    }
    public static double[] getMonthlyTempratureRange ( double[] temperatureArray, int[] DaysInMonths){
        double[] monthlyTempratureRangeArray = new double[12];
        int startDayOfTheMonth = 0;
        int endDayOfTheMonth = 0;
        for (int i = 0; i < 12; i++) {
            endDayOfTheMonth = startDayOfTheMonth + DaysInMonths[i];
            double[] monthlyTempratureList=new double[DaysInMonths[i]];
            int eachDayTemprature=0;
            for (int j = startDayOfTheMonth; j < endDayOfTheMonth; j++) {
                monthlyTempratureList[eachDayTemprature] = temperatureArray[j];
                eachDayTemprature+=1;
            }
            monthlyTempratureRangeArray[i] = getMaximumTemperature(monthlyTempratureList)-getMinimumTemperature(monthlyTempratureList);
            startDayOfTheMonth = startDayOfTheMonth + DaysInMonths[i];
        }


        return monthlyTempratureRangeArray;
    }
}
