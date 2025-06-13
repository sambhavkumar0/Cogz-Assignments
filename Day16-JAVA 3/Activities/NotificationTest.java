interface Notifier {
    void send(String message);
}

abstract class BaseNotifier implements Notifier {
    protected String recipient;

    BaseNotifier(String recipient) {
        this.recipient = recipient;
    }
}

class EmailNotifier extends BaseNotifier {
    EmailNotifier(String recipient) {
        super(recipient);
    }

    public void send(String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class SMSNotifier extends BaseNotifier {
    SMSNotifier(String recipient) {
        super(recipient);
    }

    public void send(String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

public class NotificationTest {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier("alice@example.com");
        Notifier sms = new SMSNotifier("9876543210");

        email.send("Your order has been shipped.");
        sms.send("Your OTP is 123456.");
    }
}
