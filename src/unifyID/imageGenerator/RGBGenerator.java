package unifyID.imageGenerator;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class RGBGenerator {

	public static void main(String[] args) throws Exception {

		 int width = 128;
	      int height = 128;
	      BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		  StringBuffer result = new StringBuffer();
		  
	      URL url = new URL("https://www.random.org/integers/?num=500&min=0&max=256&col=1&base=10&format=plain&rnd=new");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      ArrayList<Integer> ar=new ArrayList<>();
	      String tmp;
	      while ((tmp = br.readLine()) != null) {
	         ar.add(Integer.parseInt(tmp));
	    	  result.append(tmp);
	      }
	      int limit = ar.size();
	      System.out.println("We reached to maximum limit of a range: " + limit);
	      br.close();
	      int i=0;
	      
	      for(int y = 0; y < height; y++){
	        for(int x = 0; x < width; x++){
	          int a = ar.get(i); 
		      i++;
	          int r = ar.get(i); 
	          i++;
	          int g = ar.get(i); 
	          i++;
	          int b = ar.get(i); 
	          i++;
	          int p = (r<<16) | (g<<8) | b;
	          try  {
	          img.setRGB(x, y, p);
	          }
	          catch (Exception e)  {
	        	  System.out.println(e.getMessage());
	          }
	          if(i==500)
	          {
	        	  i=0;
	          }
	        }
	      }
	     
	      try{
	        File file = new File("RGBImage.png");
	        ImageIO.write(img, "png", file);
	        System.out.println("Random Image has been created...");
	      }catch(IOException e){
	        System.out.println("Error: " + e);
	      }
	}

}
