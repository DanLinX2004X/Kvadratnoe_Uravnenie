//импортируем класс Scanner, необходимый для ввода данных
import java.util.Scanner;

public class KvadratnoeUravnenie {
  public static void main(String[] args) {

    double a,b,c,D,Di,x1,x2;
    //Создадим новый объект класса Scanner, он необходим для ввода данных в программу. Инициализируем этот объект класса входным потоком:
    Scanner in = new Scanner(System.in);

    System.out.println("Решение квадратного уравнения для маленьких и тупых");

    System.out.print("Введите коэффициент a ");
    a = in.nextDouble();

    System.out.print("Введите коэффициент b ");
    b = in.nextDouble();

    System.out.print("Введите коэффициент c ");
    c = in.nextDouble();

    D = b*b-4*a*c; //стандартная формула нахождения дискриминанта
    //случай, когда дискриминант положителен
    if(D > 0){
      x1 = (-b - Math.sqrt(D)) / (a * 2);
      x2 = (-b + Math.sqrt(D)) / (a * 2);
      System.out.println("Решение:" +x1 + " " + x2 );
      //случай, когда дискриминант равен нулю
    } else if (D == 0) {
      x1 = -b / (D * 2);
      System.out.println("Решение:" + x1 );
      //случай, когда дискриминант отрицателен
    } else{

      System.out.println("Нет действительных корней, зато есть комплексные числа");
      x1 = -b / (2 * a);
      Di = Math.sqrt(-D) / (2 * a);
      System.out.println("Решение:"+ x1 + " ± " + Di + "i"  );

    }
  }
}
