import java.util.Scanner;
public class Main {
    public static void NewString()
    {
        System.out.println();
    }
    public static void DataTypes()
    {
        final String TEST_STR = "Hello world from JAVA";
        final boolean TEST_BOOL = false;
        final byte TEST_BYTE = 127;
        final short TEST_SHORT = 32767;
        final int TEST_INT = 2147483647;
        final long TEST_LONG = -9223372036854775808L;
        System.out.println("Here's types of data in JAVA:");
        System.out.println("String type [String]: " + TEST_STR);
        System.out.println("Boolean type [boolean]: " + TEST_BOOL + " " + !TEST_BOOL);
        System.out.println("Byte type [byte]: +-" + TEST_BYTE);
        System.out.println("Short type [short]: +-" + TEST_SHORT);
        System.out.println("Integer type [int]: +-" + TEST_INT);
        System.out.println("Long type [long]: (" + TEST_LONG + "; 9223372036854775807)");
        System.out.println("Double type [double]: +-4.9*10^(-324) and +-1.7976931348623157*10^(308)");
        System.out.println("Float type [float]: (-3.4*10^(38); 3.4*10^(38)");
        NewString();
    }

    public static void ConsoleInOut()
    {
        final String STRING = "Hello world";
        final String STRING_N = "Hello\nworld";
        final String TEXT_N = "Hello world \n" +
                "from JAVA!";
        final String TEXT = """
                            Hello world
                            from JAVA!
                            """;

        NewString();
        System.out.println("Here's strings out:");
        System.out.printf("STRING: %s", STRING);
        NewString();
        NewString();
        System.out.printf("STRING_N:\n%s", STRING_N);
        NewString();
        NewString();
        System.out.printf("TEXT_N:\n%s", TEXT_N);
        NewString();
        NewString();
        System.out.printf("TEXT:\n%s", TEXT);
        NewString();
        NewString();

        final int EXAMPLE_D = 10;
        final double EXAMPLE_DOUBLE_F = 1.1d;
        final float EXAMPLE_FLOAT_F = -3.15f;
        final double EXAMPLE_E = 100.1;
        final char EXAMPLE_C = 'C';
        final byte EXAMPLE_X = 100;

        System.out.println("Formatted out:");
        System.out.printf("EXAMPLE_D = %d", EXAMPLE_D);
        NewString();
        System.out.printf("EXAMPLE_DOUBLE_F = %f", EXAMPLE_DOUBLE_F);
        NewString();
        System.out.printf("EXAMPLE_FLOAT_F = %f", EXAMPLE_FLOAT_F);
        NewString();
        System.out.printf("EXAMPLE_E = %e", EXAMPLE_E);
        NewString();
        System.out.printf("EXAMPLE_C = %c", EXAMPLE_C);
        NewString();
        System.out.printf("EXAMPLE_X = %x", EXAMPLE_X);
        NewString();
        NewString();

        Scanner in = new Scanner(System.in);
        System.out.println("Here's input:");
        System.out.print("Input string [next()]: ");
        String string_next = in.next();
        System.out.print("Input text [nextLine()]: ");
        in.nextLine();
        String string_nextLine = in.nextLine();
        System.out.print("Input integer number [nextInt()]: ");
        int int_nextInt = in.nextInt();
        System.out.print("Input double number [nextDouble()]: ");
        double double_nextDouble = in.nextDouble();
        System.out.print("Input boolean [nextBoolean()]: ");
        boolean bool_nextBoolean = in.nextBoolean();
        System.out.print("Input byte number [nextByte()]: ");
        byte byte_nextByte = in.nextByte();
        System.out.print("Input float number [nextFloat()]: ");
        float float_nextFloat = in.nextFloat();
        System.out.print("Input short number [nextShort()]: ");
        short short_nextShort = in.nextShort();
        System.out.printf("""
                string_next = %s
                string_nextLine = %s
                int_nextInt = %d
                double_nextDouble = %f
                bool_nextBoolean = %s
                byte_nextByte = %d
                float_nextFloat = %f
                short_nextShort = %d
                """, string_next, string_nextLine, int_nextInt, double_nextDouble,
                !bool_nextBoolean, byte_nextByte, float_nextFloat, short_nextShort);
        NewString();
        NewString();
    }

    public static void ArithmeticalOperations()
    {
        final int INT_1 = 10;
        final int INT_2 = 15;
        final float FLOAT = 5.0f;
        int value_1 = 1;

        System.out.println("Here's arithmetical operations:");
        System.out.printf("""
                INT_1 = %d
                INT_2 = %d
                FLOAT = %f
                value_1 = %d
                """, INT_1, INT_2, FLOAT, value_1);

        int c = INT_1 + INT_2;
        int k = INT_1 - INT_2;
        int d = INT_1 * INT_2;
        float f = INT_1 * FLOAT;
        float h = INT_1 / FLOAT;
        int j = INT_2 / INT_1;
        int l = INT_1 % INT_2;
        System.out.println("c = INT_1 + INT_2 = " + c);
        System.out.println("k = INT_1 - INT_2 = " + k);
        System.out.println("d = INT_1 * INT_2 = " + d);
        System.out.println("f = INT_1 * FLOAT = " + f);
        System.out.println("h = INT_1 / FLOAT = " + h);
        System.out.println("j = INT_2 / INT_1 = " + j);
        System.out.println("l = INT_1 % INT_2 = " + l);
        NewString();

        int pre_increment = ++value_1;
        System.out.println("pre_increment = ++value_1");
        System.out.println("value_1 = " + value_1);
        System.out.println("pre_increment = " + pre_increment);
        NewString();
        int post_increment = value_1++;
        System.out.println("post_increment = value_1++");
        System.out.println("value_1 = " + value_1);
        System.out.println("post_increment = " + post_increment);
        NewString();
        int pre_decrement = --value_1;
        System.out.println("pre_decrement = --value_1");
        System.out.println("value_1 = " + value_1);
        System.out.println("pre_decrement = " + pre_decrement);
        NewString();
        int post_decrement = value_1--;
        System.out.println("post_decrement = value_1--");
        System.out.println("value_1 = " + value_1);
        System.out.println("post_decrement = " + post_decrement);
        NewString();
    }

