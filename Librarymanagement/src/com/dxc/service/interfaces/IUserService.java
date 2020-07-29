package com.dxc.service.interfaces;

import java.util.List;
import com.dxc.pojo.BookPojo;

public interface IUserService {

	boolean PasswordCheck(String name, String password);

	public List<BookPojo> getBookList();

	public List<BookPojo> getBookListOfParticularAuther(String autherName);

	public void issueBook(int uId, int bId, int day,double balance);

	public double getBalance(int userId);

	public void closeConnection();

	public int getUserId(String name);

	void returnBook(int uId, int bId);

	List<BookPojo> getIssuedBook(int uId);

}
