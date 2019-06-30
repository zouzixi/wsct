package cn.wsct.service;

import java.util.List;

import cn.wsct.pojo.User;

public interface UserService {

	//登陆验证
	public List<User> loginUser(String telephone,String password);
	
	//注册用户
	public int registUser(String telephone,String password);
	
	//判断是否已经存在该用户
	public List<User> selectExist(String telephone);
}
