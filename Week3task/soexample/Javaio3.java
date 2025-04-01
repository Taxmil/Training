package soexample;
import java.io.*;
import java.util.*;

public class Javaio3 {
    static void getInputUsingBufferedReaderClass() throws IOException
    {
        // Enter data using BufferReader
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        // Reading data using readLine
        String s = b.readLine();
        // Printing the read line
        System.out.println("The given input:"+s);
        int e= Integer.parseInt(b.readLine());
        System.out.println("The given input:"+e);
        float f= Float.parseFloat(b.readLine());
        System.out.println("The given input:"+f);
    }
    void getInputUsingScannerClass()
    {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        System.out.println("Enter the input integer :");
        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter the input float :");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }

    public static void main(String[] args) throws IOException {
        Javaio3 obj1=new Javaio3();
        getInputUsingBufferedReaderClass();
        obj1.getInputUsingScannerClass();

    }

}
