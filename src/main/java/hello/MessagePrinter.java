package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component // 组件
public class MessagePrinter {
    private MessageService messageService;

//    @Autowired // 自动装配 (DI)
//    public MessagePrinter(MessageService messageService) {
//        this.messageService = messageService;
//    }

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
