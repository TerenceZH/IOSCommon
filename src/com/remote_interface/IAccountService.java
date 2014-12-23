package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Account;

public interface IAccountService extends Remote{
	
	/**
	 * ����˻�  dialog
	 * @param name  
	 * @param money  Ĭ����0
	 * @param time  yyyy-MM-dd HH:mm:ss
	 * @throws RemoteException
	 */
	public void addAccount(String name,double money,String time,String operator)throws RemoteException;
	/**
	 * ��ȡ�˻���Ϣ  
	 * @param no �Ƿ����
	 * @return  �����ڷ���null
	 * @throws RemoteException
	 */
	public Account queryAccount(String no)throws RemoteException;
	/**
	 * ģ������ �漰name
	 * @param key
	 * @return �����ڷ��ؿ�array
	 * @throws RemoteException
	 */
	public ArrayList<Account> queryAccountByKeyword(String key)throws RemoteException;
	/**
	 * ��������
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Account> queryAllAccount()throws RemoteException;
	/**
	 * �޸��˻�������   dialog
	 * @param no �Ƿ����
	 * @param name
	 * @throws RemoteException
	 */
	public void modAccount(String no,String name,String operator)throws RemoteException;

}
