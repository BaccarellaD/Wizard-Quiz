import java.util.ArrayList;
import java.util.List;

public class QuizQuestion {
	private String question;
	private List<String> options;
	
	public QuizQuestion(){
		options = new ArrayList<>();
	}
	
	public void addOption(String option){
		options.add(option);
	}
	
	public void addAllOptions(String... options){
		for(String option: options){
			this.options.add(option);
		}
	}
	
	public List<String> getOptions(){
		return options;
	}
	
	public void setQuestion(String question){
		this.question = question;
	}
	
	public String getQuestion(){
		return question;
	}
}
