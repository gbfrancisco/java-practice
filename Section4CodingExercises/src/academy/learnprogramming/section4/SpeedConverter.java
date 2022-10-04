package academy.learnprogramming.section4;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.0d) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609d);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour >= 0.0d ? kilometersPerHour + " km/h = "
            + toMilesPerHour(kilometersPerHour) + " mi/h" : "Invalid Value");
    }
}
