package ObjectFolder;

public class ObjectTest {

    public static void main(String[] args) {


        /**
         * Java中打印对象的内存地址
         *
         * hashCode()：可以被重写，所以不能代表内存地址的不同
         * System.identityHashCode()：可以返回对象的内存地址，不管该对象是否重写了ashCode()
         *
         * s3和s4的hashCode()一样，但内存地址不一样
         */
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = s1+s2;

        System.out.println("s3==s4? => " + (s3==s4));
        System.out.println("s3.hashCode() => " + s3.hashCode());
        System.out.println("s4.hashCode() => " + s4.hashCode());
        System.out.println("System.identityHashCode(s3) => " + System.identityHashCode(s3));
        System.out.println("System.identityHashCode(s4) => " + System.identityHashCode(s4));

    }

}
