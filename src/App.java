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

        float percentFormater = interest / 100;
        
        float result = principal * percentFormater * years;

        System.out.print("Mortgage: ");
        System.out.println(currency.format(result));

    }
}
