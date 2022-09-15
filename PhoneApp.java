package tdd;
import java.util.Scanner;
public class PhoneApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("phonebook");
        System.out.println("Messages");
        System.out.println("Chat");
        System.out.println("Call register");
        System.out.println("Show call duration");
        System.out.println("Show call costs");
        System.out.println("Call cost settings");
        System.out.println("Prepaid credit");

      int phoneMenu = input.nextInt();

      switch(phoneMenu) {
          case 1:
              System.out.println("search");
              System.out.println("service no");
              System.out.println("Add name");
              System.out.println("Erase");
              System.out.println("Edit");
              System.out.println("Assign Tone");
              System.out.println("Send b'card");
              System.out.println("Options");
              System.out.println("Speed dials");
              System.out.println("Voice tags");
              break;


        case 2:
              System.out.println("Write Message");
              System.out.println("Inbox");
              System.out.println("Outbox");
              System.out.println("Picture messages");
              System.out.println("Templates");
              System.out.println("Smileys");
              System.out.println("Message Settings");
              break;

          case 3:
              System.out.println("chat");
              break;

          case 4:
              System.out.println("Missed Calls");
              System.out.println("Received calls");
              System.out.println("Dialled numbers");
              System.out.println("Erase recent call lists");
              break;

          case 5:
              System.out.println("Last call duration");
              System.out.println("All calls' cost");
              System.out.println("Received calls' duration");
              System.out.println("Dialled calls' duration");
              System.out.println("Clear timers");
              break;

          case 6:
              System.out.println("Last call cost");
              System.out.println("All calls' cost");
              System.out.println("Clear counters");
              break;

          case 7:
              System.out.println("call cost limit");
              System.out.println("Show costs in");
              break;

          case 8:
               System.out.println("prepaid credit");
               break;

          default :
              System.out.println("default");
              break;
      }

    }
}
