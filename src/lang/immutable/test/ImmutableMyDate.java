package lang.immutable.test;


public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public ImmutableMyDate withDay(int day){
        return new ImmutableMyDate(this.year,this.month,day);
    }
    public int getYear() {
        return year;
    }
    public ImmutableMyDate withMonth(int month){
        return new ImmutableMyDate(this.year,month,this.day);
    }
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year,this.month,this.day);
    }
    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

