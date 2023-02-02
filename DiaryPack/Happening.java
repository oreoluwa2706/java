package DiaryPack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  Happening {
    private  int id;
    private  String title;
    private  String body;
    private final LocalDateTime timeOfHappenings;

    public  Happening(int id, String title,String body){
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfHappenings = LocalDateTime.now();
    }

    public int getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getBody() {

        return body;
    }
public void setBody(String body){

        this.body = body;
}
public void setTitle(String title){

        this.title = title;
}

    public void setId(int id) {

        this.id = id;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").
                format(timeOfHappenings);
        return String.format("""
                ============================
                Entry %s
                Written on%s
                Title: %s
                Body: %s
                =============================%n""", id, time, title, body);
    }
}
