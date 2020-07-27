import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
    Retry.startRun(5, new Block() {
        @Override
        public void run() throws Exception {
            final Random rnd = new Random();
            int number =  rnd.nextInt(2)-1;
            int result = number/number;
            System.out.println("Result = " + result);
        }
    });
    }
}
