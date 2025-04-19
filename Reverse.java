public class Reverse

 {
    public static void main(String[] args) 

    {
        // Original string
        String str = "Juhi";

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Print the reversed string
        System.out.println(reversed);
    }
}