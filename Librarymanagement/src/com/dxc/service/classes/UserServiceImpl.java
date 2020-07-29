package com.dxc.service.classes;

import java.util.List;

import com.dxc.dao.classes.UserDaoImpl;
import com.dxc.dao.interfaces.IUserDao;
import com.dxc.pojo.BookPojo;
import com.dxc.service.interfaces.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao dao=new UserDaoImpl();
	@Override
	public boolean PasswordCheck(String name, String password) {
		return dao.passwordCheck(name,password);
	}
	@Override
	public List<BookPojo> getBookList() {
		return dao.getBookList();
	}
	@Override
	public List<BookPojo> getBookListOfParticularAuther(String autherName) {
		return dao.getBookListOfParticularAuther(autherName);
	}
	@Override
	public void issueBook(int uId, int bId, int day,double balance) {

		dao.issueBook(uId,bId,day,balance);
	}
	@Override
	public double getBalance(int userId) {
		return dao.getBalance(userId);
	}
	@Override
	public void closeConnection() {
		dao.closeConnection();
	}
	@Override
	public int getUserId(String name) {
		return dao.getUserId(name);
	}
	@Override
	public void returnBook(int uId, int bId) {
		dao.returnBook(uId,bId);
	}
	@Override
	public List<BookPojo> getIssuedBook(int uId) {
		return dao.getIssuedBook(uId);
	}
}

