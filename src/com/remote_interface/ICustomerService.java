package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote{
	
	
	/**
	 * 添加客户   编号自动生成   成功dialog
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
	 * 由编号取得客户信息
	 * @param no 是否存在
	 * @return  不存在null
	 * @throws RemoteException
	 */
	public Customer queryCustomer(String no)throws RemoteException;
	/**
	 * 模糊查询 涉及name  
	 * @param key
	 * @return 不存在返回空array
	 * @throws RemoteException
	 */
	public ArrayList<Customer> queryCustomerByKeyword(String key)throws RemoteException;
	/**
	 * 查询所有客户
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Customer> queryAllCustomer()throws RemoteException;
	/**
	 * 修改客户  成功dialog
	 * @param no  是否存在  不存在dialog
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
	 * 删除客户   成功dialog
	 * @param no  是否存在 不存在dialog
	 * @param operator
	 */
	public void delCustomer(String no,String operator)throws RemoteException;;
}
