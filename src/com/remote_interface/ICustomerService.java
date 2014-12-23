package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote{
	
	
	/**
	 * ��ӿͻ�   ����Զ�����   �ɹ�dialog
	 * @param name  
	 * @param type
	 * @param address
	 * @param phone
	 * @param zip
	 * @param mail
	 * @param operator
	 * @throws RemoteException
	 */
	public void addCustomer(String name,int type,String address,String phone,String zip,String mail,double max,String operator)throws RemoteException;
	/**
	 * �ɱ��ȡ�ÿͻ���Ϣ
	 * @param no �Ƿ����
	 * @return  ������null
	 * @throws RemoteException
	 */
	public Customer queryCustomer(String no)throws RemoteException;
	/**
	 * ģ����ѯ �漰name  
	 * @param key
	 * @return �����ڷ��ؿ�array
	 * @throws RemoteException
	 */
	public ArrayList<Customer> queryCustomerByKeyword(String key)throws RemoteException;
	/**
	 * ��ѯ���пͻ�
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Customer> queryAllCustomer()throws RemoteException;
	/**
	 * �޸Ŀͻ�  �ɹ�dialog
	 * @param no  �Ƿ����  ������dialog
	 * @param address
	 * @param phone
	 * @param zip
	 * @param mail
	 * @param max
	 * @param operator
	 * @throws RemoteException
	 */
	public void modCustomer(String no,String name,String address,String phone,String zip,String mail,double max,String operator)throws RemoteException;
	/**
	 * ɾ���ͻ�   �ɹ�dialog
	 * @param no  �Ƿ���� ������dialog
	 * @param operator
	 */
	public void delCustomer(String no,String operator)throws RemoteException;;
}
