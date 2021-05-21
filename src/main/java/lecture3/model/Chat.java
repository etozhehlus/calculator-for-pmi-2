package lecture3.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;

@Data
@AllArgsConstructor
public class Chat implements Serializable {
    private LinkedList<Message> history;

    public Chat() {
        this.history = new LinkedList<>();
    }

    public void addMessage(Message message) {
        history.add(message);
    }

}
