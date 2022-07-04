public class BmiService {
    public double calculate(double body_weight, double body_growth) {
        double body_mass_index = body_weight / ((body_growth / 100) * (body_growth / 100)); // формула расчета индекса тела
        return body_mass_index;
    }
}
