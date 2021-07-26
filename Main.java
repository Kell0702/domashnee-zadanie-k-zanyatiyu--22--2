public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double mass = 77;
        double growth = 170;
        double bmi = service.calculate(mass ,growth);
        System.out.println(bmi);
    }
}