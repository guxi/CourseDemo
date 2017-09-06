package edu.wust.array;

public class score {
	int stuNo;
	double Score;
	int courseNo;
	score(int s,double S,int c){
		this.stuNo=s;
		this.Score=S;
		this.courseNo=c;
	}
	score(){}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public double getScore() {
		return Score;
	}
	public void setScore(double Score) {
		this.Score = Score;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

}
