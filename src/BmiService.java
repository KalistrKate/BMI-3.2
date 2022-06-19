public class BmiService {
    public double calculate(double weight, double growth) {
        double bmi = weight / (growth * growth);
        if (bmi < 18.5) {
            System.out.println("Деифицит массы тела: меньше, чем 18.5");
        }
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Нормальный: между 18.5 и 24.9");
        }
        if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Избыточный вес: между 25 и 29.9");
        }
        if (bmi >= 30) {
            System.out.println("Ожирение: 30 или больше");
        }
        return bmi;
    }
}