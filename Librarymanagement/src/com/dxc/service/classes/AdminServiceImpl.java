
package com.dxc.service.classes;

import java.util.List;

import com.dxc.dao.classes.*;
import com.dxc.dao.interfaces.IAdminDao;
import com.dxc.pojo.BookPojo;
import com.dxc.pojo.UserPojo;
import com.dxc.service.interfaces.*;

public class AdminServiceImpl implements IAdminService {
	
	IAdminDao aDao=new AdminDaoImpl();
	
	@Override
	public boolean passwordCheck(String name,String password) {
		return aDao.passwordCheck(name,password);
	}

	@Override
	public void addUser(int id, String name, String password, double balance) {
		aDao.addUser(id,name,password,balance);
	}

	@Override
	public void addBook(int id, String bName, String auther, int qnt) {
		aDao.addBook(id,bName,auther,qnt);
	}

	@Override
	public List<BookPojo> getUserBookList(int id) {
	
		return aDao.getUserBookList(id);
	}

	@Override
	public double getUserBalance(int id) {
		return aDao.getUserBalance(id);
	}

	@Override
	public List<BookPojo> getTotalBookList() {
		return aDao.getTotalBookList();
	}

	@Override
	public void closeConnection() {
		aDao.closeConnection();
	}

	@Override
	public void deleteUser(int id) {
		aDao.deleteUser(id);
	}

	@Override
	public List<UserPojo> getUserList() {
		return aDao.getUserList();
	}

}
