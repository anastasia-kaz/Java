public class MonthUtils {

    public static class Month{

        private String name;
        private int day;
        private int workDay;

        public Month(String name, int day, int workDay) {
            this.name = name;
            this.day = day;
            this.workDay = workDay;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getWorkDay() {
            return workDay;
        }

        public void setWorkDay(int workDay) {
            this.workDay = workDay;
        }

    }


    public static final Month[] MONTHS = new Month[] {
            new Month("Январь", 31, 19),
            new Month("Февраль", 28, 20),
            new Month("Март", 31, 22),
            new Month("Апрель", 30, 22),
            new Month("Май", 31, 20),
            new Month("Июнь", 30, 22),
            new Month("Июль", 31, 22),
            new Month("Август", 31, 22),
            new Month("Сентябрь", 30, 22),
            new Month("Октябрь", 31, 21),
            new Month("Ноябрь", 30, 22),
            new Month("Декабрь", 31, 23),
    };

}
