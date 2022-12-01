import java.util.*;

public class clock {

    public static void main(String[] args){
        Calendar today = Calendar.getInstance();
        int now, now_min, now_AP;

        String[] AP_M = {
            "AM",
            "PM",
            "morning",
            "afternoon",
        };

        String[] days_gone = {
            "sunday",
            "monday",
            "tuesday",
            "wednesday",
            "thursday",
            "friday",
            "saturday",
        };
        

        System.out.print("\n    today is " + days_gone[today.get(Calendar.DAY_OF_WEEK) - 1]);
        now = today.get(Calendar.HOUR);
        now_AP = today.get(Calendar.AM_PM);
        now_min = today.get(Calendar.MINUTE);


        if(now_min <= 5){
            System.out.printf(" and it's %d o'clock", now);
        }

        else if(now_min > 5 && now_min < 30){
            System.out.printf(" and it's %d past %d in the %s", now_min, now, AP_M[now_AP + 2]);
        }

        else if(now_min > 30 && now_min < 55){
            if(now == 11){
                if(AP_M[now_AP] == "AM"){
                    now_AP++;
                }

                if(AP_M[now_AP] == "PM"){
                    now_AP--;
                } 
            }

            System.out.printf(" and it's %d to %d %s", 60 - now_min, now + 1, AP_M[now_AP]);
        }

        else if(now_min >= 55){
            System.out.printf(" and it's %d o'clock in the %s", now + 1, AP_M[now_AP + 2]);
        }

        else if(now_min == 30){
            System.out.printf(" and it's half past %d in the %s", now, AP_M[now_AP + 2]);
        }

        System.out.println();

    }
}