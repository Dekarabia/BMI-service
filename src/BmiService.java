public class BmiService {

    public float calculate(double height, int weight) {
        float bmi = (float) (weight / Math.pow(height, 2));
        return (float) bmi;
    }
}
