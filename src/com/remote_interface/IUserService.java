package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Message;
import com.model.User;

public interface IUserService extends Remote{
	
	/**
	 * 登陆判断是否匹配
	 * @param username
	 * @param password
	 * @return  如果存在则返回user，否则null 
	 * @throws RemoteException
	 */
	public User getUser(String username,String password)throws RemoteException;
	
	/**
	 * 添加用户  成功dialog
	 * @param name 是否存在    若存在dialog
	 * @param pwd
	 * @param type
	 * @param auth
	 * @throws RemoteException
	 */
	public void addUser(String name,String pwd,int type,int auth,String operator)throws RemoteException;
	
	/**
	 * 修改用户最高权限   成功dialog
	 * @param no 是否存在  不存在dialog
	 * @param auth
	 * @throws RemoteException
	 */
	public void modUser(String no,int auth,String operator)throws RemoteException;
	/**
	 * 修改密码  成功dialog
	 * @param user 当前用户
	 * @param password 新密码
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	/**
	 * 获取消息   时间排序
	 * @param user
	 * @param type  所有?0:1    未读1
	 * @return 如果没有则返回 空array
	 * @throws RemoteException
	 */
	public ArrayList<Message> getMessage(User user,int type) throws RemoteException;
	/**
	 * 标为已读
	 * @param no  消息id
	 * @throws RemoteException
	 */
	public void readMessage(String id)throws RemoteException;

}
