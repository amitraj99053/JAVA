import java.util.Random;

public class random_value {
        public static void main(String[] args){
            Random random = new Random();

            int x = random.nextInt(10);
            double y = random.nextDouble();
            boolean z = random.nextBoolean();

            System.out.println(z);

        }
    }
