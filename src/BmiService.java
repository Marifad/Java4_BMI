public class BmiService {
    public float calculate(float height, int weight) {
        float result;
        result = weight / (height * height);
        return result;
    }

}
