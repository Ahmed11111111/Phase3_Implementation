
public class Scores extends GameController{
    private int score;
    public int getscore()
{
    return score;
}
public void setscore(int scor)
{
    score=scor;
}

   
    
    public  GameController IncreaseScoreee()
{
   GameController.IncreaseScore();
   return null;
}
    
    public GameController ShowScoree()
    {
      GameController.ShowScore();  
        return null;
    }
    
    
}
