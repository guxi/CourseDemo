package edu.wust.array;

import java.util.ArrayList;

public class arrTest {
	private int[] arr=new int[3];
	private int[][] arr2D=new int[2][2];
	private score[] S=new score[3];
	

	
	void get(){
		/*for(int i=0;i<arr.length;i++){
			System.out.println(i+":"+arr[i]);
		}*/
		for(score s:S){
			System.out.println(s.getCourseNo()+s.getScore()+s.getStuNo());
		}
	}
	/*void set(){
		for(int i=0;i<arr.length;i++){
			arr[i]=i+3;
			
		}
	}*/
	
	void SecForTest(score[] scRef,int[][] Arr2D ){
		
		System.out.println("-------基本数据类型------");
		int i=0;
		for(int z:arr){        //相当于int z=arr[i];
			z=6;       
			System.out.println(z);			
			System.out.println(arr[i]);			
			}
		
		System.out.println("-------2DArr------");
		int j=0;
		for(int[] z:Arr2D){        //相当于int[] z=Arr2D[i][j];
			z[0]=6;       
			System.out.println(z[0]);			
			System.out.println(Arr2D[j][0]);			
			}
		
		System.out.println("-------reference------");
		int k=0;
		for(score s:scRef){      //相当于score s=scRef[i];
			s.setScore(6);
			System.out.println(s.getScore());			
			System.out.println(scRef[k].getScore());
			i++;		
		}
		
	}
	void sett(score[] sc){
		System.out.println("-------基本数据类型------");
		int j=0;
		for(int z:arr){        //相当于int z=arr[i];
			z=6;       
			System.out.println(z);			
			System.out.println(arr[j]);			
			}
		System.out.println("-------reference------");
		//for(score s:sc){
		//	System.out.println(s.getScore());
		//}
		int i=0;
		for(score s:sc){      //相当于score s=sc[i];
			s.setScore(4);
			System.out.println(s.getScore());			
			System.out.println(sc[i].getScore());
			i++;
			
			
			//System.out.println("-----after"+i+"---------");
			//System.out.println(sc[i].getScore());
			//sc[i].setScore(1.0);
			//System.out.println(sc[i].getScore());
		}
		
	}

	public static void main(String[] args) {
		arrTest t=new arrTest();
		t.S[0]=new score(1,1.0,1);
		t.S[1]=new score(2,2.0,2);
		t.S[2]=new score(3,3.0,3);
		
		t.sett(t.S);
		
		//int i=0;
		System.out.println("-----after---------");
		for(score s:t.S){
		System.out.println(s.getScore());
		//i++;
		}
	}

}
