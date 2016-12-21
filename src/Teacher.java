public class Teacher extends GameController {
private String Name,Gender;
private double Age;
public String getName()
{
    return Name;
}
public void setName(String name)
{
    Name=name;
}
public String getGender()
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

 public GameController CreateGame()
    {
        GameController.AddQuestion();
    return null;
    }

    /**
     *
     */
  public GameController RemoveGamee()
{
    GameController. RemoveGame();
    return null;
}
public GameController ResponseCommentt()
{
   GameController.ResponseComment();
   return null;
}
  }













