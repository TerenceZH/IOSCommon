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
	 * ���ݱ�Ų�����Ʒ
	 * @param no
	 * @return ������ null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	/**
	 * ���۵�   �Զ�����no   �ɹ�dialog
	 * @param customerNo
	 * @param warehouse
	 * @param operator
	 * @param info  = no+" "+c.getName()+" "+c.getStyle()+" ����: "+quantity+" ����: "+c.getInPrice()+" �ܼ�: "+quantity*c.getInPrice()+";";
	 * @param total
	 * @param desc
	 * @throws RemoteException
	 */
	public void addExportBill(String customerNo,String warehouse,String operator,String info,double total,
			double discount,double djq,double total2,String desc,String time)throws RemoteException;
	/**
	 * ���ݱ�Ż��bill
	 * @param no
	 * @return ������null
	 * @throws RemoteException
	 */
	public ExportBill getExportBill(String no)throws RemoteException;
	/**
	 * ��ô˵�����Ʒ��
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem> getBillItem(String no)throws RemoteException;
	/**
	 * �����˻���  �Զ�����no �ɹ�dialog
	 * @param no  ���۵���no
	 * @param operator
	 * @param desc
	 */
	public void addExportBackBill(String no,String operator,String desc,String time)throws RemoteException;
	/**
	 * ����ۿ�
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDiscount(String no)throws RemoteException;

}
