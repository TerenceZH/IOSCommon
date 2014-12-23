package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Account;

public interface IAccountService extends Remote{
	
	/**
	 * 添加账户  dialog
	 * @param name  
	 * @param money  默认是0
	 * @param time  yyyy-MM-dd HH:mm:ss
	 * @throws RemoteException
	 */
	public void addAccount(String name,double money,String time,String operator)throws RemoteException;
	/**
	 * 获取账户信息  
	 * @param no 是否存在
	 * @return  不存在返回null
	 * @throws RemoteException
	 */
	public Account queryAccount(String no)throws RemoteException;
	/**
	 * 模糊查找 涉及name
	 * @param key
	 * @return 不存在返回空array
	 * @throws RemoteException
	 */
	public ArrayList<Account> queryAccountByKeyword(String key)throws RemoteException;
	/**
	 * 查找所有
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Account> queryAllAccount()throws RemoteException;
	/**
	 * 修改账户的名称   dialog
	 * @param no 是否存在
	 * @param name
	 * @throws RemoteException
	 */
	public void modAccount(String no,String name,String operator)throws RemoteException;

}
