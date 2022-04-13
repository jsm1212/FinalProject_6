package health.back.a.controller;

import java.util.Date;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import health.back.etc.Mailer;

@RestController
public class etcController {
	@RequestMapping(value = "/sendemail", method = {RequestMethod.GET, RequestMethod.POST})
	public int sendemail(String email) {
		System.out.println("etcController sendemail 웹" + new Date());
		System.out.println("!!!!!이메일 확인 : " + email);	
		
		Mailer mail = new Mailer();
		
		// 인증번호 랜덤 생성
		Random rd = new Random();
		int randomNum = rd.nextInt(899999) + 100000; // 100000 ~ 999999까지 랜덤번호 생성
		System.out.println("!!!!!인증번호 확인 : " + randomNum);
		
		String title = "[나홀로 GYM에]인증번호 전송";				// 메일 제목 
        String content = "인증번호는 " + randomNum + " 입니다";	// 메일 내용
		mail.SendMail(email, title, content);
		
		return randomNum;
	}
}