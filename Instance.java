public class Instance {
    public static void main(String[] args) {
        double p = 350;
        Person A = new Person();
        A.name = "世界与和平";
        A.author = "chang";
        A.price = 100;
        System.out.println("书名： " + A.name);
        System.out.println("作者： " + A.author);
        System.out.println("原价： " + A.price);
        System.out.println("折扣价: " + A.sellprice()); //折扣价


    }

}
