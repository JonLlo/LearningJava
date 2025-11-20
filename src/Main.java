void main() {

    //lesson 1-3
    IO.println("hello");

    byte smallNumber = 10;
    short shortValue = 3000;
    int number = 100000;
    long distance = 500_000_000_000l;

    float temp = 36.6f;
    double pi = 3.141592654;

    char grade ='A';
    boolean isActive = true;

    Byte smallNumberW = Byte.MAX_VALUE;
    byte maxNumber = Byte.MAX_VALUE;
    IO.println(smallNumberW);
    IO.println(maxNumber);

    float maxDec = Float.MAX_VALUE;
    IO.println(maxNumber);

    IO.println(maxDec);

    int x = 10;
    Integer boxed = x; //autoboxing (turning primitive into wrapper)

    Integer y = 25;
    int unboxed = y;

    int primitiveValue = 8;
    Integer wrapperValue = primitiveValue;

    byte b= 120;
    short s = b;
    int i = s;
    long l = i;

    long ls = 64_000;
    short iq = (short)ls; //casting
    //int iq = ls; -> required int, provided long.
    IO.println(ls);
    IO.println(iq);




    //binary code
    //0111 1111 -> 127 (one's compliment conversion)
    // add 1 -> 128 (two's compliment conversion)

    // 0000 0001 -> denary value 1
    // 1111 111 0 -> denary value -2
    // add 1
    // 1111 1111 -> denary value -1

    // 0110 1101 Byte value -> 109 (*)
    // 1111 1111 Byte value -> -1
    // 0000 0001 -> +1
    // 0000 0000 -> 0
    //overflow and underflow

    //0110 1101 0110 1101 -> a short. not a byte -> value -> 28,013
    short number1 = 28013;
    byte number2 = (byte)number1;
    IO.println("Number 2 = " + number2);
    //note number2 is the same as the binary 0110 1101 above (*)
    IO.println(number2 * 2);

    //Lesson 4/5: string class

    String caveman1 = "Fred Flintstone";
    String caveman2 = new String ("Fred Flintstone"); //allows for 2 fred flints in the heap
    IO.println(caveman1 == caveman2); //this will be false. but if you didn't do the above "new string etc" it would be true.
    IO.println(caveman1.equals(caveman2)); //can also just do this. slower but sometimes "==" doesn't right.
    String caveman3 = "Wilma Flintstone";
    caveman3 = caveman3.toUpperCase();

    String customer = "Alice";
    byte positionInQ = 5;
    float debt = 100.00f;
    String sFormat = String.format("Hello %s you are number %d on my list", "Alice", 5);
    IO.println(sFormat);
    IO.println("Hello " + customer + ", you are number " + positionInQ + " on my list!");
    String formattedText = String.format("Hello %s, you are number %d on my list. You owe us £%.2f", customer, positionInQ, debt);
    IO.println(formattedText);
    System.out.printf(formattedText);
    IO.println(String.format("[%10s]", "cat"));
    IO.println(String.format("[%-10s]", "dog"));
    IO.println(String.format("%d%%", 10));
    String multiline = """
            Hello World!!
            """;
    IO.println(multiline);

    //scanner
    /*
    Scanner reader =  new Scanner(System.in);
    IO.println("What is your name?: ");
    String yourName = reader.nextLine().trim();
    IO.print("What is your age?: ");
    byte yourAge = reader.nextByte();
    //yourAge = yourAge + (byte)1; cannot cast here
    yourAge++;
    System.out.printf("Your name is %s, and your age next year will be %d", yourName, yourAge);
    */
    //
    Integer type1 = 128; //autoboxing (int to Integer)
    Integer type2 = 128;
    IO.println(type1 == type2); //this is false
    IO.println(type1.equals(type2)); //this is true

    Byte type3 = 127;
    Byte type4 = 127;
    IO.println(type3 == type4); //this is true
    IO.println(type3.equals(type4)); //this is true

    short type5 = 128;
    short type6 = 128;
    IO.println(type5 == type6);
    //IO.println(type5.equals(type6)); doesn't work as short is primitive and
    // primitive cannot use .equals - only wrapper can.

//lesson 6: casting

    //byte --> short --> int ->> long -> float -> double (left can easily transfer to right) (WIDENESS)
    //long --> int --> short --> byte (even if number range is inside group, still cant transfer)
    long longNum = 100;
    //int intNum = longNum;no work must cast:
    int intNum = (int)longNum;

    int numInt1 = 2;
    short numShort2 = 3;
    float result = numInt1/numShort2;
    long numLong3 = 51617228l;
    double result1 = numInt1 + numLong3; //WIDENING CONVERSION (as double is wider than above)
    //right hand needs to match the deepest type on the left (i.e. WIDENESS above^^)
    IO.println(result1);

    //NARROWING CONVERSION:
    double price = 1.49; //litre price for petrol
    int capacity = 20; //in litres
    int totalCostToFillTankFromEmpty =  capacity * (int) price; //NARROWING CONVERSION!!!!
    double totalCostToFillTankFromEmptyDouble = capacity * price;
    IO.println(totalCostToFillTankFromEmpty); //narrowing
    IO.println(totalCostToFillTankFromEmptyDouble); //not narrowing

    //casting between numbers and letters
    char letter = '?';
    int giveMeTheNumber = (int) letter; //65 - on ASCII table
    IO.println(giveMeTheNumber);

    int letterValue = 97;
    char thisIsTheCharacter = (char) letterValue;
    IO.println(thisIsTheCharacter);
//won't use this below bit again but shows you how it works//
    char digit = '7';
    int value = digit - '1';
    IO.println(value);
//
    char letter1 = 'B';
    char newLetter = (char)(letter1 + 32);
    IO.println(newLetter);
    //final
    final int MAX_RETRIES = 5; //naming convention for final is uppercase + camelcase
    //MAX_RETRIES = 6; -> no possible

    //stack v heap:
    //stack is an ordered area.


IO.println(3+6*7/9.0f); //prints float as float value is the widest

    //unary assignments
    byte b1 = -1;
    byte b2 = b1++;
    IO.println(b2);
    IO.println(b1);
    IO.println(-b2);

    IO.println(1/2.0); //double is the widest and so 0.5 outputs;
    IO.println(1/2); // int is the widest so 0 outputs;
































}