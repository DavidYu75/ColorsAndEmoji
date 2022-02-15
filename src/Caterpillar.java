// credit to Mr. Das for the code used in this example!
import java.util.Arrays;

public class Caterpillar
{
    // constants: these are "unicode" characters that
    // each represent a color!
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    // emoji example (unicode)
    private final String GREEN_APPLE_EMOJI = "\uD83C\uDF4F";
    private final String TOP_LEFT_CORNER = "\u250C";
    private final String TOP_RIGHT_CORNER = "\u2510";
    private final String BOTTOM_LEFT_CORNER = "\u2514";
    private final String BOTTOM_RIGHT_CONRER = "\u2518";

    // instance variable
    private String name;

    // constructor
    public Caterpillar(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        // adding color to the console
        // note how you append a color string to change its color
        System.out.println(CYAN + "Hello," + RED + " my name is " + BROWN + name);
        System.out.println(BLUE + "and I am" + PURPLE + " a caterpillar!");
        System.out.println(WHITE + "Cool huh?");
    }

    public void printFavoriteFoods()
    {
        // search for emoji icons here:  https://www.fileformat.info/info/unicode/char/search.htm
        // when you find one you like, scroll down to "C/C++/Java source code" and copy/paste that string
        System.out.println("Pineapple: \uD83C\uDF4D");
        System.out.println("Red apple: \uD83C\uDF4E");
        System.out.println("Green apple: " + GREEN_APPLE_EMOJI);
        System.out.println("Clover: \uD83C\uDF40");
    }

    // this method "throws exceptions" which is an
    // advanced topic you don't need to know for this course, but for more info
    // check out: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
    public void animate() throws InterruptedException
    {
        // helper method defined below
        System.out.print(RED);
        System.out.println("                  \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "                " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                  ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("                 \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "               " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                 ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("                \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "              " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("                ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("               \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "             " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("               ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("              \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "            " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("              ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("             \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "           " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("             ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("            \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "          " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("            ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("           \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "         " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("           ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("          \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "        " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("          ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("         \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "       " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("         ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("        \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "      " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("        ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("       \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "     " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("       ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("      \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "    " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("      ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("     \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "   " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("     ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("    \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + "  " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("    ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("   \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + " " + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("   ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("  \\_/-.--.--.--.--.--.");
        System.out.println(GREEN_APPLE_EMOJI + BLUE + "(\")__)__)__)__)__)__)");
        System.out.print(WHITE);
        System.out.println("  ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        Thread.sleep(500);

        System.out.print(PURPLE);
        System.out.println(" \\_/-.--.--.--.--.--.");
        System.out.println("(\")__)__)__)__)__)__)");
        System.out.println(" ^ \"\" \"\" \"\" \"\" \"\" \"\"\"");
        System.out.println(RED + name + ": CHOMP CHOMP YUM!" + WHITE);
    }

    public void animate2() throws InterruptedException {
        String[] symbols = {"-", "\\", "|", "/",};

        System.out.print(BROWN + TOP_LEFT_CORNER);
        Thread.sleep(500);

        System.out.println(BLUE + TOP_RIGHT_CORNER);
        Thread.sleep(500);

        System.out.print(PURPLE + BOTTOM_LEFT_CORNER);
        Thread.sleep(500);

        System.out.println(RED + BOTTOM_RIGHT_CONRER);
        Thread.sleep(500);

        int index = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print(BROWN + TOP_LEFT_CORNER + CYAN + "---");
            //Thread.sleep(500);

            System.out.println(BLUE + TOP_RIGHT_CORNER);
            //Thread.sleep(500);

            System.out.println("  " + BLUE_BRIGHT + symbols[index]);

            System.out.print(PURPLE + BOTTOM_LEFT_CORNER + WHITE + "---");
            //Thread.sleep(500);

            System.out.println(RED + BOTTOM_RIGHT_CONRER);
            Thread.sleep(500);
            index++;
            if (index == 4) {
                index = 0;
            }
        }
    }
}