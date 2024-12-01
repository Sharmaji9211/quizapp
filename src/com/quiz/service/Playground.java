package com.quiz.service;
import java.util.Scanner;
import com.quiz.model.Question;
public class Playground implements QuizServices {
 
	 Question question[] = new Question[5];
	 String userAns [] = new String[5];
	 
	@Override
	public void setQues() {
		question[0]= new Question(1 , " int Size","1","4","2","8","4");
		question[1]= new Question(2 , " Byte Size","1","4","6","8","1");
		question[2]= new Question(3 , " Float Size","2","4","6","8","4");
		question[3]= new Question(4 , " double Size","2","4","6","8","8");
		question[4]= new Question(5 , " short Size","2","4","6","8","2");
	}

	@Override
	public void quizPlayer() {
		  setQues();
		for(int i =0; i<question.length;i++) {
			String q =question[i].displayQues();
			System.out.println(q);
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose Your Answer : ");
			userAns[i]= sc.nextLine();
			
		}
			
		
	}

	@Override
	public int getScore() {
		  int score=0;
	        for(int i=0;i<question.length;i++) {
	        	String correctAns=question[i].getAns();
	        	if(userAns[i].equals(correctAns)) {
	        		score=score+1;
	        	}
	        	
	        }
	        
	        
		return score;
	}
	
	@Override
	public void viewAns() {

         for(int i=0; i<question.length;i++) {
        	 System.out.println(question[i].displayAns());
         }
		
	}

	@Override
	public void startQuiz() {
		quizPlayer();
		int score= getScore();
		float scorePercentage= (score*100/question.length);
		if(scorePercentage>=60) {
			System.out.println("Congratulations!, You have won the quiz. Your Score is "+ scorePercentage+"%  out of the 100 " );
		}
		else {
			System.out.println("Sorry!, You have lose the quiz. Your Score is "+ scorePercentage+"%  out of the 100 " );
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Enter 'view' to  see the Answer.");
		Scanner sc= new Scanner(System.in);
		String SeeAns= sc.nextLine();
        if(SeeAns.equals("view")) {
        	for(Question question : question  ) {
        		System.out.println(question.displayAns());
        	}
        }
	}

	

	
	
}
