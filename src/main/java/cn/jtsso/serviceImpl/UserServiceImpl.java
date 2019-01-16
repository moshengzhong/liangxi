package cn.jtsso.serviceImpl;

import cn.jtsso.common.vo.SysResult;
import cn.jtsso.service.UserService;
import cn.jtsso.user.pojo.User;

public class UserServiceImpl implements UserService {

	@Override
	public SysResult check(String param, Integer type) {
		return null;
	}

	@Override
	public boolean register(User user) {
		return false;
	}

	@Override
	public String login(String userName, String passwd) {
		return null;
	}

	@Override
	public String queryUserByTicket(String ticket) {
		return null;
	}

}
