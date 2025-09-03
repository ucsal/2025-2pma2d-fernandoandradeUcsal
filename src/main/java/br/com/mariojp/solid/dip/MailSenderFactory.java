package br.com.mariojp.solid.dip;

public class MailSenderFactory {
    public static MailSender createSender() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            return new DryRunMailSender();
        } else {
            return new SmtpClient();
        }
    }
}