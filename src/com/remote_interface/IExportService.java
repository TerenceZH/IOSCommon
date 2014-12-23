package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ExportBill;
import com.model.ImportBill;
import com.model.PortBillItem;

public interface IExportService extends Remote{
	
	/**
	 * 根据编号查找商品
	 * @param no
	 * @return 不存在 null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	/**
	 * 销售单   自动生成no   成功dialog
	 * @param customerNo
	 * @param warehouse
	 * @param operator
	 * @param list  
	 * @param total
	 * @param desc
	 * @throws RemoteException
	 */
	public void addExportBill(String customerNo,String warehouse,String operator,ArrayList<String>list,double total,
			double discount,double djq,double total2,String desc,String time)throws RemoteException;
	/**
	 * 根据编号获得bill
	 * @param no
	 * @return 不存在null
	 * @throws RemoteException
	 */
	public ExportBill getExportBill(String no)throws RemoteException;
	/**
	 * 获得此单的商品项
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem> getBillItem(String no)throws RemoteException;
	/**
	 * 销售退货单  自动生成no 成功dialog
	 * @param no  销售单的no
	 * @param operator
	 * @param desc
	 */
	public void addExportBackBill(String no,String operator,String desc,String time)throws RemoteException;
	/**
	 * 获得折扣
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDiscount(String no)throws RemoteException;

}
