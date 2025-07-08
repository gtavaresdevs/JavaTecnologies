public class Main {
    //STRING INSPECTION METHODS

    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("    ");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        //METHODS FOR COMPARING STRING VALUES
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match exactly ignore case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("Hello")){
            System.out.println("String contains Hello");
        }
        // to get the content of the variable, ISN'T LIMITED TO JUST COMPARING STRING OBJECT, IT CAN BE USED TO COMPARE
        // STRING BUILDERS VALUE WHICH THE EQUALS METHOD DOESN'T SUPPORT.
        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Value match exactly");
        }
        //String comparison methods.


    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length -1));
    }



}
