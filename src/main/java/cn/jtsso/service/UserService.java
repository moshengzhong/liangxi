package cn.jtsso.service;

import cn.jtsso.common.vo.SysResult;
import cn.jtsso.user.pojo.User;

public interface UserService {
	public SysResult check(String param, Integer type);
	public boolean register(User user);
	public String login(String userName, String passwd);
	public String queryUserByTicket(String ticket);
}
