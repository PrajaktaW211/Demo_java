
import java.util.Random;

public class Random_class {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;

        number1 = random.nextInt(1,6);
        System.out.println(number1);

        double number2 = random.nextDouble();
        System.out.println(number2);

        boolean ishead = random.nextBoolean();
        System.out.println(ishead);

    }
}




