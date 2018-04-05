package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.MyPageDTO;


public class MyPageDTOTest {

	@Test
	public void testGetUserId1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setUserId(expected);
		String actual=dto.getUserId();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetSex8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setSex(expected);
		String actual=dto.getSex();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}



	@Test
	public void testGetAddress1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber1() {
		MyPageDTO dto = new MyPageDTO();
		String expected =null;

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber2() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber3() {
		MyPageDTO dto = new MyPageDTO();
		String expected =" ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber4() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="　";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber5() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber6() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="あいう１２３";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber7() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber8() {
		MyPageDTO dto = new MyPageDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}


}
