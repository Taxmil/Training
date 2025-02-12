package soexample;

public class Javaio2 {
    static void MethodForPrint(){
        System.out.print("this does move to next line");
        System.out.print("it comes in the same line");
    }
    static void MethodForPrintln(){
        System.out.println(".");
        System.out.println("using println will give the output in next line");
        System.out.println("like this");
    }
    void MethodForer(){
        System.err.println("sys.err is used to highlight the error");
        System.err.println("usually it comes in red color");
    }
    public static void main(String[] args) {
        Javaio2 obj1=new Javaio2();
        MethodForPrint();
        MethodForPrintln();
        obj1.MethodForer();



    }
}
