package softwareproject;
import java.io.*;
import java.util.*;


public class register {

public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String input = null;
		StudentInfo std = new StudentInfo();
		
		do{
			System.out.println("아이디를 입력하시오");
			input = scan.nextLine();
			std.setStuId(input);
			}
			while(input.length() != 4 || !dupCheck(input, ID, stdList));
		
		do{
			System.out.println("학번을 입력하시오");
			input = scan.nextLine();
			std.setStuNum(input);
			}
			while(input.length() != 7 || !dupCheck(input, NUM, stdList));
		
		do{
			System.out.println("비밀번호를 입력하시오");
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
}