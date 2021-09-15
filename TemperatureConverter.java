import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureConverter{
    public static DecimalFormat f = new DecimalFormat("0.00");
    public static void celsiusToFahrenheit(){
        Scanner scanner = new Scanner(System.in);
        char choice;
        do{
            System.out.println("Enter the temperature in degree celsius:");
            float celsius = scanner.nextFloat();
            float fahrenheit = (celsius*1.8f)+32;
            System.out.println("Temperature(Celsius)="+f.format(celsius)+"\t\t\t"+"Temperature(Fahrenheit)="+f.format(fahrenheit)); 
            System.out.println("Do you wish to continue(y/n)?");
            choice = scanner.next().charAt(0);
        }while(choice =='y'|| choice == 'Y');     
        
    }
        public static void main(String[] main){
            celsiusToFahrenheit();
          

        }          
}