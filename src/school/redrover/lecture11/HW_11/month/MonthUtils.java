package school.redrover.lecture11.HW_11.month;

public class MonthUtils {

        public final static Month january = new Month("January", 31, 21);
        public final static Month february = new Month("February", 29, 20);
        public final static Month march = new Month("March", 31, 21);
        public final static Month april = new Month("April", 30, 22);
        public final static Month may = new Month("May", 31, 22);
        public final static Month june = new Month("June", 30, 19);
        public final static Month july = new Month("July", 31, 22);
        public final static Month august = new Month("August", 31, 22);
        public final static Month september = new Month("September", 30, 20);
        public final static Month october = new Month("October", 31, 22);
        public final static Month novermber = new Month("November", 30, 19);
        public final static Month december = new Month("December", 31, 21);

        public final  Month a13 = new Month("December", 31, 21);


        public static Month [] ALL_MONTHS = {january,february, march, april, may, june, july, august,september, october, novermber, december};
        public static Month[] SUMMER = {june, july, august};
        public static Month[] FALL = {september, october, novermber};

        public static Month[] getGroup() {
                return new Month[] {december, january, february} ;
        }

        public static Month[] getSemester(int n){
                if(n == 1) {
                        return new Month[] {january,february, march, april, may, june};
                } else if (n == 2) {
                        return new Month[]{july, august, september, october, novermber, december};
                } else {
                        throw new IllegalArgumentException("Введите корректное значение: 1 или 2");
                }
        }

        public static Month[] getYear() {
                return new Month[] {january,february, march, april, may, june, july, august,september, october, novermber, december};
        }


}






