/**
 * ������ʽ���������
 */
public class RegexUtilsTest {
	
	/**
	 * ��֤����
	 */
	@Test
	public void testCheckEmail() {
		boolean result = RegexUtils.checkEmail("zha2_ngsan@sina.com.cn");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤���֤����
	 */
	@Test
	public void testCheckIdCard() {
		boolean result = RegexUtils.checkIdCard("432403193902273273");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤�ֻ�����
	 */
	@Test
	public void testCheckMobile() {
		boolean result = RegexUtils.checkMobile("+8613620285733");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤�绰����
	 */
	@Test
	public void testCheckPhone() {
		boolean result = RegexUtils.checkPhone("+860738-4630706");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤�������������͸�������
	 */
	@Test
	public void testCheckDigit() {
		boolean result = RegexUtils.checkDigit("123132");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤С������������������������С����
	 */
	@Test
	public void testCheckDecimals() {
		boolean result = RegexUtils.checkDecimals("-33.2");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤�հ��ַ�
	 */
	@Test
	public void testCheckBlankSpace() {
		boolean result = RegexUtils.checkBlankSpace("   		");
		Assert.assertTrue(result);
	}
	
	/**
	 * ƥ������
	 */
	@Test
	public void testCheckChinese() {
		boolean result = RegexUtils.checkChinese("����");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤����
	 */
	@Test
	public void testCheckBirthday() {
		boolean result = RegexUtils.checkBirthday("1992/09/03");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤�й���������
	 */
	@Test
	public void testCheckPostcode() {
		boolean result = RegexUtils.checkPostcode("417100");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤URL��ַ
	 */
	@Test
	public  void testCheckURL() {
		boolean result = RegexUtils.checkURL("http://blog.csdn.com:80/xyang81/article/details?name=&abc=����");
		Assert.assertTrue(result);
	}
	
	/**
	 * ��֤IP��ַ
	 */
	@Test
	public void testCheckIpAddress() {
		boolean result = RegexUtils.checkIpAddress("192.1.22.255");
		Assert.assertTrue(result);
	}
}