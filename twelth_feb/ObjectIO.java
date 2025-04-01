package twelth_feb;

import java.io.*;


public class ObjectIO {
    static void Serialization() throws IOException{
        try {
            //Creating the object
            Employee s1 = new Employee(166, "tamil", "tamil@123");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }
            catch(Exception e){System.out.println(e);}
    }
    static void Deserialization() throws IOException{
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Employee e=(Employee) in.readObject();
            //printing the data of the serialized object
            System.out.println(e.eno+" "+e.name+" "+e.email);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }



    public static void main(String[] args) throws IOException {
        Serialization();
        Deserialization();



    }
}
