package tip_01;

/**
 * 考虑用静态工厂方法代替构造器
 *
 * 优势
 * 1. 和构造方法比，具有名称。
 * 当一个类需要多个相同类型的对象，但是传入的参数不一样的，可以使用静态工厂方法来创建对象，需要不同参数的方法名不一样
 * 2. 可以不必每次都创建一个新的对象：Boolean.valueOf(true)
 * 3. 可以返回任何原返回类型的任何子类型，这点构造方法做不到
 */
public class Main {

    public static void main(String[] args) {

        Boolean bool = Boolean.valueOf(true);

        System.out.println(bool);
    }
}
