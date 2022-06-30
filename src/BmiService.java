public class BmiService {
    public double calculate(double m, double h) {
        double index = m/((h/100)*(h/100)); // формула расчета индекса тела
        return index;
    }
}
