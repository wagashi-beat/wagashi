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
	public void testGetProductId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductDescription() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetCategoryId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetPriceStr() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFileName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetStatus() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetSearchFlg() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetDescriptionAll() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetSearchWords() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetAvgvalue() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetCountvalue() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductCountSum() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetRank() {
		fail("まだ実装されていません");
	}

}
