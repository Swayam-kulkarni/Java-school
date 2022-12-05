package Assignment_12;

public class StringFunc {
    public static void main(String[] args){
        String str1 = "Computer";
        String str2 = "Applications"; 
        System.out.println("str1 = "+str1); 
        System.out.println("str2 = "+str2+"\n");
        //toUpperCase()
        String str3 = str1.toUpperCase(); 
        System.out.println("1. str1 to Uppercase : "+str3);
        //toLowerCase()
        System.out.println("2. str2 to lowercase' : "+str2.toLowerCase());
        System.out.println("3. Character at 2 : "+str1.charAt(1));
        // comparing str1 with str2
        System.out.println("4. str1 compared to str2 : "+str1.compareTo(str2));
        System.out.println("5. str1 compared to str2 (IgnoreCase) : "+str2.compareToIgnoreCase(str1));
        //concat()
        System.out.println("6. Concatenate str1 & str2 : "+str1.concat(str2));
        //equals()
        System.out.println("7 a. str1 equals str2 : "+str1.equals(str2)); 
        System.out.println(" b. str1 equals str3 : "+str1.equals(str3));
        //equalsIgnoreCase()
        System.out.println("8 a. str1 equals str2 (Ignore) : "+str1.equalsIgnoreCase(str2)); 
        System.out.println(" b. str1 equals str3 (Ignore) : "+str1.equalsIgnoreCase(str3));
        //startsWith()
        System.out.println("9. str1 startsWith 'Com' : "+str1.startsWith("Com"));
        //endsWith()
        System.out.println("10. str2 endsWith 'ons' : "+str2.endsWith("ons")); 
    }
}
