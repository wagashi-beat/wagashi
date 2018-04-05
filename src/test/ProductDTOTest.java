package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.wagashi.DTO.ProductDTO;

public class ProductDTOTest {


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


	@Test
	public void testGetProduct_Id1(){
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());

	}

	@Test
	public void testGetProduct_Id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setProduct_id(expected);

		assertEquals(expected,dto.getProduct_id());
	}

	@Test
	public void testGetProduct_Id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setProduct_id(expected);

		assertEquals(expected,dto.getProduct_id());
	}

	@Test
	public void testGetProduct_Id4() {
		ProductDTO dto = new ProductDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setProduct_id(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetProduct_Id5(){
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProduct_id(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetCategory_Id1(){
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());

	}

	@Test
	public void testGetCategory_Id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);

		assertEquals(expected,dto.getCategory_id());
	}

	@Test
	public void testGetCategory_Id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);

		assertEquals(expected,dto.getCategory_id());
	}

	@Test
	public void testGetCategory_Id4() {
		ProductDTO dto = new ProductDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setCategory_id(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetCategory_Id5(){
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategory_id(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	@Test
	public void testGetPriceId1(){
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected,dto.getCategory_id());

	}

	@Test
	public void testGetPriceId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setPrice(expected);

		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPriceId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setPrice(expected);

		assertEquals(expected,dto.getPrice());
	}

	@Test
	public void testGetPriceId4() {
		ProductDTO dto = new ProductDTO();
		try {
				int postalMin = Integer.parseInt("-2147483649");
				dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetPriceId5(){
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetproduct_name1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setProduct_name(expected);
		String actual=dto.getProduct_name();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetproduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetproduct_name8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setProduct_name_kana(expected);
		String actual=dto.getProduct_name_kana();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_name_kana8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetProduct_description1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setProduct_description(expected);
		String actual=dto.getProduct_description();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProduct_description8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setImage_file_name(expected);
		String actual=dto.getImage_file_name();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetImage_file_path2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setImage_file_name(expected);
		String actual=dto.getImage_file_name();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_name8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setRelease_date(expected);
		String actual=dto.getRelease_date();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setRelease_company(expected);
		String actual=dto.getRelease_company();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_company8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetRegist_date1() {
		ProductDTO dto = new ProductDTO();
		Date expected=null;

		dto.setRegist_date(expected);
		Date actual=dto.getRegist_date();

		assertEquals(expected,actual);

	}

	@Test
	public void testGetUpdate_date1() {
		ProductDTO dto = new ProductDTO();
		Date expected=null;

		dto.setUpdate_date(expected);
		Date actual=dto.getUpdate_date();

		assertEquals(expected,actual);

	}






	private void assertThat(String message, String string) {
		// TODO 自動生成されたメソッド・スタブ

	}








}