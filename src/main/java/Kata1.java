public class Kata1 {
    public static void makeMeSlow() {
        try {
            // Pause execution for 7 seconds
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}