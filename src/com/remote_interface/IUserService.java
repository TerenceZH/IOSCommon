package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Message;
import com.model.User;

public interface IUserService extends Remote{
	
	/**
	 * ��½�ж��Ƿ�ƥ��
	 * @param username
	 * @param password
	 * @return  ��������򷵻�user������null 
	 * @throws RemoteException
	 */
	public User getUser(String username,String password)throws RemoteException;
	
	/**
	 * ����û�  �ɹ�dialog
	 * @param name �Ƿ����    ������dialog
	 * @param pwd
	 * @param type
	 * @param auth
	 * @throws RemoteException
	 */
	public void addUser(String name,String pwd,int type,int auth,String operator)throws RemoteException;
	
	/**
	 * �޸��û����Ȩ��   �ɹ�dialog
	 * @param no �Ƿ����  ������dialog
	 * @param auth
	 * @throws RemoteException
	 */
	public void modUser(String no,int auth,String operator)throws RemoteException;
	/**
	 * �޸�����  �ɹ�dialog
	 * @param user ��ǰ�û�
	 * @param password ������
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	/**
	 * ��ȡ��Ϣ   ʱ������
	 * @param user
	 * @param type  ����?0:1    δ��1
	 * @return ���û���򷵻� ��array
	 * @throws RemoteException
	 */
	public ArrayList<Message> getMessage(User user,int type) throws RemoteException;
	/**
	 * ��Ϊ�Ѷ�
	 * @param no  ��Ϣid
	 * @throws RemoteException
	 */
	public void readMessage(String id)throws RemoteException;

}
