public class Date {
    private int day;
    private int month;
    private int year;

    // Note to Ainee: I didn't understand what you meant in problem two where you say " dd/mm/yyyy with leading zero"

    // I understrand that you want the date to be formatted as dd/mm/yyyy, but I don't understand what you mean by "with leading zero" Hope this is OK.


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
