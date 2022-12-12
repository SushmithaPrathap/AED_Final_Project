/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt sendTo change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java sendTo edit this template
 */
package model.Utility;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.swing.JOptionPane;

/**
 *
 * @author sushmithaprathap
 */
public class Validation {

    public static boolean validateName(String name) {
        Pattern pat;
        Matcher matcher;
        String PATTERN_NAME = "^[A-Za-z]{1,}[\\s]{0,1}[A-Za-z]{0,}$";
        pat = Pattern.compile(PATTERN_NAME);
        matcher = pat.matcher(name);
        return matcher.matches();
    }

    public static boolean validateDate(String currentDate) {
        Pattern pat;
        Matcher matcher;
        String PATTERN_NAME = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$";
        ;
        pat = Pattern.compile(PATTERN_NAME);
        matcher = pat.matcher(currentDate);
        return matcher.matches();
    }

    public static boolean ValidateUserName(String name) {
        Pattern pat;
        Matcher matcher;
        String PATTERN_NAME = "^[A-Za-z0-9\\s]+$";
        pat = Pattern.compile(PATTERN_NAME);
        matcher = pat.matcher(name);
        return matcher.matches();
    }

    public static boolean validateEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String PATTERN_EMAIL
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(PATTERN_EMAIL);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validatePassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PATTERN_PASSWORD
                = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{6,}$";
        pattern = Pattern.compile(PATTERN_PASSWORD);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }

    public static boolean validatePhone(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PATTERN_PHONE = "^[0-9]{10}$";
        pattern = Pattern.compile(PATTERN_PHONE);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }

    public Boolean phoneNumValidity(String customerContact) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(customerContact);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean validateInt(String number) {
        Pattern pattern;
        Matcher matcher;
        String PATTERN_INT = "^[0-9]$";
        pattern = Pattern.compile(PATTERN_INT);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean validatorForString(String number) {
        Pattern pattern;
        Matcher matcher;
        String PATTERN_STRING = "^[A-Za-z\\s]$";
        pattern = Pattern.compile(PATTERN_STRING);
        matcher = pattern.matcher(number);
        boolean match = number.matches("[a-zA-Z\\s]+");
        //return matcher.matches();
        return match;
    }

    public static boolean validateString(String s) {
        boolean value = s.matches("[a-zA-Z\\s]+");
        return value;
    }

    public static boolean validateAplhaNumeric(String s) {
        boolean value = value = s.matches("[a-zA-Z0-9]+");
        return value;
    }

    public static boolean validateNumeric(String s) {
        boolean value = value = s.matches("[0-9]+");
        return value;
    }

    public static boolean validateDouble(String s) {
        boolean value = value = s.matches("^(-?)(0|([1-9][0-9]*))(\\\\.[0-9]+)?$");//"[0-9]+.[0-9][0-9]");

        return value;
    }

    public static void sendEmailMessageFunc(String email, String sub, String txt) {
        String sendTo = email;
        String sendFrom = "aedhealthcare413@gmail.com";
        String password = "ksmqagaoljqplihs";

        Properties properties = System.getProperties();
        String hostname = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", hostname);
        properties.put("mail.smtp.user", sendFrom);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendFrom));
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
            message.setSubject(sub);
            message.setText(txt);

            Transport transport = session.getTransport("smtp");
            transport.connect(hostname, sendFrom, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent successfully!!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendEmailAttachmentFunc(String emailId, String sub,
            String txt, String filepath) {
        String sendTo = emailId;
        String sendFrom = "aedhealthcare413@gmail.com";
        String password = "ksmqagaoljqplihs";

        Properties properties = System.getProperties();
        String hostname = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", hostname);
        properties.put("mail.smtp.user", sendFrom);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendFrom));
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
            message.setSubject(sub);
            message.setText(txt);
            MimeBodyPart messageBodyPart = new MimeBodyPart();

            Multipart multipart = new MimeMultipart();

            String file = filepath;//"path of file sendTo be attached";

            DataSource source = new FileDataSource(file) {
                @Override
                public String getContentType() {
                    return "application/octet-stream";
                }
            };
            messageBodyPart.setDataHandler(new DataHandler(source));
            String fileName = "Reports";
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            Transport transport = session.getTransport("smtp");
            transport.connect(hostname, sendFrom, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendTextMessageFunc(String contact, String sub, String txt) {
        String sendTo = contact;
        System.out.println(contact + sub + txt);
        String sendFrom = "aedhealthcare413@gmail.com";
        String password = "ksmqagaoljqplihs";
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", sendFrom);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendFrom));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
            message.setSubject(sub);
            message.setText(txt);
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

    public static boolean checkUserNameUniqueAcrossNetworksFunc(EcoSystem sys, String userName) {
        //check if userName is unique
        boolean uNameUnique = true;
        //boolean flag = false;
        for (Network net : sys.getNetworkArray()) {
            List<Enterprise> enterpriseList = net.getEnterpriseDir().getEnterpriseArray();
            for (Enterprise entpr : enterpriseList) {
                uNameUnique = entpr.getUserAcctDir().checkIfUserNameIsUnique(userName);
                if (uNameUnique == false) {
                    //  JOptionPane.showMessageDialog(null, "Username already exists, try another name!");
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSNNValidUniqueFunc(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        return (validateNumeric(ssn));
    }
}
