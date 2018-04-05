package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.ProductDTO;
import com.wagashi.DTO.PurchaseHistoryDTO;

public class PurchaseHistoryDTOTest {


	@Test
	public void testGetProductName1() {
			PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
	        String expected=null;

	        dto.setProductName(expected);
	        String actual=dto.getProductName();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetProductName2() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName3() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected=" ";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName4() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="　";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName5() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName6() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="あいう１２３";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName7() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123あいう１２３";

        dto.setProductName(expected);
        String actual=dto.getProductName();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetProductNameKana1() {
			PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
	        String expected=null;

	        dto.setProductNameKana(expected);
	        String actual=dto.getProductNameKana();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana3() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected=" ";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana4() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="　";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana5() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana6() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="あいう１２３";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana7() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123あいう１２３";

        dto.setProductNameKana(expected);
        String actual=dto.getProductNameKana();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected,actual);


	}

	@Test
	public void testGetImageFIlePath1() {
			PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
	        String expected=null;

	        dto.setImageFilePath(expected);
	        String actual=dto.getImageFilePath();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetImageFIlePath2() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFIlePath3() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected=" ";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFIlePath4() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="　";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFIlePath5() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFIlePath6() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="あいう１２３";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFIlePath7() {
		PurchaseHistoryDTO dto= new PurchaseHistoryDTO();
        String expected="abc123あいう１２３";

        dto.setImageFilePath(expected);
        String actual=dto.getImageFilePath();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFIlePath8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected,actual);


	}



	@Test
	public void testGetProductCont1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);
		assertEquals(expected,dto.getProductCount());

	}

	@Test
	public void testGetProductCont2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);

		assertEquals(expected,dto.getProductCount());
	}

	@Test
	public void testGetProductCont3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);

		assertEquals(expected,dto.getProductCount());
	}

	@Test
	public void testGetProductCont4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetProductCont5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetId1(){
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setId(expected);
		assertEquals(expected,dto.getId());

	}

	@Test
	public void testGetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setId(expected);

		assertEquals(expected,dto.getId());
	}

	@Test
	public void testGetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setId(expected);

		assertEquals(expected,dto.getId());
	}

	@Test
	public void testGetId4() {
		ProductDTO dto = new ProductDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetId5(){
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	private void assertThat(String message, String string) {
		// TODO 自動生成されたメソッド・スタブ

	}



}
