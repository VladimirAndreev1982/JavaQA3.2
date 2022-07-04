public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double body_weight = 76;// масса тела в килограммах
        double body_growth = 174;// рост тела в сантиметрах
        double body_mass_index = service.calculate(body_weight, body_growth);// индекс массы тела
        System.out.println("При массе тела " + body_weight + " кг и росте " + body_growth + " см индекс массы тела " + body_mass_index);
    }
}
