package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        String mensajeRespuesta = getDurationString(3945);
        System.out.println(mensajeRespuesta);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds >= 60)) {
            return INVALID_VALUE;
        }

        int remainingSeconds = seconds + minutes * 60;
        int hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds - hours * 3600;
        int formattedMinutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds - formattedMinutes * 60;

        String hoursMessage = returnFormattedNumber(hours);
        String minsMessage = returnFormattedNumber(formattedMinutes);
        String secondsMessage = returnFormattedNumber(remainingSeconds);

        return hoursMessage + "h " + minsMessage + "m " + secondsMessage + "s";
    }

    public static String getDurationString(int seconds) {
        if ( seconds < 0 ) {
            return INVALID_VALUE;
        }
        int totalMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(totalMinutes,remainingSeconds);
    }
    public static String returnFormattedNumber(int number){
        String numberMessage = String.valueOf(number);
        if(number >= 0 && number < 10){
            numberMessage = "0" + numberMessage;
        }
        return numberMessage;
    }
}
