package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IBillService extends Remote{
	/**
	 * 审核
	 * @param no
	 * @throws RemoteException
	 */
	public void modBillState(String no,String operator)throws RemoteException;
	/**s
	 * 获取所有待审核的单子   格式：【id$time$from$sdesc】   desc格式【type@大概描述】
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<String> queryBillToConfirm()throws RemoteException;
	/**
	 * 经营情况表
	 * @param stime
	 * @param etime
	 * @return 3个元素对应收入，支出，利润，，，每个元素格式： 销售$商品类$备注 （没有备注则为“无”）
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleAccount(String stime,String etime)throws RemoteException;
	/**
	 * 销售明细表
	 * @param stime
	 * @param etime
	 * @param comno
	 * @param cusno
	 * @param bus
	 * @param ware
	 * @return 不存在空array 否则每个元素格式：商品编号$商品名$商品型号$数量$单价$总额$时间
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleDetail(String stime, String etime, String comno,
	String cusno, String bus, String ware)throws RemoteException;
	/**
	 * 经营里程表
	 * @param stime
	 * @param etime
	 * @param type  0进货1进货退货2销售3销售退货
	 * @param cusno
	 * @param bus
	 * @param ware
	 * @return   格式：编号$类型（string）$内容
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleLicheng(String stime, String etime, int type,
			String cusno, String bus, String ware)throws RemoteException;
	/**
	 * 红冲一个单子 dialog
	 * @param no
	 * @throws RemoteException
	 */
	public void hongchongBill(String no,String operator)throws RemoteException;
	
	
}
