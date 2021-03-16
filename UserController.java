@Controller
public class UserController {

	// 로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("경로 : login");

		return "user/login";
	}
<<<<<<< HEAD

	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("경로 : insert");

		return "user/insert";
	}
}
=======
}
>>>>>>> 54294a565a6a8fcd73748c6c4142de01ee632eea
