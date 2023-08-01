public class DocComments {
    
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     * 1. prints 'Hi!'
     */
    public static void greet(){
        System.out.println("Hi!");
    }

    /**
     * Function name: printText
     * 
     * @param name (String)
     * @param age (String)
     * 
     * Inside the function:
     * 1. prints name and age 
     */
    public static void printText(String name, String age){
        System.out.println("Hi, I'm" + name + " and I'm" + age);
    }

    /**
     * Function name: calcArea
     * 
     * @param length
     * @param width
     * @return
     */
    public static double calcArea(double length, double width){
        return length * width;
    }
}
