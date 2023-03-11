import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        dataTypes();
        // consoleInOut(); // Uncommenting this method allows you to consider the principles of input
        arithmeticalOperations();
        bitwiseOperations();
        conditionalExpressions();
        conditionalConstructions();
        cycles();
        massives();
        exampleMethod();
        introToExceptionHandling();
    }

    static void newString() {
        System.out.println();
    }

    static void dataTypes() {
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
        newString();
    }

    static void consoleInOut() {
        final String STRING = "Hello world";
        final String STRING_N = "Hello\nworld";
        final String TEXT_N = "Hello world \n" +
                "from JAVA!";
        final String TEXT = """
                            Hello world
                            from JAVA!
                            """;
        newString();
        System.out.println("Here's strings out:");
        System.out.printf("STRING: %s", STRING);
        newString();
        newString();
        System.out.printf("STRING_N:\n%s", STRING_N);
        newString();
        newString();
        System.out.printf("TEXT_N:\n%s", TEXT_N);
        newString();
        newString();
        System.out.printf("TEXT:\n%s", TEXT);
        newString();
        newString();

        final int EXAMPLE_D = 10;
        final double EXAMPLE_DOUBLE_F = 1.1d;
        final float EXAMPLE_FLOAT_F = -3.15f;
        final double EXAMPLE_E = 100.1;
        final char EXAMPLE_C = 'C';
        final byte EXAMPLE_X = 100;

        System.out.println("Formatted out:");
        System.out.printf("EXAMPLE_D = %d", EXAMPLE_D);
        newString();
        System.out.printf("EXAMPLE_DOUBLE_F = %f", EXAMPLE_DOUBLE_F);
        newString();
        System.out.printf("EXAMPLE_FLOAT_F = %f", EXAMPLE_FLOAT_F);
        newString();
        System.out.printf("EXAMPLE_E = %e", EXAMPLE_E);
        newString();
        System.out.printf("EXAMPLE_C = %c", EXAMPLE_C);
        newString();
        System.out.printf("EXAMPLE_X = %x", EXAMPLE_X);
        newString();
        newString();

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
        newString();
        newString();
    }

    static void arithmeticalOperations() {
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
        newString();

        int pre_increment = ++value_1;
        System.out.println("pre_increment = ++value_1");
        System.out.println("value_1 = " + value_1);
        System.out.println("pre_increment = " + pre_increment);
        newString();
        int post_increment = value_1++;
        System.out.println("post_increment = value_1++");
        System.out.println("value_1 = " + value_1);
        System.out.println("post_increment = " + post_increment);
        newString();
        int pre_decrement = --value_1;
        System.out.println("pre_decrement = --value_1");
        System.out.println("value_1 = " + value_1);
        System.out.println("pre_decrement = " + pre_decrement);
        newString();
        int post_decrement = value_1--;
        System.out.println("post_decrement = value_1--");
        System.out.println("value_1 = " + value_1);
        System.out.println("post_decrement = " + post_decrement);
        newString();
    }

    static void bitwiseOperations() {
        final int INT_1 = 2; // 010
        final int INT_2 = 5; // 101
        final int INT_3 = 4; // 100
        System.out.println("Here's bitwise operations:");
        System.out.println("INT_1 = " + INT_1);
        System.out.println("INT_2 = " + INT_2);
        System.out.println("INT_3 = " + INT_3);
        newString();
        System.out.println("Logical multiplication [&]:");
        System.out.println("INT_1 & INT_2 = " + (INT_1 & INT_2));
        System.out.println("INT_3 & INT_2 = " + (INT_3 & INT_2));
        newString();
        System.out.println("Logical addition [|]:");
        System.out.println("INT_1 | INT_2 = " + (INT_1 | INT_2));
        System.out.println("INT_3 | INT_2 = " + (INT_3 | INT_2));
        newString();

        final int NUMBER_TO_ENCRYPT = 45;
        final int KEY = 102;
        int encrypted_number = NUMBER_TO_ENCRYPT ^ KEY;
        int decrypted_number = encrypted_number ^ KEY;
        System.out.println("Logical addition [^]:");
        System.out.println("NUMBER_TO_ENCRYPT = " + NUMBER_TO_ENCRYPT);
        System.out.println("KEY = " + KEY);
        System.out.println("encrypted_number = NUMBER_TO_ENCRYPT ^ KEY = " + encrypted_number);
        System.out.println("decrypted_number = encrypted_number ^ KEY = " + decrypted_number);
        newString();

        System.out.println("Logical negation [~]:");
        System.out.println("INT_1 = " + (INT_1));
        System.out.println("~INT_1 = " + (~INT_1));
        newString();

        System.out.println("Shift operations [<<, >>, >>>]:");
        int shifted_left = INT_1 << 1;
        System.out.println("INT_1 << 1 = shifted_left = " + shifted_left);
        int shifted_right = shifted_left >> 2;
        System.out.println("shifted_left >> 2 = shifted_right = " + shifted_right);
        int cube_shifted_right = INT_1 >>> 4;
        System.out.println("INT_1 >>> 4 = cube_shifted_right = " + cube_shifted_right);
        newString();
    }

    static void conditionalExpressions() {
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
        newString();

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
        newString();
    }

    static void conditionalConstructions() {
        final int INT_1 = 1;
        final int INT_2 = 2;
        boolean isTrue = INT_1 < INT_2;
        System.out.println("Here's examples of conditional constructions:");
        System.out.println("if/else constructions");
        System.out.println("INT_1 = " + INT_1);
        System.out.println("INT_2 = " + INT_2);
        if(isTrue) {
            System.out.println("if: INT_1 < INT_2");
        } else if(INT_1 > INT_2) {
            System.out.println("else if: INT_1 > INT_2");
        } else {
            System.out.println("else: INT_1 == INT_2");
        }
        newString();

        byte exampleVal_1 = (byte)1;
        byte exampleVal_2;
        System.out.println("switch/case construction:");
        switch(exampleVal_1) {
            case 3:
                exampleVal_2 = exampleVal_1;
                System.out.println("case 3: exampleVal_1 = exampleVal_2 = 3");
                break;
            case 2:
                exampleVal_2 = exampleVal_1;
                System.out.println("case 2: exampleVal_1 = exampleVal_2 = 2");
                break;
            default:
                exampleVal_2 = exampleVal_1;
                System.out.println("default: exampleVal_1 = exampleVal_2 = " + exampleVal_2);
        }
        newString();

        int x = 1;
        int y = 2;
        int z = (x > y) ? (x + y) : (x - y);
        System.out.println("Ternary operation:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = (x > y) ? (x + y) : (x - y) = " + z);
        newString();
    }

    static void cycles() {
        System.out.println("Here's cycles:");
        System.out.println("cycle [for]:");
        for(int i = 0; i < 10; i++) {
            System.out.printf("i = %d; %d^2 = %d", i, i, (i * i));
            newString();
        }

        int counter_1 = 1;
        System.out.println("cycle [do] (do-while construction):");
        do {
            System.out.printf("counter_1 = %d", counter_1);
            counter_1++;
            newString();
        } while((counter_1 <= 5) && (counter_1 != 1));
        newString();

        int counter_2 = 1;
        System.out.println("cycle [while]:");
        while(counter_2 <= 5) {
            System.out.printf("counter_2 = %d", counter_2);
            counter_2++;
            newString();
        }
        newString();

        System.out.println("[continue] and [break] operators:");
        System.out.println("[break]:");
        System.out.println("cycle [for (int i = 0; i < 5; i++)]:");
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                System.out.printf("i = %d -> [break]", i);
                newString();
                break;
            }
            System.out.printf("i = %d", i);
            newString();
        }
        newString();

        System.out.println("[continue]:");
        System.out.println("cycle [for (int i = 0; i < 5; i++)]:");
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                System.out.println("miss -> [continue]");
                continue;
            }
            System.out.printf("i = %d", i);
            newString();
        }
        newString();
    }
    static void massives() {
        int[] arrayOfNumbers_1 = new int[] {1, 2, 3, 4};
        int[] arrayOfNumbers_2 = {2, 2, 8, 4, 5, 6};
        System.out.println("Here's massives:");
        System.out.print("Cycle [for]: arrayOfNumbers_1 = { ");
        for(int i = 0; i < arrayOfNumbers_1.length; i++) {
            System.out.print(arrayOfNumbers_1[i] + " ");
        }
        System.out.print("}");
        newString();
        System.out.print("Cycle [foreach]: arrayOfNumbers_2 = { ");
        for(int i : arrayOfNumbers_2) {
            System.out.print(i + " ");
        }
        System.out.println("}");
        newString();

        System.out.println("Multidimensional arrays:");
        int[][] multiDimArray = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("multiDimArray (2D) equals:");
        for(int i = 0; i < multiDimArray.length; i++) {
            for(int j = 0; j < multiDimArray[i].length; j++) {
                System.out.print(multiDimArray[i][j] + " ");
            }
            newString();
        }
        newString();
    }

    static void exampleMethod() {
        System.out.println("Here's example of method [static void sum(int ...numbers) { ... }]:");
        final int INT_1 = 1;
        final int INT_2 = 2;
        sum(INT_1, INT_2);
        sum(INT_1, 5);
        sum(6, 10);
        sum(1, 2, 3, INT_1, INT_2);
        sum();
        newString();

        System.out.println("Here's example of method [static float sum(float ...numbers) { ... }]:");
        float z = sum((float)INT_1, (float)INT_2);
        System.out.println("int z = sum(1.0, 2.0) = " + z);
        newString();

        System.out.println("Here's example of recurrent method [static int fibonachi(int n) { ... }]:");
        System.out.println("fibonachi(10) = " + fibonachi(10));
        newString();
    }
    static void sum(int ...numbers) {
        int result = 0;
        System.out.print("sum( ");
        for(int i : numbers) {
            System.out.printf("%d ", i);
            result += i;
        }
        System.out.printf(") = %d", result);
        newString();
    }
    /*
     * Here you can see the
     * so-called "method overloading"
     * [void sum()] and [float sum()]
     */
    static float sum(float ...numbers) {
        int result = 0;
        for (float i : numbers) {
            result += i;
        }
        return result;
    }
    static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    static void introToExceptionHandling() {
        int[] numbers = new int[4];
        System.out.println("Here's introduction to exception handling:");
        System.out.println("[try { ... } catch { ... } finally { ... }]:");
        System.out.println("int[] numbers = new int[4]");
        try {
            System.out.println("[try]: numbers[5] = 5");
            numbers[5] = 5; // Try changing the type of assigned data to "String"
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("[catch_1]: Going outside the array");
        } catch(NumberFormatException ex) {
            System.out.println("[catch_2]: Error converting from string to number");
        } finally {
            System.out.println("[finally]: complete");
        }
        newString();

        System.out.println("[throw] example:");
        try {
            int number = 10;
            System.out.println("[try]: int number = 10");
            if(number + 5 > 11) {
                throw new Exception("number > 11");
            }
        } catch (Exception ex) {
            System.out.print("[catch]: ");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("[finally]: complete");
        }
    }
}
                          
