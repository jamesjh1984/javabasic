package ObjectFolder;


/**
 * 对象
 *
 * 属性（成员变量） vs 局部变量
 */
public class PersonTest {

    public static void main(String[] args) {

        /**
         * 创建对象1（实例化类）
         */
        Person person1 = new Person();

        person1.name = "James";
        person1.isMale = true;
        System.out.println("person1.name => " + person1.name);
        System.out.println("person1.age => " + person1.age);

        person1.eat();
        person1.sleep();
        person1.talk("English");

        System.out.println("person1.hashCode() => " + person1.hashCode());
        System.out.println("System.identityHashCode(person1) => " + System.identityHashCode(person1));

        System.out.println( );





        /**
         * 创建对象2（实例化类）
         */
        Person person2 = new Person();

        System.out.println("person2.name => " + person2.name);
        System.out.println("person2.hashCode() => " + person2.hashCode());
        System.out.println("System.identityHashCode(person2) => " + System.identityHashCode(person2));

        System.out.println( );






        /**
         * 创建对象3（实例化类）
         * 将person1对象的地址值赋给person3，所以person1和person3指向同一个对象实体。
         */
        Person person3 = person1;
        person3.age = 28;

        System.out.println("person3.name => " + person3.name);
        System.out.println("person1.age => " + person1.age);
        System.out.println("person3.age => " + person3.age);
        System.out.println("person3.hashCode() => " + person3.hashCode());
        System.out.println("System.identityHashCode(person3) => " + System.identityHashCode(person3));

    }

}


// 类
class Person {

    // 属性(成员变量)
    String name;
    int age = 18;
    boolean isMale;

    // 局部变量(方法内部): language, food
    public void eat() {
        String food = "noodle";
        System.out.println("eating " + food);
    }
    public void sleep() {
        System.out.println("sleeping. ");
    }
    public void talk(String language) {
        System.out.println("talking " + language + ". ");
    }
}
