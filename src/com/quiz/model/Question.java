
package com.quiz.model;

public class Question {
	
	 int id;
	 String questionName;
	 String option1;
	 String option2;
	 String option3;
	 String option4;
	 String ans;
	 
	 
	public Question(int id, String questionName, String option1, String option2, String option3, String option4,
			String ans) {
		
		this.id = id;
		this.questionName = questionName;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.ans = ans;
	}
	
	
	

	public String displayQues() {
		return "Question id=" + id + "\n"
				+"QuestionName="+questionName + "\n"
						+ "a->    " + option1 + "\n"
						+ "b->    " + option2 + "\n"
				        + "c->    " + option3 + "\n"
						+ "d->    " + option4 + "";
	}



public String displayAns() {
	 String Ans = " "+id+  " : " +ans;
	 return Ans;
	 
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getQuestionName() {
	return questionName;
}




public void setQuestionName(String questionName) {
	this.questionName = questionName;
}




public String getOption1() {
	return option1;
}




public void setOption1(String option1) {
	this.option1 = option1;
}




public String getOption2() {
	return option2;
}




public void setOption2(String option2) {
	this.option2 = option2;
}




public String getOption3() {
	return option3;
}




public void setOption3(String option3) {
	this.option3 = option3;
}




public String getOption4() {
	return option4;
}




public void setOption4(String option4) {
	this.option4 = option4;
}




public String getAns() {
	return ans;
}




public void setAns(String ans) {
	this.ans = ans;
}






}
