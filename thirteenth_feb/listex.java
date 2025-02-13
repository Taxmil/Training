package thirteenth_feb;

import java.util.ArrayList;
import java.util.List;

public class listex {
    public static void main(String[] args) {
        Arrthread arr= new Arrthread();
        Linklthread linkl=new Linklthread();
        VectorThread vec=new VectorThread();
        StackThread stk=new StackThread();
        arr.start();
        arr.run();
        linkl.start();
        linkl.run();
        vec.start();
        vec.run();
        stk.start();
        stk.run();






}
}
class Arrthread extends Thread{
    @Override
    public void run() {
        List<Integer> arr1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        arr1.add(35);
        arr1.add(23);
        arr1.add(67);
        arr1.add(82);
        arr1.add(56);
        arr1.add(49);
        arr1.add(49);
        arr1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+arr1.size());
        //Adding one element
        arr1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+arr1);
        System.out.println("The number of elements in the list: "+arr1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:"+arr1.contains(566));
        System.out.println("The given list before removing elements is :"+arr1);
        arr1.remove(2);//Removing element by its index
        arr1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+arr1);
        System.out.println("The number of elements in the list: "+arr1.size());
    }
}
class Linklthread extends Thread{
    @Override
    public void run() {
        List<Integer> linkl1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        linkl1.add(35);
        linkl1.add(23);
        linkl1.add(67);
        linkl1.add(82);

        linkl1.add(56);
        linkl1.add(49);
        linkl1.add(49);
        linkl1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+linkl1.size());
        //Adding one element
        linkl1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+linkl1);
        System.out.println("The number of elements in the list: "+linkl1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:"+linkl1.contains(566));
        System.out.println("The given list before removing elements is :"+linkl1);
        linkl1.remove(2);//Removing element by its index
        linkl1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+linkl1);
        System.out.println("The number of elements in the list: "+linkl1.size());
    }
}
class VectorThread extends Thread {
    public void run() {
        List<Integer> vec1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        vec1.add(35);
        vec1.add(23);
        vec1.add(67);
        vec1.add(82);
        vec1.add(56);
        vec1.add(49);
        vec1.add(49);
        vec1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + vec1.size());
        //Adding one element
        vec1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + vec1);
        System.out.println("The number of elements in the list: " + vec1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + vec1.contains(566));
        System.out.println("The given list before removing elements is :" + vec1);
        vec1.remove(2);//Removing element by its index
        vec1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + vec1);
        System.out.println("The number of elements in the list: " + vec1.size());
    }
}
class StackThread extends Thread {
    public void run() {
        List<Integer> stk1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        stk1.add(35);
        stk1.add(23);
        stk1.add(67);
        stk1.add(82);
        stk1.add(56);
        stk1.add(49);
        stk1.add(49);
        stk1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + stk1.size());
        //Adding one element
        stk1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + stk1);
        System.out.println("The number of elements in the list: " + stk1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + stk1.contains(566));
        System.out.println("The given list before removing elements is :" + stk1);
        stk1.remove(2);//Removing element by its index
        stk1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + stk1);
        System.out.println("The number of elements in the list: " + stk1.size());
    }
}

