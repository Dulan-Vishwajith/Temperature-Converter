import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;
        String newUnit;

        System.out.print("Enter the temperature : ");
        temp = input.nextDouble();
        input.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit(C or F): ");
        unit = input.nextLine().toUpperCase();
        System.out.printf("%.2f%s\n",temp,unit);

        newTemp = (unit.equals("C"))? (temp-32)*5/9 : (temp*9/5)+32;
        newUnit = (unit.equals("C"))? "F":"C";
        System.out.printf("%.2f%s\n",newTemp,newUnit);

        input.close();

    }
}
