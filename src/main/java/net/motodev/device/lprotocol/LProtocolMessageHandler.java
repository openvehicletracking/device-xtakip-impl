package net.motodev.device.lprotocol;

import net.motodev.core.message.Message;
import net.motodev.core.message.MessageHandler;

import java.util.regex.Pattern;

/**
 * Created by oksuz on 19/05/2017.
 */
public class LProtocolMessageHandler implements MessageHandler<String> {

    public Pattern pattern() {
        return Pattern.compile("^@L.*!$");
    }

    public Message handle(String message) {
        return new LProtocolParser(message).parse();
    }
}