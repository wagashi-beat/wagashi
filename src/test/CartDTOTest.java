package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.CartDTO;

public class CartDTOTest {

	@Test
	public void testGetUserId1() {
			CartDTO dto= new CartDTO();
	        String expected=null;

	        dto.setUserId(expected);
	        String actual=dto.getUserId();

	        assertEquals(expected,actual);
		}

	@Test
	public void testGetUserId2() {
		CartDTO dto= new CartDTO();
        String expected="";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId3() {
		CartDTO dto= new CartDTO();
        String expected=" ";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId4() {
		CartDTO dto= new CartDTO();
        String expected="　";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId5() {
		CartDTO dto= new CartDTO();
        String expected="abc123";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId6() {
		CartDTO dto= new CartDTO();
        String expected="あいう１２３";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId7() {
		CartDTO dto= new CartDTO();
        String expected="abc123あいう１２３";

        dto.setUserId(expected);
        String actual=dto.getUserId();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId8() {
		CartDTO dto = new CartDTO();
		String expected="abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);


	}



	@Test
	public void testGetTempUserId1() {
		CartDTO dto = new CartDTO();
		String expected="null";

		dto.setTempUserId(expected);
		String actual=dto.getTempUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTempUserId2() {
		CartDTO dto = new CartDTO();
		String expected ="";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId3() {
		CartDTO dto = new CartDTO();
		String expected =" ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId4() {
		CartDTO dto = new CartDTO();
		String expected ="　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId5() {
		CartDTO dto = new CartDTO();
		String expected ="abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId6() {
		CartDTO dto = new CartDTO();
		String expected ="あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId7() {
		CartDTO dto = new CartDTO();
		String expected ="abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTempUserId8() {
		CartDTO dto = new CartDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected,actual);
	}



	@Test
	public void testGetProductId1(){
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductId(expected);
		assertEquals(expected,dto.getProductId());

	}

	@Test
	public void testGetProductId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductId(expected);

		assertEquals(expected,dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setProductId(expected);

		assertEquals(expected,dto.getProductId());
	}

	@Test
	public void testGetProductId4() {
		CartDTO dto = new CartDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetProductId5(){
		CartDTO dto = new CartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	@Test
	public void testGetProductCount1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductId(expected);

		assertEquals(expected,dto.getProductCount());

	}

	@Test
	public void testGetProductCount2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		assertEquals(expected,dto.getProductCount());

	}

	@Test
	public void testGetProductCount3() {
		CartDTO dto = new CartDTO();

		int expected =-2147483647;
		dto.setProductCount(expected);
		assertEquals(expected,dto.getProductCount());

	}

	@Test
	public void testGetProductCount4() {
		CartDTO dto = new CartDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetProductCount5() {
		CartDTO dto = new CartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	@Test
	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());

	}

	@Test
	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}




	private void assertThat(String message, String string) {
		assertEquals(message,string);

	}



}


