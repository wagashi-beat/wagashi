package com.wagashi.Action;

import java.util.List;

import com.wagashi.DTO.SearchItemInfoDTO;

public class GetSearchWordAction {

	public List<SearchItemInfoDTO> getSearchWord(List<SearchItemInfoDTO> dtoList){

		for(int i=0; i<dtoList.size(); i++){
			String searchWords = dtoList.get(i).getProductName() + dtoList.get(i).getReleaseCompany() + dtoList.get(i).getProductDescription();
			dtoList.get(i).setSearchWords(searchWords);
		}

		return dtoList;
	}
}
