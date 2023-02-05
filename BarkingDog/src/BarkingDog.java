public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (barking && (isMorning(hourOfDay) || isNight(hourOfDay))){
            return true;
        }
        return false;
    }

    private static boolean isMorning(int hourOfDay){
        return (hourOfDay >= 0 && hourOfDay < 8);
    }
    private static boolean isNight(int hourOfDay){
        return (hourOfDay > 22 && hourOfDay <= 23);
    }
}
