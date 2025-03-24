
import java.io.*;
public class PracticeProblem {

//1
public static String getName(int line, String file){
	BufferedReader fr = null;
	String out = "";

try{
	fr = new BufferedReader(new FileReader(file));
	if (line <=3){
		for (int i=0; i<line; i++){
			if ((out=fr.readLine())!=null){
				out = out.replaceAll("\\d","");
			}	
		}
	}
	} 
catch (IOException e){}

finally {
try{
	if (fr!=null){
	fr.close();
	}
}
catch (IOException e){}
}
	return out.trim();
}


//2
public static int getAge(int line, String file){
	BufferedReader br = null;
	String out = "";

try{
	br = new BufferedReader(new FileReader(file));
	if (line <=3){
	for (int i=0; i<line; i++){
	if ((out=br.readLine())!=null){
		out = out.replaceAll("[^\\d]","");
		out = out.substring(0,2);
	}
	}
	}
} 

catch (IOException e){}

finally {
try{
	if (br!=null){
	br.close();
	}
}
catch (Exception e){}
}
	
if (out != ""){
return Integer.parseInt(out);
}
else {
	return -1;
}
}


//3
public static int getNumber(int line, String file){
	BufferedReader rd = null;
	String check ="";
	int out = -1;
try{
	rd = new BufferedReader((new FileReader(file)));
	if (line <=3){
	for (int i =0; i<line; i++){
	if ((check=rd.readLine())!=null){
	String[] breakr = check.split(" ");
	out = Integer.parseInt(breakr[3]);
	}
	}
	}
}
catch (IOException e){}

finally {
try {
	if (rd!=null){
	rd.close();
}
} catch (IOException e){}
}
	return out;
}

public static void fileAppend(String output, String filename){
	BufferedWriter bw= null;
try{
	bw = new BufferedWriter(new FileWriter(filename, true));
	bw.write(output);
}
catch (IOException e){}
finally{
try{
	if (bw!=null){
	bw.close();
	}
}
catch (IOException e){}
}
}
	
}
