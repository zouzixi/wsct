package cn.wsct.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wsct.pojo.User;
import cn.wsct.service.UserService;
import cn.wsct.util.SmsSample;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private SmsSample smsSample;
	
	private Integer code = 0;
	//登陆
	@ResponseBody
	@RequestMapping("/login")
	public Map<String, Object> login(String telephone,String password,HttpSession session){
		Map<String, Object> map = new HashMap<>();
		if(!telephone.equals("") && !password.equals("")) {
			List<User> list = userService.loginUser(telephone, password);
			if(list != null && list.size() > 0) {
				//存在用户
				session.setAttribute("user", list.get(0));
				map.put("login", "1");
			}else {
				map.put("login", "0");
			}
		}
		return map;
	}
	//注册
	@ResponseBody
	@RequestMapping("/regist")
	public Map<String, Object> registUser(String telephone,String password,String rcode){
		Map<String, Object> map = new HashMap<>();
		if(rcode != null && !rcode.equals("")) {
			int rcodes = Integer.parseInt(rcode);
			if(rcodes == code) {
				//验证码通过
				if(!telephone.equals("") && !password.equals("")) {
					int result = userService.registUser(telephone, password);
					map.put("result", result);
				}
				
			}else {
				map.put("result", "500");
			}
			
		}
		return map;
	}
	//发送短信
	@ResponseBody
	@RequestMapping("/sendMessage")
	public String sendMessage(String telephone) {
		//判断是否已经注册
		List<User> list = userService.selectExist(telephone);
		if(list.size()>0) {
			//用户存在
			return "1";
		}else {
			code = (int)((Math.random()*9+1)*1000);
			smsSample.sendMessage(telephone, code);
			return "0";
		}
	}
	
	//注销用户
	@RequestMapping("/exit")
	public String exitUser(HttpSession session) {
		session.invalidate();
		return "index";
	}
}
