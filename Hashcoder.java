public class Hashcoder
{	
	public int hash(Object obj)
	{
		String s = obj.toString();
		int i = 0;
		char c = 'a';
		for(int x = 0; x<10; x++)
		{
			c = s.charAt(x % s.length());
			i += (int)c;
		}
		i = s.length() - i;
		String s1 = s.getClass().getString();
		c = s1.charAt(s.length()%s1.length());
		i = i - (int)c;
		if(obj instanceof String)
		{
			i = i * 472882049;
		}
		if(obj instanceof Integer)
		{
			i = i * 393342743;
		}
		return i;
	}
	
	public String getCoderName()
	{
		return "Akshina";
	}
}
