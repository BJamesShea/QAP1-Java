public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(1, 1, 1964);
        System.out.println(d1);
        d1.setDay(10);
        d1.setMonth(11);
        d1.setYear(2020);
        System.out.println(d1);
        d1.setDate(20, 7, 1994); // my birthday. Very important.
        System.out.println(d1);

    }
    
}
