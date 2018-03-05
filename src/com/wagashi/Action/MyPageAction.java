package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.MyPageDAO;
import com.wagashi.DTO.MyPageDTO;


public class MyPageAction extends ActionSupport implements SessionAware {

	//session

	private Map<String,Object> session;

	//ユーザー情報リスト

	private ArrayList<MyPageDTO> myPageDTOList = new ArrayList<MyPageDTO>();

	public String execute() throws SQLException {

		String result = ERROR;

		MyPageDAO myPageDAO = new MyPageDAO();

		if(session.containsKey("user_id")){

		myPageDTOList=myPageDAO.getUserInfo(session.get("user_id").toString());

		result=SUCCESS;

		}

		return result;
	}

	//宛先、商品履歴機能を追加後に機能追加。

	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public ArrayList<MyPageDTO> getMyPageDTOList() {
		return myPageDTOList;
	}

	public void setMyPageDTOList(ArrayList<MyPageDTO> myPageDTOList) {
		this.myPageDTOList = myPageDTOList;
	}

}
