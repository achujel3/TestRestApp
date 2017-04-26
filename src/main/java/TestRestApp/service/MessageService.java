package TestRestApp.service;

import TestRestApp.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message(1L, "MessageText1", "Tom"));
        messages.add(new Message(2L, "MessageText2", "Dom"));
        return messages;
    }

}
