public class Chorus {
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();

        
    }
    
    // function needs to be static to call it from the psvm static function
    public static void singChorus(){
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");

    }
}