package health.back.a.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class LoginMemberDto {
	
	/*
	 CREATE TABLE LOGINMEMBERS(
	ID VARCHAR2(100) PRIMARY KEY,
	PWD VARCHAR2(100) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	NICKNAME VARCHAR2(30) NOT NULL,
	GENDER VARCHAR2(10) NOT NULL,
	AGE NUMBER(10) NOT NULL,
	EMAIL VARCHAR2(70) UNIQUE,
	TEL VARCHAR2(70) NOT NULL,
	AUTH NUMBER(10) NOT NULL,
	REGIDATE DATE NOT NULL
	);
	
	
	 */
	@NotBlank(message="아이디를 입력하세요.")
	private String id;
	
	@NotBlank(message="비밀번호를 입력하세요.")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}", message = "비밀번호는 영문 대 소문자, 숫자, 특수문자를 포함하여 8자 이상만 가능합니다.")
	private String pwd;
	
	@NotBlank(message="이름을 입력하세요.")
	private String name;
	
	@NotBlank(message="닉네임을 입력하세요.")
	@Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{2,10}$", message = "닉네임은 특수문자를 제외한 2~10자리만 가능합니다.")
	private String nickname;
	
	@NotBlank(message="성별을 선택하세요.")
	private String gender;
	
	@NotNull(message="나이를 입력하세요.")
	private int age;
	
	@NotBlank(message="이메일을 입력하세요.")
	@Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "이메일 형식이 올바르지 않습니다.")
	private String email;
	
	@NotBlank(message="핸드폰번호를 입력하세요.")
	@Pattern(regexp = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$", message = "핸드폰번호 형식이 올바르지 않습니다.")
	private String tel;
	private int auth;
	private String regidate;
	
	public LoginMemberDto() {
		
	}

	public LoginMemberDto(String id, String pwd, String name, String nickname, String gender, int age, String email,
			String tel, int auth, String regidate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nickname = nickname;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.tel = tel;
		this.auth = auth;
		this.regidate = regidate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	@Override
	public String toString() {
		return "LoginMemberDto [id=" + id + ", pwd=" + pwd + ", name=" + name + ", nickname=" + nickname + ", gender="
				+ gender + ", age=" + age + ", email=" + email + ", tel=" + tel + ", auth=" + auth + ", regidate="
				+ regidate + "]";
	}
	
	
}
