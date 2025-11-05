public class ChallengerAreaOfTheCircle {
    public static void main(String[] args) {
        areaOfTheCircle(20);
    }

    public static void areaOfTheCircle(double radius){

        if( radius < 0) throw new IllegalArgumentException("Radius can't negative");

        final double pi = Math.PI;

        final double area = pi * radius * radius;

        System.out.println("Area of the circle:  " + area +  "m2");
   }
}
