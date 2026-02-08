class EmailSender {

    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}

public class SmsSender {

    public void sendSms(String message) {
        System.out.println("SMS sent: " + message);
    }
}

interface Sender{
    void send();
}

class SendEmail implements{
    @Override
    public void sendEmail(){
        // realisation
    }
}

class SendSMS implements{
    @Override
    public void sendSMS(){
        // realisation
    }
}
public class NotificationService {

    private EmailSender emailSender = new EmailSender();
    private SmsSender smsSender = new SmsSender();

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
        smsSender.sendSms(message);
    }
}