package repetition;

public class Switch1 {
    public static void main(String[] args) {
        int age = 18;

        switch(age){
            case 18:
                System.out.println("You are an adult");
                break;
            case 17:
                System.out.println("You are a teenager");
                break;
            default:
                System.out.println("You are a child");
                break;
        }
    }
}
