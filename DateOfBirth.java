// DateOfBirth class stores a student's birth date
public class DateOfBirth {
    private final int month;
    private final int day;
    private final int year;

    // Constructor that receives the month, day, and year
    public DateOfBirth(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Method that returns the date in a simple format
    public String getFormattedDate() {
        return month + "/" + day + "/" + year;
    }
}