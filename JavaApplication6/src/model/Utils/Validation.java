/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt sendTo change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java sendTo edit this template
 */
package model.Utils;

import java.awt.event.KeyEvent;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sushmithaprathap
 */
public class Validation {

    public static boolean validName(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z]{1,}[\\s]{0,1}[A-Za-z]{0,}$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean ValidUsername(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z\\s]+$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean validEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validPassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }

    public static boolean validPhone(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }

    public static void validString(KeyEvent evt, JTextField field) {
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c == evt.VK_SPACE)
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {

            JOptionPane.showMessageDialog(null, "Enter Alphabets only");
            field.setText(field.getText().substring(0, field.getText().length() - 1));
        }
    }

    public static void validInt(KeyEvent evt, JTextField field) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {

            JOptionPane.showMessageDialog(null, "Enter Integers only");
            //field.setText("");
            field.setText(field.getText().substring(0, field.getText().length() - 1));
        }
    }

    public static void sendEmailMessageFunc(String emailId, String subject, String text) {
        String sendTo = emailId;
        String sendFrom = "aedhealthcare413@gmail.com";
        String password = "ksmqagaoljqplihs";

        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", sendFrom);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendFrom));
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
            message.setSubject(subject);
            message.setText(text);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, sendFrom, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendTextMessage(String contact, String subject, String text) {
        String sendTo = contact;
        System.out.println(contact + subject + text);
        String sendFrom = "aedhealthcare413@gmail.com";
        String password = "ksmqagaoljqplihs";
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", sendFrom);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendFrom));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
            message.setSubject(subject);
            message.setText(text);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, sendFrom, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }
}
