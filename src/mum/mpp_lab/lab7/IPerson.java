package mum.mpp_lab.lab7;

public interface IPerson {

    default void myDefault(){
        System.out.println("From default method");
    }

    public static void myStatic(){
        System.out.println("From static method");
    }
}
