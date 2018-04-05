package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wagashi.DTO.DestinationDTO;

public class DestinationDTOTest {

	@Test
	public void testGetUserId1() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "null";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId2() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId3() {
	DestinationDTO dto = new DestinationDTO();
	String expected = " ";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId4() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "　";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId5() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "ab12";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId6() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "あｂ１２";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetUserId7() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "ab12あｂ１２";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}


	@Test
	public void testGetUserId8() {
	DestinationDTO dto = new DestinationDTO();
	String expected = "ab12あｂ１２ア漢字";
	dto.setUserId(expected);

	String actual = dto.getUserId();
	assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyName8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}

	@Test
	public void testgetFirstName8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected,actual);

	}
	@Test
	public void testGetFamilyNameKana1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFamilyNameKana8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetFirstNameKana8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected,actual);

	}
	@Test
	public void testGetAddress1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetAddress8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setAddress(expected);
		String actual=dto.getAddress();

		assertEquals(expected,actual);

	}


	@Test
	public void testGetTelNumber1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetTelNumber8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected,actual);

	}


	@Test
	public void testGetEmail1() {
		DestinationDTO dto = new DestinationDTO();
		String expected =null;

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail2() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail3() {
		DestinationDTO dto = new DestinationDTO();
		String expected =" ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail4() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail5() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail6() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="あいう１２３";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail7() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetEmail8() {
		DestinationDTO dto = new DestinationDTO();
		String expected ="abc123あいう１２３アイウ漢字";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected,actual);

	}



}
