package cn.wsct.service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wsct.dao.UserMapper;
import cn.wsct.pojo.User;
import cn.wsct.pojo.UserExample;
import cn.wsct.pojo.UserExample.Criteria;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> loginUser(String telephone, String password) {
		
		String md5Password = DigestUtils.md5Hex(password);
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUTelephoneEqualTo(telephone);
		criteria.andUPasswordEqualTo(md5Password);
		List<User> list = userMapper.selectByExample(example);
		return list;
	}

//	注册
	@Override
	public int registUser(String telephone, String password) {
		String encryptedPassword = DigestUtils.md5Hex(password);
		int result = userMapper.insertUser(telephone, encryptedPassword);
		return result;
	}

	//查找是否已存在该用户号码
	@Override
	public List<User> selectExist(String telephone) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUTelephoneEqualTo(telephone);
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
	//修改密码
	@Override
	public int updatePassword(User user) {
		int result = userMapper.updateByPrimaryKey(user);
		return result;
	}

}
