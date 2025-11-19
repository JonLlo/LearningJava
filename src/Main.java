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

    //Lesson 4: string class

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
            Hello World
            """;
    IO.println(multiline);

    //scanner
    Scanner reader =  new Scanner(System.in);
    IO.println("What is your name?: ");
    String yourName = reader.nextLine().trim();
    IO.print("What is your age?: ");
    byte yourAge = reader.nextByte();
    //yourAge = yourAge + (byte)1; cannot cast here
    yourAge++;
    System.out.printf("Your name is %s, and your age next year will be %d", yourName, yourAge);

    
















}