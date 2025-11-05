public class TypeString {
    public static void main(String[] args) {
        String text = "Good morning";

        text = text.trim();

        System.out.println(text.concat("!!!"));
        System.out.println(text + "!!!");
        System.out.println(text.toLowerCase().startsWith("good"));
        System.out.println(text.equals("Good morning"));
        System.out.println(text.equalsIgnoreCase("Good morning"));

        final String name = "Carlos";
        final int age = 20;

        String formattedText = """
            My name is %s and I am %d years old
            """.formatted(name, age);

        System.out.println(formattedText);

    }
}
