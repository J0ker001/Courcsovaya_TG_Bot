package pro.sky.telegrambot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
public class NotificationTask {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long idChat;
    private String text;
    private LocalDateTime dateTime;

    public NotificationTask() {
    }

    public NotificationTask(long idChat, String text, LocalDateTime dateTime) {
        this.idChat = idChat;
        this.text = text;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public long getIdChat() {
        return idChat;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return id == that.id && idChat == that.idChat && Objects.equals(text, that.text) && Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idChat, text, dateTime);
    }

    @Override
    public String toString() {
        return "notificationTask{" +
                "id=" + id +
                ", idChat=" + idChat +
                ", text='" + text + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
