package tip_02;

public class NutritionFacts {

    /**
     * 容量单位
     */
    private final int servingSize;
    /**
     * 容量
     */
    private final int servings;
    /**
     * 卡路里
     */
    private final int calories;
    /**
     * 脂肪
     */
    private final int fat;
    /**
     * 钠
     */
    private final int sodium;
    /**
     * 碳水化合物
     */
    private final int carbohydrate;

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;

    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static class Builder {

        private final int servingSize;
        private final int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }


        public Builder calories(int calories) {
            this.calories = calories;

            return this;
        }


        public Builder fat(int fat) {
            this.fat = fat;

            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;

            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;

            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }


}
