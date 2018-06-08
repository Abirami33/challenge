package jsoup2;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class struts {
	public static void main(String[] args) throws IOException
	{
		String url="https://stackoverflow.com/questions/tagged/struts";
		Document document=Jsoup.connect(url).get();
		System.out.println("Title is-->"+document.title());
		String c=document.select("div.summarycount").text();
		System.out.println("Questions or sections-->"+c);
		System.out.println("Number of tags-->" + document.getAllElements().size());
		
	}

}
