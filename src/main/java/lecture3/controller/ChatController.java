package lecture3.controller;

import lecture3.dto.ChatDTO;
import lecture3.dto.MessageDTO;
import lecture3.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    final
    ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public ChatDTO getChat() {
        return chatService.getActualChat();
    }

    @PostMapping("/message")
    public void handleMessage(@RequestBody MessageDTO messageDTO) {
        System.out.println(messageDTO);
    }
}
