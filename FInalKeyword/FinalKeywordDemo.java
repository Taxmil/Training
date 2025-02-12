public class FinalKeywordDemo {
    public static void main(String[] args) {
        Final finalClass = new Final();
        
        System.out.println("Accessing final variable: " + finalClass.finalVariable);
        
        finalClass.finalMethod();
    }
}
