public class BlockImpl implements Block {
    @Override
    public void run() throws Exception {
            int number = (int) (Math.random() * 13);
            if(number < 5) {
                System.out.print(number);
            } else {
                throw new Exception();
            }
        }
    }

