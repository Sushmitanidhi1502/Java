import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create File
		File file = new File(args[0]);
        try {
        	//Create Buffered Reader to read each line from a file.
        	BufferedReader in=new BufferedReader(new FileReader(file));
        	String s;
        	//Read each line from the file and echo it to the screen.
        	s = in.readLine();
        	while(s!=null) {
        		System.out.println("Read: " + s);
        		 s = in.readLine();
        	}
        	//Close the buffered reader
        	in.close();
        }
        catch(FileNotFoundException e1) {
        	//If this file does not exist 
        	System.err.println("File not found: " +file);
        }
        catch(IOException e2) {
        	//Catch any other IOexceptions.
        	e2.printStackTrace();
        }
	}

}
