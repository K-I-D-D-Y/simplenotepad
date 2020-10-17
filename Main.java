
import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Main


/* Author ----- KIDDY */

/*
 	This is IO Lesson for me.
	I am just a beginner
    Can Edit as You Like.
	You can only test when program output >Condition True<.
*/


/**** NOTE : NEED TO CHANGE YOUR FILE LOCATION LINK. ****/
{
	static String file_location_link = /*Only Here Put Your Test file Location.>>>>>*/   "/storage/emulated/0/Test"   /*<<<<*/;
	static File file;
    public static void main(String[] args) throws IOException 
	{
		System.out.println("Commands : \nsfile : show file\ntfread : text file read\ntfwrite : text file write\nrwfile : rewrite text file");
		pr("");
		boolean con=true;
		
		Main main = new Main();
		
	    file=new File(file_location_link);
		
		if(file.exists()){
			pr("Condition : TRUE");}
			else{pr("Condition : False");}
			pr("");
		
		Scanner sca = new Scanner(System.in);
		
		while(con){
			String input=sca.nextLine();
			
			switch(input){
				case "sfile":main.showFileList(); break;
				case "tfread": pr("Enter File Name");
					 		   String name = sca.nextLine();
				    		   main.readFile(name); break;
				case "tfwrite": pr("Enter File Name");
				                String file_name = sca.nextLine();
								pr("Enter Note");
								String text = sca.nextLine();
								main.writeFile(file_name,text);
								break;
			 	case "rwfile": pr("Enter File Name");
				               String rewrite_file_name = sca.nextLine();
							   pr("Enter Note");
							   String rewrite_note = sca.nextLine();
							   main.reWriteFile(rewrite_file_name,rewrite_note);
							   break;
			 	case "dtfile": pr("Enter File Name");
				               String delete_file_name = sca.nextLine();
							   main.deleteFile(delete_file_name);
							   break;
			}
	
		} 
	    
	}
	
	// this method show txt file list when you called
	
	public void showFileList(){
		
		File[] file_list=file.listFiles();
		for(int count = 0;count < file_list.length; count ++){
			System.out.println(file_list[count].getName());
		}
	}
	// this method for read txt file when you called
	public void readFile(String file_name) throws FileNotFoundException, IOException{
		File f=new File(file_location_link,file_name+".txt");
		String s="";
		BufferedReader fr = new BufferedReader(new FileReader(f));
		while((s=fr.readLine()) != null){
		    
			System.out.println(s);
		}

		
	}
	
	// this method write a new txt file when you called
	
	public void writeFile(String file_name,String text) throws IOException{
	
		FileWriter fw = new FileWriter(new File(file_location_link,file_name+".txt"));
		
		fw.write(text);
		fw.close();
	}
	
	// this method can rewrite an exists txt file when you called
	
	public void reWriteFile(String file_name , String text) throws IOException{
		
		FileWriter fw = new FileWriter(new File(file_location_link,file_name+".txt"),true);
		fw.append(text);
		fw.close();
	}
	
	// this method for delete a txt file when you called
	
	public void deleteFile(String file_name){
		File f=new File(file_location_link,file_name+".txt");
		f.delete();

	}
	
	// this method for print
	
	public static void pr(String message){
		System.out.println(""+message);
	}
	
}
/********************/
