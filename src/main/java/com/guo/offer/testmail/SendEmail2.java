package com.guo.offer.testmail;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendEmail2 {
	public static void main(String[] args) {
		// �ռ��˵�������
		String to = "602394902@qq.com";

		// �����˵�������
		String from = "602394902@qq.com";

		// ָ�������ʼ�������Ϊ smtp.qq.com
		String host = "smtp.qq.com"; // QQ �ʼ�������

		// ��ȡϵͳ����
		Properties properties = System.getProperties();

		// �����ʼ�������
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		MailSSLSocketFactory sf = null;
		try {
			sf = new MailSSLSocketFactory();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sf.setTrustAllHosts(true);
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);
		// ��ȡĬ��session����
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("602394902@qq.com", "fvzmostizjlsbebi"); // �������ʼ��û���������
			}
		});

		try {
			// ����Ĭ�ϵ� MimeMessage ����
			MimeMessage message = new MimeMessage(session);

			// Set From: ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));

			// Set To: ͷ��ͷ�ֶ�
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: ͷ��ͷ�ֶ�
			message.setSubject("This is the Subject Line!");

			// ������Ϣ��
			message.setText("This is actual message");

			// ������Ϣ
			Transport.send(message);
			System.out.println("Sent message successfully....from runoob.com");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}