package softwareproject;
import java.io.*;
import java.util.*;


public class login{
	   

    public static void main(String[] args){
       // TODO Auto-generated method stub
    	
    	ArrayList<StudentInfo> stdList = new ArrayList<StudentInfo>();
		String id;
		String num;
		String pw;
		final int ID=1,NUM=2,PW=3;
		
		File aFile = new File("log.txt");
		FileReader fileReader;
		try {
			fileReader = new FileReader(aFile);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Scanner scan = new Scanner(System.in);
		String input = null;
		StudentInfo std = new StudentInfo();

    	do{
			System.out.println("아이디:");
			input = scan.nextLine();
			std.setStuId(input);
			}
			while(input.length() != 4 || !dupCheck(input, ID, stdList));
		
		
		do{
			System.out.println("비밀번호:");
			input = scan.nextLine();
			std.setStupw(input);
			}
			while(input.length() != 4);
    }
    
    
	public static boolean dupCheck(String target,int flag,ArrayList<StudentInfo> List){
		//1.id 2.num 3.pw
		switch(flag){
		case 1:
			for(int i=0; i < List.size(); i++){
				if(target.equals(List.get(i).getStuId()))
					return false;
			}
		/*case 2:
			for(int i=0; i < List.size(); i++){
			if(target.equals(List.get(i).getStuNum()))
				return false;
		}*/
		case 3:
			for(int i=0; i < List.size(); i++){
			if(target.equals(List.get(i).getStupw()))
				return false;
		}
		}
		
		return true;
	}
    

 }