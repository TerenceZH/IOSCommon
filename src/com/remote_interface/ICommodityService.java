package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
	
	/**
	 * 根据父节点查找类别
	 * @param no
	 * @return  不存在返回空array
	 * @throws RemoteException
	 */
	public ArrayList<CommodityCategory> queryCategoryByParentNo(String no)throws RemoteException;
	/**
	 * 添加分类  自动生成编号  分类下有商品不能再添加子分类  添加成功dialog
	 * @param name  不能重复   若存在dialog
	 * @param parentNo 
	 * @throws RemoteException
	 */
	public void addCommodityCategory(String name,String parentNo,String operator)throws RemoteException;
	/**
	 * 根据编号获得分类
	 * @param no 
	 * @return 不存在返回null
	 * @throws RemoteException
	 */
	public CommodityCategory getCategory(String no)throws RemoteException;
	/**
	 * 修改分类  成功dialog
	 * @param name  是否存在  若存在dialog 
	 * @param no
	 * @return  
	 * @throws RemoteException
	 */
	public void modCommodityCategory(String name,String no,String operator)throws RemoteException;
	/**
	 * 删除分类  分类下有子分类或者商品不能删除
	 * @param no
	 * @return 不能删除dialog  删除成功dialog
	 * @throws RemoteException
	 */
	public void delCommdoityCategory(String no,String operator)throws RemoteException;
	/**
	 * 获取所有可以添加商品分类，该分类下木有子分类
	 * arraylist中存的是分类名称
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<String> getAllCommodityCategories()throws RemoteException;
	/**
	 * 添加商品，编号自动生成 其他默认0   成功dialog
	 * @param name
	 * @param style
	 * @param type  分类的名称，先找到编号、、、
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void addCommodity(String name,String style,String type,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * 根据编号来查询  是否存在 
	 * @param no
	 * @return 不存在null
	 * @throws RemoteException
	 */
	public Commodity queryCommodity(String no)throws RemoteException;
	/**
	 * 关键字模糊查询  涉及到name或者style   
	 * @param keyword
	 * @return  不存在空array
	 * @throws RemoteException
	 */
	public ArrayList<Commodity> queryCommodityByKeyword(String keyword)throws RemoteException;
	/**
	 * 查找所有的商品
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<Commodity> queryAllCommodity()throws RemoteException;
	/**
	 * 可以手动修改的值  成功dialog
	 * @param no 是否存在  不存在dialog
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void modCommodity(String no,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * 删除商品，是否存在   成功dialog
	 * @param no  不存在dialog
	 * @param operator
	 * @throws RemoteException
	 */
	public void delCommodity(String no,String operator)throws RemoteException;
	/**
	 * 添加库存XX单    成功dialog 
	 * @param type
	 * @param no
	 * @param quantity
	 * @throws RemoteException
	 */
	public void addStockBill(int type,String no,int quantity,String time,String operator)throws RemoteException;

	/**
	 * 库存查询
	 * @param stime
	 * @param etime
	 * @return  编号，名称，型号，出库数量，出库金额，入库数量，入库金额，库存数量（目前）
	 * @throws RemoteException
	 */
	public ArrayList<String> getStock(String stime,String etime)throws RemoteException;
	/**
	 * 获得期间出库金额
	 * @param stime
	 * @param etime
	 * @return
	 * @throws RemoteException
	 */
	public double getOutMoney(String stime,String etime)throws RemoteException;
	
	/**
	 * 获得期间出库数量
	 * @param stime
	 * @param etime
	 * @return
	 * @throws RemoteException
	 */
	public int getOutQuantity(String stime,String etime)throws RemoteException;
	
	/**
	 * 库存盘点
	 * @return  编号，名称，型号，库存数量，库存均价，批次，批号，出厂日期
	 * @throws RemoteException
	 */
	public ArrayList<String> getStock2()throws RemoteException;
}
