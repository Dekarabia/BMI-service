public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.60; // рост в м
        int weight = 58; // вес в кг
        double bmi = (int) (service.calculate(height, weight));
        System.out.println("Индекс массы тела составит " + bmi + " при росте 1.60 " + " и весе 58кг");

    }
}