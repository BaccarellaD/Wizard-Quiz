import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public abstract class Quiz {
	
	private final Scanner input = new Scanner(System.in);
	
	List<QuizQuestion> questions;
	List<String> answers;
	
	public Quiz(){
		questions = new ArrayList<>();
		answers = new ArrayList<>();
	}
	
	public void addAllQuestions(QuizQuestion... questions){
		for(QuizQuestion question: questions){
			this.questions.add(question);
		}
	}
	
	public void addQuestion(QuizQuestion question){
		this.questions.add(question);
	}
	
	public List<String> getAnswers(){
		return answers;
	}
	
	public void takeQuiz(){
		questions.forEach(q ->{
			String answer = null;
			while(answer == null){
				System.out.println(q.getQuestion());
				List<String> options = q.getOptions();
				for(int i = 0; i < options.size(); i++){
					String option = options.get(i);
					System.out.println("[" + (i+1) + "]" + option);
				}
				System.out.print("> ");
				try{
					int index = input.nextInt()-1;
					if(index >= 0 && index < options.size()){
						answer = options.get(index);
					}else{
						System.out.println("You must a valid answer!");
					}
				}catch(InputMismatchException e){
					System.out.println("You must input a number!");
					//clear the buffer so its not an infinite loop
					input.nextLine();
				}
			}
			answers.add(answer);
		});
	}
	
	public abstract String getResults();

}
