package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Log;

public interface ILogService extends Remote{
	
	/**
	 * ������־   ����ʱ��string ��ʽ yyyy-MM-dd
	 * @param startTime
	 * @param endTime
	 * @param type  
	 * @return �����ڷ��� ��array
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String startTime,String endTime,String type)throws RemoteException;
	/**
	 * ������־ 
	 * @param type
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String type)throws RemoteException;
	/**
	 * ������־  
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String startTime,String endTime)throws RemoteException;
	/**
	 * ����
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog() throws RemoteException;

}
