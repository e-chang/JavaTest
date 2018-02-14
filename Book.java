public class Book {
    String name;//书名
    String author;//作者
    double price;//原价

    //折扣价
    /** double sellprice() {
     return (price * 0.9);
     }*/

    //折扣价根据每本书不一样，折扣不一样
    double sellprice(double discount) {
        return discount * price;
    }
    void show(){
        System.out.println("name");
        System.out.println("price");
        System.out.println("author");
    }
}
