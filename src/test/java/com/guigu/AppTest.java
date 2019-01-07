package com.guigu;

import org.junit.Test;

import com.guigu.encode.EncodeUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testGetUnicode() throws Exception {
		String str = "木";
		String s = EncodeUtil.stringToUnicode(str);
		System.out.println(s); // Ox6728
	}

	@Test
	public void testUnicodeToString() throws Exception {
		// String str = "\\u6728";
		// String str = "\\u9a71\\u52a8";
		// String str = "\\u6301\\u4e45\\u5316\\u914d\\u7f6e";
		// String str =
		// "\\u9ed8\\u8ba4\\u914d\\u7f6e\\uff0c\\u6570\\u636e\\u4fdd\\u5b58\\u5230\\u5185\\u5b58";
		// String str = "\\u96c6\\u7fa4\\u914d\\u7f6e";
		String str = "\\u6570\\u636e\\u5e93\\u8868\\u524d\\u7f00";
		String s = EncodeUtil.unicodeToString(str);
		System.err.println(s); // 木
	}

}
