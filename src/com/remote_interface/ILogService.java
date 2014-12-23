package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Log;

public interface ILogService extends Remote{
	
	/**
	 * 查找日志   所有时间string 格式 yyyy-MM-dd
	 * @param startTime
	 * @param endTime
	 * @param type  
	 * @return 不存在返回 空array
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String startTime,String endTime,String type)throws RemoteException;
	/**
	 * 查找日志 
	 * @param type
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String type)throws RemoteException;
	/**
	 * 查找日志  
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog(String startTime,String endTime)throws RemoteException;
	/**
	 * 所有
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Log> queryLog() throws RemoteException;

}
