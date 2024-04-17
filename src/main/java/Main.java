import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    char symbol = scanner.next().charAt(0);

    System.out.println("podaj rozmiar bloku kwadratu: ");
    int size = scanner.nextInt();
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        System.out.print(symbol);
      }
       System.out.println(); 
    }
  }
}
