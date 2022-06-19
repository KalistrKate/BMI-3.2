public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight;
        double growth;

        System.out.println();
        System.out.println("Индекс массы тела: " + service.calculate(weight = 50, growth = 1.50));

        System.out.println();
        System.out.println("Индекс массы тела: " + service.calculate(weight = 80, growth = 1.60));

        System.out.println();
        System.out.println("Индекс массы тела: " + service.calculate(weight = 70, growth = 1.60));
    }
}
