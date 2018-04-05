package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.SearchItemInfoDTO;

public class SearchItemInfoDTOTest {

	@Test
	public void testGetId() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2(){
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}



	@Test
	public void testGetProductId() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
}

	@Test
	public void testGetProductId2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
}

	@Test
	public void testGetProductName2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProducName8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
}

	@Test
	public void testGetProductNameKana2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProducNameKana8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}


	@Test
	public void testGetProductDescription() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
}

	@Test
	public void testGetProductDescription2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProducDescription8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}


	@Test
	public void testGetSearchWords() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
}

	@Test
	public void testGetSearchWords2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSearchWords8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setSearchWords(expected);
		String actual = dto.getSearchWords();

		assertEquals(expected, actual);
	}


	@Test
	public void testGetCategoryId() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = null;

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
}

	@Test
	public void testGetCategoryId2() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = " ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId4() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId5() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId6() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId7() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId8() {
		SearchItemInfoDTO dto = new SearchItemInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected, actual);
	}
}