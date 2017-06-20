package net.motodev.device.oxprotocol;

import net.motodev.core.message.Message;
import net.motodev.core.message.MessageHandler;

import java.util.regex.Pattern;

/**
 * Created by oksuz on 20/05/2017.
 */
public class OXProtocolMessageHandler implements MessageHandler<String> {

    @Override
    public Pattern pattern() {
        return Pattern.compile("^@OX;\\d+;.*;.*;.*;.*!$");
    }

    @Override
    public Message handle(String s) {
        return new OXProtocolParser(s).parse();
    }
}