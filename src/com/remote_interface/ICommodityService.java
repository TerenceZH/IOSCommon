package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
	
	/**
	 * ���ݸ��ڵ�������
	 * @param no
	 * @return  �����ڷ��ؿ�array
	 * @throws RemoteException
	 */
	public ArrayList<CommodityCategory> queryCategoryByParentNo(String no)throws RemoteException;
	/**
	 * ��ӷ���  �Զ����ɱ��  ����������Ʒ����������ӷ���  ��ӳɹ�dialog
	 * @param name  �����ظ�   ������dialog
	 * @param parentNo 
	 * @throws RemoteException
	 */
	public void addCommodityCategory(String name,String parentNo,String operator)throws RemoteException;
	/**
	 * ���ݱ�Ż�÷���
	 * @param no 
	 * @return �����ڷ���null
	 * @throws RemoteException
	 */
	public CommodityCategory getCategory(String no)throws RemoteException;
	/**
	 * �޸ķ���  �ɹ�dialog
	 * @param name  �Ƿ����  ������dialog 
	 * @param no
	 * @return  
	 * @throws RemoteException
	 */
	public void modCommodityCategory(String name,String no,String operator)throws RemoteException;
	/**
	 * ɾ������  ���������ӷ��������Ʒ����ɾ��
	 * @param no
	 * @return ����ɾ��dialog  ɾ���ɹ�dialog
	 * @throws RemoteException
	 */
	public void delCommdoityCategory(String no,String operator)throws RemoteException;
	/**
	 * ��ȡ���п��������Ʒ���࣬�÷�����ľ���ӷ���
	 * arraylist�д���Ƿ�������
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<String> getAllCommodityCategories()throws RemoteException;
	/**
	 * �����Ʒ������Զ����� ����Ĭ��0   �ɹ�dialog
	 * @param name
	 * @param style
	 * @param type  ��������ƣ����ҵ���š�����
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void addCommodity(String name,String style,String type,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * ���ݱ������ѯ  �Ƿ���� 
	 * @param no
	 * @return ������null
	 * @throws RemoteException
	 */
	public Commodity queryCommodity(String no)throws RemoteException;
	/**
	 * �ؼ���ģ����ѯ  �漰��name����style   
	 * @param keyword
	 * @return  �����ڿ�array
	 * @throws RemoteException
	 */
	public ArrayList<Commodity> queryCommodityByKeyword(String keyword)throws RemoteException;
	/**
	 * �������е���Ʒ
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Commodity> queryAllCommodity()throws RemoteException;
	/**
	 * �����ֶ��޸ĵ�ֵ  �ɹ�dialog
	 * @param no �Ƿ����  ������dialog
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void modCommodity(String no,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * ɾ����Ʒ���Ƿ����   �ɹ�dialog
	 * @param no  ������dialog
	 * @param operator
	 * @throws RemoteException
	 */
	public void delCommodity(String no,String operator)throws RemoteException;
	/**
	 * ��ӿ��XX��    �ɹ�dialog 
	 * @param type
	 * @param no
	 * @param quantity
	 * @throws RemoteException
	 */
	public void addStockBill(int type,String no,int quantity,String time,String operator)throws RemoteException;

	/**
	 * ����ѯ
	 * @param stime
	 * @param etime
	 * @return  ��ţ����ƣ��ͺţ��������������������������������������Ŀǰ��
	 * @throws RemoteException
	 */
	public ArrayList<String> getStock(String stime,String etime)throws RemoteException;
	/**
	 * ����ڼ������
	 * @param stime
	 * @param etime
	 * @return
	 * @throws RemoteException
	 */
	public double getOutMoney(String stime,String etime)throws RemoteException;
	
	/**
	 * ����ڼ��������
	 * @param stime
	 * @param etime
	 * @return
	 * @throws RemoteException
	 */
	public int getOutQuantity(String stime,String etime)throws RemoteException;
	
	/**
	 * ����̵�
	 * @return  ��ţ����ƣ��ͺţ���������������ۣ����Σ����ţ���������
	 * @throws RemoteException
	 */
	public ArrayList<String> getStock2()throws RemoteException;
}
