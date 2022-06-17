package hangman;

//import java.util.Random;

public class Game {


    private String OriginalWord;
    private Integer RemainingAttempts = 10;
    public WordChooser wordChooser;
    
    public Game(WordChooser wordChooser, Integer attempts)
    {
      OriginalWord = wordChooser.getRandomWordFromDictionary();
      RemainingAttempts = attempts;
    }
  

  public String getWord(){

    return this.OriginalWord;    

  }

  

  public int getRemainingAttempts(){

    return this.RemainingAttempts;

  }
 

  

  public String getWordToGuess()
  {


    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < this.OriginalWord.length(); i++) 
    {
        Character currentLetter = this.OriginalWord.charAt(i);
        if (i == 0) {
            builder.append(currentLetter);
        } else {
            builder.append("_");
        }
      
    } 

    return builder.toString();

  }
}