    public static void BitwiseOperations()
    {
        final int INT_1 = 2; // 010
        final int INT_2 = 5; // 101
        final int INT_3 = 4; // 100
        System.out.println("Here's bitwise operations:");
        System.out.println("INT_1 = " + INT_1);
        System.out.println("INT_2 = " + INT_2);
        System.out.println("INT_3 = " + INT_3);
        NewString();
        System.out.println("Logical multiplication [&]:");
        System.out.println("INT_1 & INT_2 = " + (INT_1 & INT_2));
        System.out.println("INT_3 & INT_2 = " + (INT_3 & INT_2));
        NewString();
        System.out.println("Logical addition [|]:");
        System.out.println("INT_1 | INT_2 = " + (INT_1 | INT_2));
        System.out.println("INT_3 | INT_2 = " + (INT_3 | INT_2));
        NewString();

        final int NUMBER_TO_ENCRYPT = 45;
        final int KEY = 102;
        int encrypted_number = NUMBER_TO_ENCRYPT ^ KEY;
        int decrypted_number = encrypted_number ^ KEY;
        System.out.println("Logical addition [^]:");
        System.out.println("NUMBER_TO_ENCRYPT = " + NUMBER_TO_ENCRYPT);
        System.out.println("KEY = " + KEY);
        System.out.println("encrypted_number = NUMBER_TO_ENCRYPT ^ KEY = " + encrypted_number);
        System.out.println("decrypted_number = encrypted_number ^ KEY = " + decrypted_number);
        NewString();

        System.out.println("Logical negation [~]:");
        System.out.println("INT_1 = " + (INT_1));
        System.out.println("~INT_1 = " + (~INT_1));
        NewString();

        System.out.println("Shift operations [<<, >>, >>>]:");
        int shifted_left = INT_1 << 1;
        System.out.println("INT_1 << 1 = shifted_left = " + shifted_left);
        int shifted_right = shifted_left >> 2;
        System.out.println("shifted_left >> 2 = shifted_right = " + shifted_right);
        int cube_shifted_right = INT_1 >>> 4;
        System.out.println("INT_1 >>> 4 = cube_shifted_right = " + cube_shifted_right);
        NewString();
    }

    public static void ConditionalExpressions()
    {
        final int INT_1 = 10;
        final int INT_2 = 4;
        boolean c = INT_1 == INT_2;
        boolean d = INT_1 < INT_2;
        boolean f = INT_1 <= INT_2;
        System.out.println("Here's conditional expressions:");
        System.out.println("Comparison operations:");
        System.out.println("INT_1 = " + INT_1);
        System.out.println("INT_2 = " + INT_2);
        System.out.println("[==]:");
        System.out.println("boolean c = INT_1 == INT_2 = " + c);
        System.out.println("[!=]:");
        System.out.println("boolean c = INT_1 != INT_2 = " + !c);
        System.out.println("[<]:");
        System.out.println("boolean d = INT_1 < INT_2 = " + d);
        System.out.println("[>]:");
        System.out.println("boolean d = INT_1 > INT_2 = " + !d);
        System.out.println("[<=]:");
        System.out.println("boolean f = INT_1 <= INT_2 = " + f);
        System.out.println("[=>]:");
        System.out.println("boolean f = INT_1 => INT_2 = " + !f);
        NewString();

        final boolean BOOL_1 = true;
        final boolean BOOL_2 = false;
        System.out.println("Logical operations:");
        System.out.printf("""
                    BOOL_1 = %s
                    BOOL_2 = %s
                    """, BOOL_1, BOOL_2);
        System.out.println("[|]:");
        System.out.println("BOOL_1 | BOOL_2 = " + (BOOL_1 | BOOL_2));
        System.out.println("[&]:");
        System.out.println("BOOL_1 & BOOL_2 = " + (BOOL_1 & BOOL_2));
        System.out.println("[!]:");
        System.out.println("!BOOL_1 = " + !BOOL_1);
        System.out.println("[^]:");
        System.out.println("BOOL_1 ^ BOOL_2 = " + (BOOL_1 ^ BOOL_2));
        System.out.println("[||]:");
        System.out.println("BOOL_1 || BOOL_2 = " + (BOOL_1 || BOOL_2));
        System.out.println("[&&]:");
        System.out.println("BOOL_1 && BOOL_2 = " + (BOOL_1 && BOOL_2));
        NewString();
    }

    public static void main(String[] args)
    {
        DataTypes();
        // ConsoleInOut();
        ArithmeticalOperations();
        BitwiseOperations();
        ConditionalExpressions();
        
    }
}