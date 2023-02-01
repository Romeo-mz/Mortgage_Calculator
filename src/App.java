import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Interest Rate : ");
        float interest = scanner.nextFloat();

        System.out.print("Period (Years) : ");
        int years = scanner.nextInt();
        
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en","US"));

        final int MONTH = 12;
        double percentFormater = interest / 100; // Divie by 100 to have percentage

        int totalMonth = years / 12;

        double monthlyInterest = percentFormater / MONTH ; 

        double interestN = Math.pow(1 + percentFormater, totalMonth);
        
        double result = principal * (monthlyInterest * interestN) / interestN - 1;

        System.out.print("Mortgage: ");
        System.out.println(currency.format(result));

    }
}
