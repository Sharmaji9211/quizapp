package com.quiz.service;

import java.util.Scanner;

import com.quiz.app.QuizRunner;

public class LoginService {
	  
	public LoginService() {
		loginWindow();
	}
	public void loginWindow() {
		System.out.println("-------------------------- Welcome the Quiz PlayGround -------------------------------");	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Login Details");
		System.out.println("1. Admin");
		System.out.println("2. User");
		int choice= sc.nextInt();
		QuizRunner Quiz =new QuizRunner();
	    switch(choice) {
		case 1: 
			System.out.println("Enter Your AdminName");
			String adminname=sc.next();
			System.out.println("Enter Your Password");
			String adminpassword=sc.next();
			adminLogin(adminname,adminpassword);
			break;
		case 2: 
			System.out.println("-------------------------- Welcome the Quiz PlayGround -------------------------------");
			System.out.println("Enter Your UserName");
			String username=sc.next();
			System.out.println("Enter Your Password");
			String password=sc.next();
			userLogin(username,password);
			break;
		default: System.out.println("Enter Your choose Write choicece");
		}  
	    
	  }

	 public void adminLogin(String adminname,String adminpassword) {
		 if(adminname.equals("shivam")&& adminpassword.equals("123")) {
				System.out.println("You Have to Create the Quiz! ");
			}
			else {
				System.out.println("Please Enter the Correct Details");
			}
	 }
    public void userLogin(String username,String password) {
   	 if(username.equals("shivam")&& password.equals("123")) {
   		 Playground Player1=new Playground();	
   		 Player1.startQuiz();
			}
			else {
				System.out.println("Please Enter the Correct Details");
			}
    }


	
	}
	
     
	

