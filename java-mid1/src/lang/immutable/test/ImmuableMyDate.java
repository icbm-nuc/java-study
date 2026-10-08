package lang.immutable.test;



public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmuableMyDate setYear(int value){
        return new ImmuableMyDate(value,this.month,this.day);
    }

    public ImmuableMyDate setMonth(int value){
        return new ImmuableMyDate(this.year,value,this.day);
    }

    public ImmuableMyDate setDay(int value){
        return new ImmuableMyDate(this.year,this.month,value);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
