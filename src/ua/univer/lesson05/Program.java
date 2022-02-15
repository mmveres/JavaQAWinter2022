package ua.univer.lesson05;

public class Program {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1==obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        String str1 = "ab";
        String str2 = new String("ab");
        String str3 = str2.intern();
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
    }
}
