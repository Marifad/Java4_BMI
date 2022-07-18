public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.7F;
        int weight = 62;
        float result = service.calculate(height, weight);
        System.out.println("ИМТ = " + result);
    }
}
