public class StringMethods {
    public static void main(String[] args) {
       String birthDate = "25/11/1982";
       int startingIndex = birthDate.indexOf("1982");
       System.out.println("startingIndex = " + startingIndex);
       System.out.println("Birth year = " + birthDate.substring(startingIndex));
       String month = birthDate.substring(3,5);
       int stringIndex = birthDate.length();
       String year = birthDate.substring(3,stringIndex);
       System.out.println("Month = " + birthDate.substring(3,5));
       String newDate = String.join("/","25",month,year);
       System.out.println("newDate = " + newDate);

         //concat is shit, SAME AS PLUS OPERATOR

        //replace: oldChar or target string
        //replaceFirst regex
        // replaceAll regex
        //repeat is basically a counter
        // indent add spaces to left, if negative removes space from right

    }
}
