import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
    public LocalTime addHoursToTime(LocalTime time, int hours){
        return time.plusHours(hours);  
    }
    public String compareTimes(LocalTime time1, LocalTime time2){
        if (time1.isBefore(time2)) {
            return "time1 is before time2";
        } else if (time1.isAfter(time2)) {
            return "time1 is after time2";
        } else {
            return "time1 is equal to time2";
        }
    }
    public static void main(String[] args) {
        LocalTimeExp lTimeExp = new LocalTimeExp();
        LocalTime now = LocalTime.now();
        LocalTime lTime=lTimeExp.addHoursToTime(now, 12);
        System.out.println("Local Time after added 12 hours: "+lTime);
        LocalTime time1=LocalTime.of( 10, 30);
        LocalTime time2 = LocalTime.of( 15, 45);
        String result =lTimeExp.compareTimes(time1, time2);
        System.out.println(result);
    }
}
