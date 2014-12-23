package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IBillService extends Remote{
	/**
	 * ���
	 * @param no
	 * @throws RemoteException
	 */
	public void modBillState(String no)throws RemoteException;
	/**s
	 * ��ȡ���д���˵ĵ���   ��ʽ����id$time$from$sdesc��   desc��ʽ��type@���������
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<String> queryBillToConfirm()throws RemoteException;
	/**
	 * ��Ӫ�����
	 * @param stime
	 * @param etime
	 * @return 3��Ԫ�ض�Ӧ���룬֧�������󣬣���ÿ��Ԫ�ظ�ʽ�� ����$��Ʒ��$��ע ��û�б�ע��Ϊ���ޡ���
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleAccount(String stime,String etime)throws RemoteException;
	/**
	 * ������ϸ��
	 * @param stime
	 * @param etime
	 * @param comno
	 * @param cusno
	 * @param bus
	 * @param ware
	 * @return �����ڿ�array ����ÿ��Ԫ�ظ�ʽ����Ʒ���$��Ʒ��$��Ʒ�ͺ�$����$����$�ܶ�$ʱ��
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleDetail(String stime, String etime, String comno,
	String cusno, String bus, String ware)throws RemoteException;
	/**
	 * ��Ӫ��̱�
	 * @param stime
	 * @param etime
	 * @param type  0����
	 * @param cusno
	 * @param bus
	 * @param ware
	 * @return   ��ʽ�����$����$����
	 * @throws RemoteException
	 */
	public ArrayList<String> getSaleLicheng(String stime, String etime, int type,
			String cusno, String bus, String ware)throws RemoteException;
}
