package com.wagashi.Action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.SettlementDAO;


public class SettlementCompleateAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private SettlementDAO settlementDAO= new SettlementDAO();

	public String execute() throws SQLException {
		String ret= ERROR;

		if (session.containsKey("user_id")){
			// PurchaseHistoryに決済した商品情報を渡す
			settlementDAO.settlementComp(session.get("user_id").toString());

			// cart情報削除
			settlementDAO.cartDelete(session.get("user_id").toString());

			ret= SUCCESS;
			return ret;
			}

			return ret;
		}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public SettlementDAO getSettlementDAO() {
		return settlementDAO;
	}

	public void setSettlementDAO(SettlementDAO settlementDAO) {
		this.settlementDAO = settlementDAO;
	}



}
