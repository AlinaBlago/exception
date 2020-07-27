public class Retry {
    public static void startRun(int countOfattemptToRun, Block block) throws Exception {
        int count = 1;

        for (int i = 0; i < countOfattemptToRun; i++){
            try {
                block.run();
                System.out.println("Successful attempt");
                return;
            } catch (Exception e){
                System.out.println("Exception: " + e.getMessage());
                if (i != countOfattemptToRun - 1) {
                    System.out.println("Failed attempt");
                    Thread.sleep(100 * count);
                } else {
                    throw new Exception("All attempts is failed.");
                }
            }

        }

    }
}
