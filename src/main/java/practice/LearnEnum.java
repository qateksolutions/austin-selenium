package practice;

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}

public class LearnEnum {
    Day day;

    public LearnEnum(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so so");
                break;
        }
    }
}
