import java.util.Scanner;
public class GameController {

    static void AddQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void RemoveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void ResponseComment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void IncreaseScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void ShowScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Category;
    public String Question;
    public int N;
    public String getCategory()
    {
        return Category;
    }
    public void setCategory(String category)
    {
        Category=category;
    }
    public void AddQuestion(String Question)
    {
        Scanner input=new Scanner(System.in);
       System.out.println("Enter number of questions");
       int N=input.nextInt();
       System.out.println("Enter the questions");
       for(int Q=0;Q<N;Q++)
       {
         Scanner input_Question=new Scanner(System.in);
         String Que=input_Question.nextLine();
       }
       
    }
    public void RemoveGame(String Question)
{
  Scanner input=new Scanner(System.in);
  System.out.println("Enter number of questions wanted to deletd:");
  int N=input.nextInt();
  System.out.println("Enter the questions to deledted");
       for(int Q=0;Q<N;Q++)
       {
         Scanner input_Question=new Scanner(System.in);
         String Que=input_Question.nextLine();
}
   
}
    public void ResponseComment(String Responce)
{
   System.out.println("Enter the responce comment:");
    Scanner input_Question=new Scanner(System.in);
         String Response=input_Question.nextLine();
    
}
    public void IncreaseScore(int scoree)
    {
        for(int num_Score=0;num_Score<N;num_Score++)
        {
            System.out.println("Current Score = "+ num_Score);
        }
    }
    public void ShowScore(int num_score)
    {
        System.out.println("Current Score = "+num_score); 
    }
    
}
