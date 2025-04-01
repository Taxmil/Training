package thirteenth_feb;

import java.util.*;

public class setex {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(25);
        hs.add(35);
        hs.add(37);
        hs.add(21);
        hs.add(49);
        hs.add(25);
        hs.add(34);
        hs.add(54);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("gfdg");
        lhs.add("bgf");
        lhs.add("kiuta");
        lhs.add("hjs");
        lhs.add("bh");
        lhs.add("gfghjd");
        lhs.add("fgd");
        lhs.add("fd");
        TreeSet<Double> trs = new TreeSet<>();
        trs.add(4.87);
        trs.add(2.65);
        trs.add(5.65);
        trs.add(6.35);
        trs.add(1.68);
        trs.add(43.653);
        trs.add(42.655);
        trs.add(76.654);
        SetSample(hs);
        SetSample(lhs);
        SetSample(trs);





    }

    static void SetSample(HashSet<Integer> hs) {
        System.out.println("Before removal" + hs);
        hs.remove(25);
        System.out.println("after removal" + hs);
        for (Integer i : hs) {
            if (i%7==0){
                System.out.println("This element is divisible by 7 are:"+ i);
            }
        }
    }
    static void SetSample(LinkedHashSet<String> lhs){
        System.out.println("LinkedHashSet before removal:"+lhs);
        lhs.remove("g");
        System.out.println("LinkedHashSet after removal:"+lhs);
        for (String i:lhs){
            if (i.length()==5){
                System.out.println("This element's sixe is more than 5"+i);
            }
        }
    }
    static void SetSample(TreeSet<Double> trs){
        System.out.println("TreeSet before removal:"+trs);
        trs.remove(4.87);
        System.out.println("TreeSet after remmoval of a element:"+trs);
    }
}

