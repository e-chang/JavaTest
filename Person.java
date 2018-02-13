public class Person {
    String name;//书名
    String author;//作者
    double price;//原价

    double sellprice() {
        return (price * 0.9);//折扣价
    }

}
