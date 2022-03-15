import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
		//Create File
				File file = new File(args[0]);
		        try {
		        	//Create Buffered Reader to read each line from a standard in.
		        	InputStreamReader isr=new InputStreamReader(System.in);
		        	BufferedReader in=new BufferedReader(isr);
		        	//Create a print writer on this file.
		        	PrintWriter out=new PrintWriter(new FileWriter(file));
		        	String s;
		        	System.out.print("Enter file text. ");
		        	System.out.println("[Type ctrl-d to stop.]");
		        	//Read each input line and echo it to the screen.
		        	while ((s=in.readLine()) != null) {
		        		out.println(s);
		        	}
		        	//Close the buffered reader and the file print writer.
		        	in.close();
		        	out.close();
		        }
		        
		        catch(IOException e) {
		        	//Catch any other IOexceptions.
		        	e.printStackTrace();
		        }
			}


	}
