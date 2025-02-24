package java_assignment_03.Task10;

class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw..."+amount);

        if(this.amount<amount){
            System.out.println("Less balance - "+this.amount+ " ; waiting for deposit...");
            try{
                wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed..."+amount);
        System.out.println("withdraw completed..."+this.amount);
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit..."+ amount);
        this.amount+=amount;
        System.out.println("deposit completed... "+amount);
        notify();
    }
}
class Task2 {
    public static void main(String args[]){
        Customer c=new Customer();
        new Thread(){
            public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();

    }
}