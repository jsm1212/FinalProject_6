package health.back.etc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.mail.*;
import javax.mail.internet.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Configuration
public class Mailer {
	private static final Logger LOG = LoggerFactory.getLogger(Mailer.class);

//	@Bean("email_check")
//	public Mailer create() {
//		return this;
//	}

	String mailId = "";	// 보내는 이메일
	String password = "";	// 보내는 이메일 비밀번호

	public int SendMail(String email, String title, String content) {
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = fm.format(new Date());
		
		LOG.info("Mailer - email : " + email);
		LOG.info("Mailer - time : " + time);

		String host = "smtp.naver.com"; // smtp.사이트 주소

		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", 587);

		try {
			Session session = Session.getDefaultInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(mailId, password);
				}
			});
			MimeMessage message = new MimeMessage(session);
			message.setHeader("Content-Type", "text/plain; charset=UTF-8");
			message.setFrom(new InternetAddress(mailId));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject(MimeUtility.encodeText(title, "UTF-8", "B")); // 메일 제목
			message.setContent(content, "text/html; charset=UTF-8"); // 메일 내용

			Transport.send(message);
			System.out.println("Success Message Send");
		} catch (Exception e) {
			LOG.info(e.getMessage());
			return 0;
		}
		LOG.info("signupSendMail - send mail success");
		return 1;	
	}
}
