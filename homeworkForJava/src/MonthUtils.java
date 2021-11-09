public class MonthUtils {

    public interface IMonth{
        String getName();
        int getDay();
        int getWorkDay();

    }

    public static final class MonthImpl implements IMonth{

        private String name;
        private int day;
        private int workDay;

        public MonthImpl(String name, int day, int workDay) {
            this.name = name;
            this.day = day;
            this.workDay = workDay;
        }
        public String getName() {
            return name;
        }

        public int getDay() {
            return day;
        }

        public int getWorkDay() {
            return workDay;
        }


    }


    public static final IMonth[] MONTHS = new MonthImpl[] {
            new MonthImpl("Январь", 31, 19),
            new MonthImpl("Февраль", 28, 20),
            new MonthImpl("Март", 31, 22),
            new MonthImpl("Апрель", 30, 22),
            new MonthImpl("Май", 31, 20),
            new MonthImpl("Июнь", 30, 22),
            new MonthImpl("Июль", 31, 22),
            new MonthImpl("Август", 31, 22),
            new MonthImpl("Сентябрь", 30, 22),
            new MonthImpl("Октябрь", 31, 21),
            new MonthImpl("Ноябрь", 30, 22),
            new MonthImpl("Декабрь", 31, 23),
    };

}
