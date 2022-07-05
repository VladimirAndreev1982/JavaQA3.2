public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 76;// масса тела в килограммах
        double bodyGrowth = 174;// рост тела в сантиметрах
        double bodyMassIndex = service.calculate(bodyWeight, bodyGrowth);// индекс массы тела
        System.out.println("При массе тела " + bodyWeight + " кг и росте " + bodyGrowth + " см индекс массы тела " + bodyMassIndex);
    }
}
