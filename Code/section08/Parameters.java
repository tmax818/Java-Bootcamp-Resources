public class Parameters {
    
    public static void main(String[] args) {
        calculateArea(4.5, 5);
    }

    public static void calculateArea(double len, double wid){
        System.out.printf("Area: %.2f", len * wid);
    }
}
