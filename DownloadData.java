import java.net.*;


public class DownloadData
{
	public static void main(String[] args)
	{
		try{
		String url="Pass the url of the file to be donwloaded here";
		
		URL u= new URL(url);
		
		HttpURLConnection con=  (HttpURLConnection) u.openConnection() // Opens the connection
		
		InputStream is= con.getInputStream(); // It fetches the Input Stream for the connection for download
		
		FileOutputStream fout= new FileOutputStream("path of the output file");
		//Path of the file where you want the downloaded data to be written
		
		int data= is.read();
		while(data != -1)
		{
			fout.write(data);
			data=is.read();
		}
		fout.close();
		System.out.println("Write Success");
		}catch(MalformedURLException ex)
		{
			
			System.out.println(ex);
		}catch(IOException ex)
		{
			System.out.println(ex);
		}
	
	}




}
