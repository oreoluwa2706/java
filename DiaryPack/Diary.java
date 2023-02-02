package DiaryPack;

import java.util.ArrayList;
import java.util.List;


public class Diary {
    private boolean isLocked;
    private final String password;

    private static final List<Happening> happenings = new ArrayList<>();


    public Diary(String username, String password) {
        this.password = password;

    }

    public boolean isLocked() {

        return isLocked;
    }

    public void unlockWith(String password) {
        if (password.equals(this.password)) isLocked = false;



    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String body) {
        writeIntoDiary(title, body);
        IllegalArgumentException exception = new IllegalArgumentException("write correctly in the diary");
        if (isLocked) throw  exception;
        //if(isLocked)throw new IllegalArgumentException("write correctly in the diary");

    }

    private void writeIntoDiary(String title, String body) {
        int id = numberOfHappenings() + 1;
        Happening newHappening = new Happening(id, title, body);
        happenings.add(newHappening);

    }

    public int numberOfHappenings() {
        return happenings.size();
    }

    public Happening findHappeningWithId(int id) {
        for (Happening happening : happenings) {
            if (happening.getId() == id) {
                return happening;
            }
        }

        return null;
    }

    public void happeningCanUpdateBody(int id, String body) {
        for (int index = 0; index < happenings.size(); index++) {
            Happening happening = happenings.get(index);
            if (happening.getId() == id) {
                String body1 = happening.getBody();
                happening.setBody(String.format("%s%n%s", body1, body));
                break;
            }
        }


    }

    public void happeningCanUpdateTitle(int id, String title) {
        for (int index = 0; index < happenings.size(); index++) {
            Happening happening = happenings.get(index);
            if (happening.getId() == id) {
                String title1 = happening.getTitle();
                happening.setTitle(String.format("%s%n%s", title1, title));
                break;
            }
        }


    }

    public void happeningCanBeDeleted(int id) {
        for (int index = 0; index < happenings.size(); index++) {
            Happening happening = happenings.get(index);
            if (happening.getId() == id) {
                happenings.remove(index);
                System.out.println(happenings);
                break;
            }
        }
    }

}



