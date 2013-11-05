package edu.uts.sep;

import java.security.MessageDigest;

public class Generator
{
	public static String md5Hash(int salt, String input)
	{
		input = salt + input;
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digest = md.digest();
			StringBuffer sb = new StringBuffer();
			for (byte b : digest)
			{
				sb.append(Integer.toHexString((int) (b & 0xff)));
			}

			return sb.toString();
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}
