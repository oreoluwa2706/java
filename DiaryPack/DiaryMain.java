package DiaryPack;


import javax.swing.*;
import java.util.Scanner;

public class DiaryMain {
    public static Scanner input = new Scanner(System.in);

    private static Diary diary;

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }

    public static void createDiary(){
        String mainMain = """
                Welcome to my Diary!!!
                Let's set it up
                """;

        print(mainMain);
        String username = input("Enter your name: ");
        String password = input("Enter your password: ");
        diary = new Diary(username, password);
        print("Diary created for "+ username);
        displayDiaryMenu();


    }
    private static void displayLockMenu(){
        String lockMenu = """
                
               Press 1 -> Unlock Diary
               Press 2 -> Lock Dairy
               Press 3 -> Exit
                """;

        String userInput = input(lockMenu);
        switch (Integer.parseInt(userInput)){
            case 1 : unlockDiary();
            case 2 : lockDairy();
            case 3 : exitApplication();
        }

    }



private static void findById(){
        String id = input("Enter the id for the entry you want to find");
        Happening foundHappening = diary.findHappeningWithId(Integer.parseInt(id));
        print(foundHappening.toString());
        displayDiaryMenu();

}

private static void createEntry(){
        String title = input("Enter title for your entry");
        String body = input("Enter body of your diary");
        diary.write(title,body );
        print("Written successfully");
        displayDiaryMenu();

}
private static void deleteEntry(){
        String id = input("delete entry by entering the id number");
        diary.happeningCanBeDeleted(Integer.parseInt(id));
        print("Entry successfully deleted");
        displayDiaryMenu();
}

    private static void exitApplication(){
        System.out.println("Thanks for using our application");
        System.exit(0);
    }
    private static void unlockDiary(){
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if(diary.isLocked()){
            print("Wrong password");
            //displayLockMenu();
        }
           displayLockMenu();

        }
    public static void displayDiaryMenu(){
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry BY id
                Press 3 -> Get total number of entries
                press 4 -> lock diary
                press 5 -> delete entry
                """;

        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> createEntry();
             case 2 -> findById();
            case 3 -> getTotalNumberOfHappenings();
            case 4 -> lockDairy();
            case 5 -> deleteEntry();
        }
    }
    private static void getTotalNumberOfHappenings(){
        int totalNumberOfHappenings = diary.numberOfHappenings();
        print("you have" + totalNumberOfHappenings);
        displayDiaryMenu();

    }
    private static void lockDairy(){
        diary.lock();
        print("Locked successfully");
        displayDiaryMenu();

    }

    private  static String input (String prompt){
       return JOptionPane.showInputDialog(null,prompt);
    }
    private static void print(String prompt){
       JOptionPane.showMessageDialog(null, prompt);



}
}
