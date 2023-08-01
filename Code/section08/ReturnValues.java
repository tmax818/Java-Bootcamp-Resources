public class ReturnValues {
    
    public static void main(String[] args) {
        double area = calculateArea(4.5, 5);
        System.out.println(area);
    }

    public static double calculateArea(double l, double w){
        return l * w;
    }
}
