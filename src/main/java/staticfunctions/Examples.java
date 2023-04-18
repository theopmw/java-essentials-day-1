package staticfunctions;

public class Examples {
    public static void doStuff(int x) {
        System.out.println("doStuff(int) x is " + x);
    }

    public static void doStuff(long x) {
        System.out.println("doStuff(long) x is " + x);
    }

    // Java does NOT have "named" argument passing, ONLY positional
    // NOR default arguments

    public static void main(String[] args) {
        staticfunctions.Examples.doStuff(99);
        Examples.doStuff(99);
        doStuff(99L);
    }
}
