package twelth_feb;

import java.io.Serializable;

class Employee implements Serializable
{
    Employee(int eno, String name,String email){
        this.eno=eno;
        this.name=name;
        this.email=email;
    }
    int eno;
    String name;
    transient String email;
}
