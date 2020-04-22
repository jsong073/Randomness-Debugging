import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random random = new Random();

        for (int i = 0; i < 10; ++i)
        {
            int randomInt = random.nextInt(7);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}