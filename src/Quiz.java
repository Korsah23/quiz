

public class Quiz {
	
	
	public static void main(String[] args){
		
		//creation of question objects
		/*Question question1 = new MultipleChoiceQuestion("The Dove is a type of:","bird","reptile","amphibian","mammal","fish","a");
		question1.check();
		
		
		Question question2 = new MultipleChoiceQuestion("What is the Most Populated Country in the world","United States","China","India","Ghana","Russia","b");
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion("What is the name of the president Of USA(Type A,B,C,D,E):","Obama Barrack","Donald Trump","Joe Biden","Modi","Putin","c");
		question3.check();*/
		
		Question question4 = new TrueFalseQuestion("The Dog is a domestic animal","TRUE");
		question4.check();
		
		Question question5 = new TrueFalseQuestion("Mermaids are real","FALSE");
		question5.check();
		
		Question question6 = new TrueFalseQuestion("The Zebra is a domestic animal","FALSE");
		question6.check();
		
		
		Question question7 = new TrueFalseQuestion("Messi is the best player","TRUE");
		question7.check();
		
		
		question7.showResults();
}//end of main method
	
	

	
	
}
