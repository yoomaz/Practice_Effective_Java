package tip_05;

import java.util.Date;

/**
 * 避免常见不必要的对象
 * <p>
 * 1. 不要用 new String("str"); 这种语句，因为常见了两个对象；也要避免在循环里创建对象
 * 2. 在做时间比较的时候，例如一个时间点是否在一个起始点和结束点之间，起始点对象和结束点对象可以提前初始化，避免在比较方法里面初始化
 * 3. 优先使用基本数据类型而不是装箱数据类型，使用 bool 而不是 Bool
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 判断是否在一个时间区间的正确写法
         */
        Person person = new Person(new Date());
        System.out.println(person.isBabyBoomer());

        /**
         * 不要这样写, 把 Long 换成 long 会更快
         */
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }


    }
}
