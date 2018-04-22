package tip_02;

/**
 * 遇到多个构造器参数时要考虑使用构建器（构造器模式）
 * <p>
 * 问题：当构造方法需要多个参数的时候，程序员通常喜欢利用多态的特性，叠加构造器模式。
 * 这种方式构造函数中的参数位置不能放错，出现问题很难排查
 * <p>
 * 解决方式：
 * 当参数大于等于4个的时候，可以使用 Builder 构造器模式
 *
 * 缺点：
 * 需要创建一个构架对象，在十分注重性能的时候，可能会出现问题
 */
public class Main {

    public static void main(String[] args) {

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1, 2)
                .calories(3)
                .carbohydrate(4)
                .fat(5)
                .sodium(6)
                .build();

        System.out.println(nutritionFacts);
    }
}
