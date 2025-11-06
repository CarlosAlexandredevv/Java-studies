public class Aritmeticos {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a + 12);
        System.out.println(19 + 12 + 7 + 876);

        System.out.println("Somando: " + a + b);
        System.out.println("Subtraindo: " + (a - b));
        System.out.println("Multiplicando: " + (a * b));
        System.out.println("Dividindo: " + (a / (double) b));
        System.out.println("Resto: " + (a % b));
     
        System.out.println(6 * 5 + ( 5 - 3) % 7 / 3 * 12);
    }
}