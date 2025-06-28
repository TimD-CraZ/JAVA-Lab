public class Lab4a {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkDay(){
            return this != SUNDAY && this != SATURDAY;
        }
    }

    public static void main(String[] args){
        System.out.println("is monday work day: " + DayOfWeek.MONDAY.isWorkDay());
        System.out.println("is wednesday work day: " + DayOfWeek.WEDNESDAY.isWorkDay());
        System.out.println("is sunday work day: " + DayOfWeek.SUNDAY.isWorkDay());
    }
}
