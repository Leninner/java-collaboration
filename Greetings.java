import java.util.Calendar;

public class Greetings {
  public static void main(String[] args) {
    // Obtener fecha con Calendar
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);

    // Imprimir saludo
    if (hour < 12) {
      System.out.println("Good morning! The time is " + hour + ":" + minute + ":" + second);
    } else if (hour < 18) {
      System.out.println("Good afternoon! The time is " + hour + ":" + minute + ":" + second);
    } else {
      System.out.println("Good evening! The time is " + hour + ":" + minute + ":" + second);
    }
  }
}
