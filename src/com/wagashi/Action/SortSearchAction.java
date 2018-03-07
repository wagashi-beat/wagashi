package com.wagashi.Action;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.wagashi.DTO.SearchItemInfoDTO;
import com.wagashi.util.SearchComparator;

public class SortSearchAction {
	private static final String SUCCESS = null;
	public Map<String, Object> session;
	private int pageNum;
	private int nowPage;
	private List<SearchItemInfoDTO> pageItemList = new ArrayList<SearchItemInfoDTO>();
	private int page;
	private List<Integer> pageNumList = new ArrayList<Integer>();
	private String searchWord;
	private String[] searchWordList;
	private List<String> reformedSearchWordList = new ArrayList<String>();
	private List<String> normalSearchWordList = new ArrayList<String>();
	private String itemCategory;
	private List<SearchItemInfoDTO> searchResultList = new ArrayList<SearchItemInfoDTO>();

	public String execute(){
		String ret = SUCCESS;

		//検索ワードを整備しリスト化
		char[] c={'\u3000'};
		String wspace=new String(c);

		if(searchWord == null){
			searchWord = "";
		}
		if(itemCategory == null){
			itemCategory = "0";
		}

		String result=searchWord.replaceAll(wspace," ");
		searchWordList = result.split(" ");

		//スペースが連なった状態を解消（たぶん現在は必要ない）
		for(int i=0; i<searchWordList.length; i++){
			if(!(searchWordList[i].equals(" ") || searchWordList[i].equals("　"))){
				reformedSearchWordList.add(searchWordList[i]);
			}
		}

		//検索ワードをノーマライズ
		for(int i=0; i<reformedSearchWordList.size(); i++){
			String normSW = Normalizer.normalize(reformedSearchWordList.get(i).toString(),Normalizer.Form.NFKC );
			normalSearchWordList.add(normSW);
		}

		//全商品取得
		List<SearchItemInfoDTO> searchItemDTOList =(List<SearchItemInfoDTO>)session.get("allItem");

		for(int i=0; i<searchItemDTOList.size(); i++){
			searchItemDTOList.get(i).setSearchFlg("1");
		}

		//検索カテゴリー・ワードを全商品と比較
		if(!(itemCategory.equals("0"))){
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(!(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j))) ||
						!(searchItemDTOList.get(i).getCategoryId().equals(itemCategory))){
						searchItemDTOList.get(i).setSearchFlg("0");
				}
				}
			}
		}else{
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(!(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j)))){
						searchItemDTOList.get(i).setSearchFlg("0");

					}
				}
			}
		}

		//検索該当商品のみ抜き出してリストに入れる
		for(int i=0; i<searchItemDTOList.size(); i++){
			if(searchItemDTOList.get(i).getSearchFlg().toString().equals("1")){
				searchResultList.add(searchItemDTOList.get(i));
			}
		}



		//並び替え
		Collections.sort(searchResultList, new SearchComparator());

		session.put("searchResultList", searchResultList);

		nowPage = 0;
		pageNum = 0;

		page = searchResultList.size() / 9 + 1;
		for(int i=0; i<page; i++){
			pageNumList.add(i + 1);
		}


		if(searchResultList.size() >= (pageNum+1) * 9) {
			for(int i=0; i<9; i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}else if(searchResultList.size() < (pageNum+1) * 9 && searchResultList.size() > 9){
			for(int i=0; i<searchResultList.size()-9; i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}else {
			for(int i=0; i<searchResultList.size(); i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}

		session.put("priceSortFlg", "1");
		session.put("searchItemList", pageItemList);



		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public List<SearchItemInfoDTO> getPageItemList() {
		return pageItemList;
	}

	public void setPageItemList(List<SearchItemInfoDTO> pageItemList) {
		this.pageItemList = pageItemList;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Integer> getPageNumList() {
		return pageNumList;
	}

	public void setPageNumList(List<Integer> pageNumList) {
		this.pageNumList = pageNumList;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}




}
