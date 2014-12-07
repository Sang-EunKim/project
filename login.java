package softwareproject;
import java.io.*;
import java.util.*;


public class login{
	   

    public static void main(String[] args){
       // TODO Auto-generated method stub
    	
    
<<<<<<< HEAD
    
	public static boolean dupCheck(String target,int flag,ArrayList<StudentInfo> List){
		//1.id 3.pw
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
=======
    	
>>>>>>> e4f1293dea0b9c7400fd6dac51b45b80abb4d5c3
	}
    

 }