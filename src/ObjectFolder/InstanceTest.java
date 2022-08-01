package ObjectFolder;


public class InstanceTest {

    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p);

        p.sendEmail();

        // 匿名对象
        new Phone().sendEmail();
        new Phone().price = 1999;
        new Phone().showPrice(); // 0.0
    }
}




class Phone {

    double price;

    public void sendEmail() {
        System.out.println("sendEmail...");
    }

    public void showPrice() {
        System.out.println("price: " + price);
    }
}
