package ObjectFolder;


/**
 * 方法的重载（overload）
 *
 * jdk5.0之前： public void show(String[] strs)
 * jdk5.0之后： public void show(String ... strs)
 */
public class OverLoadTest {

    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest();

        overLoadTest.show(18);

        // jdk5.0之前： 可变个数的形参
        overLoadTest.show1(new String[]{"Hello","World"});

        // jdk5.0之后： 可变个数的形参
        overLoadTest.show2("Hello","World");



    }

    public void show(int i) {
        System.out.println("show => " + i);
    }

//    public void show(String s) {
//        System.out.println("show => " + s);
//    }



    // jdk5.0之前： 可变个数的形参
    public void show1(String[] strs) {
        System.out.print("show1 => ");
        for(int i=0; i<strs.length; i++) {
            System.out.print(strs[i] + "\t");
        }
        System.out.println();
    }


    // jdk5.0之后： 可变个数的形参
    public void show2(String ... strs) {

        System.out.print("show2 => ");
        for(int i=0; i<strs.length; i++) {
            System.out.print(strs[i] + "\t");
        }
        System.out.println();

    }

}
