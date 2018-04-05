package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.LoginDTO;

public class LoginDTOTest {

	@Test
	public void testGetloginId1() {
		LoginDTO dto = new LoginDTO();
		String expected =null;

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId2() {
		LoginDTO dto = new LoginDTO();
		String expected ="";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId3() {
		LoginDTO dto = new LoginDTO();
		String expected =" ";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId4() {
		LoginDTO dto = new LoginDTO();
		String expected ="　";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId5() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId6() {
		LoginDTO dto = new LoginDTO();
		String expected ="あいう１２３";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId7() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123あいう１２３";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetloginId8() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword1() {
		LoginDTO dto = new LoginDTO();
		String expected =null;

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword2() {
		LoginDTO dto = new LoginDTO();
		String expected ="";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword3() {
		LoginDTO dto = new LoginDTO();
		String expected =" ";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword4() {
		LoginDTO dto = new LoginDTO();
		String expected ="　";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword5() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword6() {
		LoginDTO dto = new LoginDTO();
		String expected ="あいう１２３";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword7() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123あいう１２３";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginPassword8() {
		LoginDTO dto = new LoginDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setLoginPassword(expected);
		String actual=dto.getLoginPassword();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginFlg1() {
		LoginDTO dto =new LoginDTO();
		boolean expected =true;
		dto.setLoginFlg(expected);

		boolean actual = dto.getLoginFlg();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetLoginFlg2() {
		LoginDTO dto = new LoginDTO();
		boolean expected = false;
		dto.setLoginFlg(expected);

		boolean actual = dto.getLoginFlg();

		assertEquals(expected,actual);

	}




}
