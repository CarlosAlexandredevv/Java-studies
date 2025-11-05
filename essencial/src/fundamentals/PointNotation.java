public class PointNotation {
    public static void main(String[] args) {
        String text = "Good morning!";
        text = text.replace("morning", "evening");
        text = text.toUpperCase();

        System.out.println(text);

        String name = "Carlos".toUpperCase().replace("CARLOS", "CARLOS ALEXANDRE");
        System.out.println(name);
    }
}
