package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.ProductInfoDTO;

public class ProductInfoDTOTest {


	@Test
	public void testGetProductId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		assertEquals(expected,dto.getProductId());

	}

	@Test
	public void testGetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);

		assertEquals(expected,dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);

		assertEquals(expected,dto.getProductId());
	}

	@Test
	public void testGetProductId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetProductId5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="null";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="null";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription1() {
			ProductInfoDTO dto= new ProductInfoDTO();
	        String expected=null;

	        dto.setProductDescription(expected);
	        String actual=dto.getProductDescription();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetProductDescription2() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription3() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected=" ";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription4() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="　";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription5() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription6() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="あいう１２３";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription7() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123あいう１２３";

        dto.setProductDescription(expected);
        String actual=dto.getProductDescription();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual=dto.getProductDescription();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetCategoryId1() {
			ProductInfoDTO dto= new ProductInfoDTO();
	        String expected=null;

	        dto.setCategoryId(expected);
	        String actual=dto.getCategoryId();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetCategoryId2() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId3() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected=" ";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId4() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="　";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId5() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId6() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="あいう１２３";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId7() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123あいう１２３";

        dto.setCategoryId(expected);
        String actual=dto.getCategoryId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setCategoryId(expected);
		String actual=dto.getCategoryId();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetImageFilePath1() {
			ProductInfoDTO dto= new ProductInfoDTO();
	        String expected=null;

	        dto.setImageFilePath(expected);
	        String actual=dto.getImageFilePath();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetImageFilePath2() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath3() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected=" ";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath4() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="　";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath5() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath6() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="あいう１２３";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath7() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123あいう１２３";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetImageFileName1() {
			ProductInfoDTO dto= new ProductInfoDTO();
	        String expected=null;

	        dto.setImageFileName(expected);
	        String actual=dto.getImageFileName();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetImageFileName2() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName3() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected=" ";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName4() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="　";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName5() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName6() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="あいう１２３";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName7() {
		ProductInfoDTO dto= new ProductInfoDTO();
        String expected="abc123あいう１２３";

        dto.setImageFileName(expected);
        String actual=dto.getImageFileName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetPrice1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());

	}

	@Test
	public void testGetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);

		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);

		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPrice4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetPrice5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	private void assertThat(String message, String string) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
