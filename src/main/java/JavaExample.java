import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaExample implements InterfaceExample, Interface2 {

    public static void main(String[] args) {
        String name = "vijay";
        second(name);
        /*InterfaceExample ie = new JavaExample();
        ie.sub();*/
    }

    public static void second(String name) {
        String name2 = name;
        String[] arr1 = new String[5];
        arr1[0] = name2;
        arr1[3] = "Ammu";

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(arr1));
        arrayList1.remove("Ammu");
//        System.out.println(arrayList1);
        arrayList1.forEach(string -> System.out.println(string));
    }

    @Override
    public void add() {

    }

   /* @Override
    public void sub() {
        System.out.println("java example");
    }*/
}

interface InterfaceExample {
    static void add() {

    }

    default void sub() {
        System.out.println("interface example");
    }
}

interface Interface2 {
    void add();
    /*default void sub() {
        System.out.println("interface2");
    }*/
}


