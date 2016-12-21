import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.Writer;
public class Student extends UserControl{
    private String Name,Gender;
    private double Age;
    private Writer GameController;
    public String getName()
{
    return Name;
}
public void setName(String name)
{
    Name=name;
}public String getGender()
{
    return Gender;
}
public void setGender(String gender)
{
    Gender=gender;
}
public double getAge()
{
    return Age;
}
public void setAge(double age)
{
    Age=age;
}


    
    
    
    
    
    
  /*  public Scores< GameController>CountScores;
    //File file;
    public Scores()
    {
         Scores = new Scores<>();
         //file = new File("C:\\Users\\ghoname\\Desktop\\lab11.txt");
         
         
    }*/
    public void ShowScore(UserControl UC)
    {
        // Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
        
        try (PrintWriter OutPut = new PrintWriter(GameController)) {
            OutPut.print(UC.name);
            OutPut.flush();
        }
    }
    
    
}
