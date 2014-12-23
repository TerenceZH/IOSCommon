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
	
	/**
	 * ��Ӹ��
	 * @param customer
	 * @param time
	 * @param operator
	 * @param list     ÿһ��Ԫ�ؾ���һ���˵�  ��ʽ :  account$money$desc
	 * @throws RemoteException
	 */
	public void addPayBill(String customer,String time,String operator,ArrayList<String>list)throws RemoteException;
	/**
	 * �ֽ���õ�
	 * @param account
	 * @param time
	 * @param operator
	 * @param list ÿһ��Ԫ�ؾ���һ���˵�  ��ʽ :  item$money$desc
	 * @throws RemoteException
	 */
	public void addCashPayBill(String account,String time,String operator,ArrayList<String>list)throws RemoteException;
	/**
	 * ����տ
	 * @param customer
	 * @param time
	 * @param operator
	 * @param listÿһ��Ԫ�ؾ���һ���˵�  ��ʽ :  account$money$desc
	 * @throws RemoteException
	 */
	public void addGetBill(String customer,String time,String operator,ArrayList<String>list)throws RemoteException;

}
