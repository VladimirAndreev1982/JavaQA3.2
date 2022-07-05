public class BmiService {
    public double calculate(double bodyWeight, double bodyGrowth) {
        double bodyMassIndex = bodyWeight / ((bodyGrowth / 100) * (bodyGrowth / 100)); // формула расчета индекса тела
        return bodyMassIndex;
    }
}
