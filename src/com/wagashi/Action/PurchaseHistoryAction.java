package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.PurchaseHistoryDAO;
import com.wagashi.DTO.PurchaseHistoryDTO;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
	//処理結果を格納
	private String result;
	//ログイン情報を格納
	public Map<String, Object> session;
	//デリートフラグ
	private String deleteFlg = "";
	//削除後のメッセージ
	private String message;
	//チェックボックスの判定に使用
    private Collection<String> checkList;
    private String imageFilePath;

	public ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();
	PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

	public String execute() throws SQLException {
		if (!(session.containsKey("user_id"))){
			return "ERROR";
		}
		if(deleteFlg != null && checkList != null){

			purchaseHistoryDTOList = purchaseHistoryDAO.getPurchaseHistory(session.get("user_id").toString());
			System.out.println(imageFilePath);

			//購入履歴情報リストをまわす
	        	for(int i=0;i<purchaseHistoryDTOList.size();i++){
	        		//チェック済の数だけ削除をまわす
	        		for (String check : checkList) {
	        			long id = Long.parseLong(check);
	        			historyDelete((int)id);
	        	        }
	        	}
		}
		//削除後に改めて購入履歴情報を読み込む
		purchaseHistoryDTOList = purchaseHistoryDAO.getPurchaseHistory(session.get("user_id").toString());

			//情報がなければnullにする
			Iterator<PurchaseHistoryDTO> iterator=purchaseHistoryDTOList.iterator();
			if(!(iterator.hasNext())){
				purchaseHistoryDTOList=null;
			}

		result=SUCCESS;
		return result;
	}

	//履歴を削除するメソッド
    public void historyDelete(int id) throws SQLException{
    	purchaseHistoryDAO.purchaseHistoryDelete(session.get("user_id").toString(),id);
    }


	public ArrayList<PurchaseHistoryDTO> getPurchaseHistoryInfoDTO() {
		return purchaseHistoryDTOList;
	}
	public void setPurchaseHistoryInfoDTO(ArrayList<PurchaseHistoryDTO> purchaseHistoryDTO) {
		this.purchaseHistoryDTOList = purchaseHistoryDTO;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}
	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistoryDTOList() {
		return purchaseHistoryDTOList;
	}

	public void setPurchaseHistoryDTOList(ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList) {
		this.purchaseHistoryDTOList = purchaseHistoryDTOList;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}



}