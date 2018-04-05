package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.CategoryDTO;

public class CategoryDTOTest {

	@Test
	public void testGetId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected =null;

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected =" ";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="　";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="あいう１２３";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123あいう１２３";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected,actual);

	}


	@Test
	public void testGetCategoryId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="null";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected =" ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123あいう１２３";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId8() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetCategoryName1() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName2() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName3() {
		CategoryDTO dto =new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName4() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName5() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName6() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName7() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetCategoryName8() {
		CategoryDTO dto =new CategoryDTO();
		String expected = "abc123あいう１２３アイウ漢字";

		dto.setCategoryName(expected);
		String actual =dto.getCategoryName();

		assertEquals(expected,actual);

	}


	@Test
	public void testGetCategoryDescription1() {
		CategoryDTO dto = new CategoryDTO();
		String expected ="null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();

		assertEquals(expected,actual);


	}
	@Test
	public void testGetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaaaaa1100";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ああアア１２３";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}
	@Test
	public void testGetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ab12あｂ１２アア";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetCategoryDescription8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ab12あｂ１２アア漢字";

		dto.setCategoryDescription(expected);
		assertThat(expected,(dto.getCategoryDescription()));

	}

	@Test
	public void testGetInsertDate() {
		CategoryDTO dto = new CategoryDTO();
		String expected= "null";
		dto.setInsertDate(expected);

		assertThat(expected,is(dto.getInsertDate()));

	}

	@Test
	public void testGetUpdateDate() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";
		dto.setUpdateDate(expected);

		String actual=dto.getUpdateDate();
		assertEquals(expected,actual);

	}


	private void assertThat(String expected, String string) {
		// TODO 自動生成されたメソッド・スタブ

	}

	private String is(String insertDate) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}




}
