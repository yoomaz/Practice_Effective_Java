package tip_05;

import java.util.Calendar;
import java.util.Date;

public class Person {

    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    /**
     * 提前初始化比较的时间点，在方法里面直接用，不再需要初始化了
     */
    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = calendar.getTime();
    }


    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0
                && birthDate.compareTo(BOOM_END) < 0;
    }


}
