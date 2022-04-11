package health.back.etc;

import java.util.Date;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import health.back.a.dto.LoginMemberDto;
import health.back.a.service.LoginMemberService;

@RestController
public class etcController {
	@Autowired
	LoginMemberService sv;
	
	//@ResponseBody
	@RequestMapping(value = "/sendEmail", method = {RequestMethod.GET, RequestMethod.POST})
	public int sendEmail(LoginMemberDto dto) {
		System.out.println("etcController sendEmail 웹" + new Date());

		Mailer mail = new Mailer();
		
		boolean result = sv.checkEmail(dto);
		System.out.println("!!!!!이메일 확인 : " + dto.getEmail());		
		
		if(result) { // 회원 O
			// 인증번호 랜덤 생성
			Random rd = new Random();
			int randomNum = rd.nextInt(899999) + 100000; // 100000 ~ 999999까지 랜덤번호 생성
			System.out.println("!!!!!인증번호 확인 : " + randomNum);
			
			String title = "인증번호 전송";							// 메일 제목 
	        String content = "인증번호는 " + randomNum + " 입니다";	// 메일 내용
			mail.SendMail(dto.getEmail(), title, content);
			
			return randomNum;
		} else {
			return -1;
		}
	}
}