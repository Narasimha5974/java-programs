public class primitivedt {
    // Primitive data types with default values
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    // Reference type with default value
    String defaultString;

    // Method to print default values of instance variables
    public void printDefaultValues() {
        System.out.println("Default values of instance variables:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: '" + defaultChar + "'"); 
        System.out.println("boolean: " + defaultBoolean);
        System.out.println("String: " + defaultString);   
    }

    public static void main(String[] args) {
        primitivedt d = new primitivedt();
        d.printDefaultValues();
    }
}
