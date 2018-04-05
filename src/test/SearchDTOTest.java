package test;

import org.junit.Test;

import com.wagashi.DTO.SearchDTO;

public class SearchDTOTest {

	@Test
	public void testGetId() {
		SearchDTO dto = new SearchDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		SearchDTO dto = new SearchDTO();
		int expected = 2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		SearchDTO dto = new SearchDTO();
		int expected = -2147483647;

		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetId5() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("2147483648");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetProductId() {
		SearchDTO dto = new SearchDTO();
		int expected = 0;

		dto.setProductId(expected);
		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2() {
		SearchDTO dto = new SearchDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		SearchDTO dto = new SearchDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId4() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProductId5() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("2147483648");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}



	@Test
	public void testGetProductNameKana() {
		SearchDTO dto = new SearchDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana2() {
		SearchDTO dto = new SearchDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana3() {
		SearchDTO dto = new SearchDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana4() {
		SearchDTO dto = new SearchDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana5() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana6() {
		SearchDTO dto = new SearchDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana7() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductNameKana8() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName() {
		SearchDTO dto = new SearchDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName2() {
		SearchDTO dto = new SearchDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName3() {
		SearchDTO dto = new SearchDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName4() {
		SearchDTO dto = new SearchDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName5() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName6() {
		SearchDTO dto = new SearchDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName7() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductName8() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}


	@Test
	public void testGetProductDescription() {
		SearchDTO dto = new SearchDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription2() {
		SearchDTO dto = new SearchDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription3() {
		SearchDTO dto = new SearchDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription4() {
		SearchDTO dto = new SearchDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription5() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription6() {
		SearchDTO dto = new SearchDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription7() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}

	@Test
	public void testGetProductDescription8() {
		SearchDTO dto = new SearchDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
		}


	@Test
	public void testGetCategoryId() {
		SearchDTO dto = new SearchDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId2() {
		SearchDTO dto = new SearchDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId3() {
		SearchDTO dto = new SearchDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId4() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetPrice() {
		SearchDTO dto = new SearchDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		SearchDTO dto = new SearchDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		SearchDTO dto = new SearchDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPrice5() {
		SearchDTO dto = new SearchDTO();
		try {
			int postalMin = Integer.parseInt("2147483648");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}



	private void assertThat(String message, String string) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
