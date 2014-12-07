package softwareproject;
import java.io.*;
import java.util.*;


public class register {

public static void main(String[] args) {
		
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
			
			try {
				while((line = reader.readLine()) != null){
					id = line.substring(0, 4);
					num = line.substring(4,11);
					pw = line.substring(11,15);
					StudentInfo std = new StudentInfo(id,  num, pw);
					stdList.add(std);
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
<<<<<<< HEAD


=======
>>>>>>> 5efb473dabac60e28363e140d6ffd17863161da6
		Scanner scan = new Scanner(System.in);
		String input = null;
		StudentInfo std = new StudentInfo();
		
		do{
			System.out.println("���̵� �Է��Ͻÿ�");
			input = scan.nextLine();
			std.setStuId(input);
			}
			while(input.length() != 4 || !dupCheck(input, ID, stdList));
		
		do{
			System.out.println("�й��� �Է��Ͻÿ�");
			input = scan.nextLine();
			std.setStuNum(input);
			}
			while(input.length() != 7 || !dupCheck(input, NUM, stdList));
		
		do{
			System.out.println("��й�ȣ�� �Է��Ͻÿ�");
			input = scan.nextLine();
			std.setStupw(input);
			}
			while(input.length() != 4);
		
		stdList.add(std);
		
		
			BufferedWriter write;
			try {
				write = new BufferedWriter(
						new FileWriter("log.txt"));
				write.write(std.getStuId());
				write.write(std.getStuNum());
				write.write(std.getStupw());
				write.write("\n");
				write.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
	}
	
	public static boolean dupCheck(String target,int flag,ArrayList<StudentInfo> List){
		//1.id 2.num 3.pw
		switch(flag){
		case 1:
			for(int i=0; i < List.size(); i++){
				if(target.equals(List.get(i).getStuId()))
					return false;
			}
		case 2:
			for(int i=0; i < List.size(); i++){
			if(target.equals(List.get(i).getStuNum()))
				return false;
		}
		case 3:
			for(int i=0; i < List.size(); i++){
			if(target.equals(List.get(i).getStupw()))
				return false;
		}
		}
		
		return true;
	}
}