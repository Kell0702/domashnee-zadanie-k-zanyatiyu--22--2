public class BodyMassIndex {
    public double calculate(double mass, double growth) {
        int index = 2;
        double heightInMeters = growth / 100;
        double bmi = mass / (Math.pow(heightInMeters, index));
        return bmi;

    }
}
