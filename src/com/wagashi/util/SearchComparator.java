package com.wagashi.util;

import java.util.Comparator;

import com.wagashi.DTO.SearchItemInfoDTO;

public class SearchComparator implements Comparator<SearchItemInfoDTO>{
             //検索ソート

	public int compare(SearchItemInfoDTO a, SearchItemInfoDTO b){
		int no1 = a.getPrice();
		int no2 = b.getPrice();

		if(no1 > no2){
			return 0;
		}else{
			return -1;
		}
	}

}
