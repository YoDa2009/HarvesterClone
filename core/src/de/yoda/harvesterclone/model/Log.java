package de.yoda.harvesterclone.model;

/**
 * Created by YoDa on 02.03.16.
 */
public class Log
{
	public String logText = "";
	private static Log INSTANCE;

	private Log()
	{
	}

	public static Log get()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new Log();
		}
		return INSTANCE;
	}

	public void log(String text)
	{
		String[] split = logText.split("\n");
		logText ="";
		String tmpLogText = "";
		for(int i = split.length-1; i>=0 && i > split.length-10; i-- )
		{
			tmpLogText = split[i]+ "\n" + tmpLogText;
		}
		logText = tmpLogText;
		logText += text+"\n";
		System.out.println(text);
	}

	public String getLog()
	{
		return logText;
	}
}
