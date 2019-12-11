/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittes;

/**
 *
 * @author MuFin
 */
public class MessageProcessor1841720128Arifin {

    private String message, recipient, sender;

    public String getMessageArifin() {
        return message;
    }

    public String getRecipientArifin() {
        return recipient;
    }

    public String getSenderArifin() {
        return sender;
    }

    public void setMessageArifin(String message) {
        this.message = message;
    }

    public void setRecipientArifin(String recipient) {
        this.recipient = recipient;
    }

    public void setSenderArifin(String sender) {
        this.sender = sender;
    }

    public String messageFormatArifin() {
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", this.recipient, this.sender, this.message);
        return message;
    }

    public void showMessageArifin() {
        System.out.println(messageFormatArifin());
    }
}
