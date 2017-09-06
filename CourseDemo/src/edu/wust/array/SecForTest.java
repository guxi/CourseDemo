package edu.wust.array;

import java.util.ArrayList;

public class SecForTest {
	private int[] arr={1,1,1};
	private int[][] arr2D=new int[2][2];
	private score[] S=new score[3];
	private ArrayList<score> scoreList=new ArrayList<score>();
	
	void getValue(){		
		System.out.println("-----数组-------");
		int i=0;
		for(int val:arr){             //相当于int val=arr[i];
			val=6;
			System.out.println("val:"+val);
			System.out.println("arr:"+arr[i]);
			i++;
		}
		
		System.out.println("-----2D数组-------");
		int j=0;
		for(int[] val:arr2D){		          //相当于int[] val=arr2D[j];	
			val[0]=6;			
			System.out.println("val:"+val[0]);
			System.out.println("arr:"+arr2D[j][0]);
			j++;
			}
		
		System.out.println("-----引用-------");
		int k=0;
		for(score val:S){                      //相当于score val=S[k];
			val.setScore(6);
			System.out.println("val:"+val.getScore());
			System.out.println("Ref:"+S[k].getScore());
			k++;
			}
		
		System.out.println("-----容器-------");
		int l=0;
		for(score val:scoreList){                      //相当于score val=scoreList.get(l);
			val.setScore(6);
			System.out.println("val:"+val.getScore());
			System.out.println("lst:"+scoreList.get(l).getScore());
			l++;
			}
	}
	
	void setValue(){		
		S[0]=new score(1,1.0,1);
		S[1]=new score(2,2.0,2);
		S[2]=new score(3,3.0,3);
		scoreList.add(new score(1,1.0,1));
		scoreList.add(new score(2,2.0,2));
		scoreList.add(new score(3,3.0,3));
	}
	
	public static void main(String[] args) {
		SecForTest sft=new SecForTest();
		sft.setValue();
		sft.getValue();
	}
}
