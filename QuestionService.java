import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
     public QuestionService(){
       questions[0] = new Question(0,"size of int","4","2","8","1","4");
       questions[1] = new Question(1,"size of double","8","6","4","1","8");
       questions[2] = new Question(2,"size of char","1","2","6","4","1");
       questions[3] = new Question(3,"size of float","4","2","1","6","4");
       questions[4] = new Question(4,"size of long long","8","4","10","6","8"); 
     }
     public void displayQuestions(){
        int i = 0;
       for(Question q:questions){
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i++] = sc.nextLine();
       }
       System.out.println("Your entries are:");
       for(String s:selection){
        System.out.println(s);
       }
     }
     public void printScore(){
        int score = 0;
        for( int i=0; i<questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userSanswer = selection[i];
            if(answer.equals(userSanswer)){
                score++;
            }
        }
        System.out.println("Your score is: "+score);
     }
}
