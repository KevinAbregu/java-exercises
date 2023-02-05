public class MegaByteConverter {

    public static final int megaByteToKilobyte = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes/megaByteToKilobyte;
            int kiloBytesResto = (kiloBytes - megaBytes * megaByteToKilobyte);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesResto + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
