package cn.wsct.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

	@ResponseBody
	@RequestMapping("/login")
	public Map<String, Object> login(String telephone,String password){
		
		return null;
	}
}
