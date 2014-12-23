package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ImportBill;
import com.model.PortBillItem;

public interface IImportService extends Remote{
	/**
	 * 根据编号查找商品
	 * @param no
	 * @return 不存在 null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	/**
	 * 进货单   自动生成no   成功dialog
	 * @param customerNo
	 * @param warehouse
	 * @param operator
	 * @param info  = no+" "+c.getName()+" "+c.getStyle()+" 数量: "+quantity+" 单价: "+c.getInPrice()+" 总价: "+quantity*c.getInPrice()+";";
	 * @param total
	 * @param desc
	 * @throws RemoteException
	 */
	public void addImportBill(String customerNo,String warehouse,String operator,String info,double total,String desc,String time)throws RemoteException;
	/**
	 * 根据编号获得bill
	 * @param no
	 * @return 不存在null
	 * @throws RemoteException
	 */
	public ImportBill getImportBill(String no)throws RemoteException;
	/**
	 * 获得此单的商品项
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem> getBillItem(String no)throws RemoteException;
	/**
	 * 进货退货单  自动生成no 成功dialog
	 * @param no  进货单的no
	 * @param operator
	 * @param desc
	 */
	public void addImportBackBill(String no,String operator,String desc,String time)throws RemoteException;
}
