public class ConvertNumberForString {
    public static void main(String[] args) {
       int n1 = 12345;
       int n2 = 56789;

       String s1 = n1   + "";
       String s2 = n2 + "";

       System.out.println(s1 + s2);
     
       Integer n3 = 1234;
       System.out.println(n3.toString());

       System.out.println(String.format("Valor de n1: %d", n1));

       System.out.println("123" + 123.2);
    }
}
