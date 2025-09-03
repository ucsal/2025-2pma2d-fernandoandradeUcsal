package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY RUN: E-mail não enviado. Para: " + to + ", Assunto: " + subject);
    }
}