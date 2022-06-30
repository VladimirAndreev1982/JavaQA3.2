public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 76;// масса тела в килограммах
        double h = 174;// рост тела в сантиметрах
        double index = service.calculate(m, h);// индекс массы тела
        System.out.println("При массе тела " + m + " кг и росте " + h + " см индекс массы тела " +index);
    }
}

