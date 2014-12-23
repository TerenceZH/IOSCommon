package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ImportBill;
import com.model.PortBillItem;

public interface IImportService extends Remote{
	/**
	 * ���ݱ�Ų�����Ʒ
	 * @param no
	 * @return ������ null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	/**
	 * ������   �Զ�����no   �ɹ�dialog
	 * @param customerNo
	 * @param warehouse
	 * @param operator
	 * @param list  geshi :no+","+quantity+","+inprice+","+total
	 * @param total
	 * @param desc
	 * @throws RemoteException
	 */
	public void addImportBill(String customerNo,String warehouse,String operator,ArrayList<String> list,double total,String desc,String time)throws RemoteException;
	/**
	 * ���ݱ�Ż��bill
	 * @param no
	 * @return ������null
	 * @throws RemoteException
	 */
	public ImportBill getImportBill(String no)throws RemoteException;
	/**
	 * ��ô˵�����Ʒ��
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem> getBillItem(String no)throws RemoteException;
	/**
	 * �����˻���  �Զ�����no �ɹ�dialog
	 * @param no  ��������no
	 * @param operator
	 * @param desc
	 */
	public void addImportBackBill(String no,String operator,String desc,String time)throws RemoteException;
}
