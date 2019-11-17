package ysit.api;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class SendEmail {
	public static int code;
	public void sendEmail(String userEmail) throws AddressException, MessagingException, UnsupportedEncodingException {
		// 메일 관련 정보

		String host = "smtp.gmail.com";

		final String username = "sby19462@gmail.com";
		final String password = "a1359746";
		code = (int) (Math.random() * 8999 + 1000);
		int port = 465;

		// 메일 내용

		String recipient = userEmail; // 수신자 기재

		String subject = "[YSIT]인증 번호를 보내드립니다."; // 제목

		String body = "인증 번호 : " + code; // 메일 내용, 개행은 \n 으로

		Properties props = System.getProperties();

		props.put("mail.smtp.host", host);

		props.put("mail.smtp.port", port);

		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.ssl.enable", "true");

		props.put("mail.smtp.ssl.trust", host);

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

			String un = username;

			String pw = password;

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(un, pw);

			}

		});

		session.setDebug(true); // for debug

		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(username));

		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		msg.setSubject(subject);

		msg.setSentDate(new Date());

		// 메일내용, 파일첨부를 위한 Multipart

		Multipart multipart = new MimeMultipart();

		// 메일내용 BodyPart를 생성

		BodyPart bodyPart = new MimeBodyPart();

		bodyPart.setText(body);

		// Multipart에 메일내용 BodyPart를 붙인다.

		multipart.addBodyPart(bodyPart);

		// 파일첨부용 BodyPart 생성

//	  BodyPart fileBody = new MimeBodyPart();
//
//	  String filename = "appCounselList.pdf";
//
//	  DataSource source = new FileDataSource("D:/W_JAVA_study/A_TeachingMaterial/1.BasicJava/workspace/Project_201_0924_kimi_ys_ryuupdate/appCounselList.pdf");
//	  fileBody.setDataHandler(new DataHandler(source));
//
//	  fileBody.setFileName(MimeUtility.encodeText(filename));

		// Multipart에 파일첨부용 BodyPart를 붙인다.

//	  multipart.addBodyPart(fileBody);

		// // 두 번째 파일첨부용 BodyPart 생성
		//
		// BodyPart fileBody1 = new MimeBodyPart();
		//
		// String filename1 = "test.txt";
		//
		// DataSource source1 = new FileDataSource("/test.txt");
		//
		// fileBody1.setDataHandler(new DataHandler(source1));
		//
		// // 파일명이 한글일 때 파일명이 깨지는 현상이 있으므로 MimeUtility.encodeText() 로 파일명 String을 감싸준다.
		//
		// fileBody1.setFileName(MimeUtility.encodeText(filename1));
		//
		//
		//
		// // Multipart에 두 번째 파일첨부용 BodyPart를 붙인다
		//
		// multipart.addBodyPart(fileBody1);

		// 이메일 메시지의 내용에 Multipart를 붙인다.

		msg.setContent(multipart);

		Transport.send(msg);

	}
}