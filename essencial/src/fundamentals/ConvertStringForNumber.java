import javax.swing.JOptionPane;

public class ConvertStringForNumber {
    
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog(
            "Enter the first number");
        double n1 = Double.parseDouble(value1);

        String value2 = JOptionPane.showInputDialog(
            "Enter the second number");
        double n2 = Double.parseDouble(value2);

        double sum = n1 + n2;

        System.out.println(value1);
        System.out.println(value2);
        System.out.printf("%.2f + %.2f = %.2f", n1, n2, sum);
    }
}
