package hangman;

//import java.util.Random;

import java.util.ArrayList;

public class Game {


    public String OriginalWord;
    public Integer RemainingAttempts = 10;
    public WordChooser wordChooser;
    
    public 
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    
    public Game(WordChooser wordChooser, Integer attempts)
    {
      this.OriginalWord = wordChooser.getRandomWordFromDictionary();
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

          if (guessedLetters.indexOf(currentLetter) != -1)
          {builder.append(currentLetter);
          }
          else {
            builder.append("_");

          }


            
        }
      
    } 

    return builder.toString();

  }

  public Boolean guessLetter(Character letter){

    if (this.OriginalWord.indexOf(letter) != -1 ) {

      guessedLetters.add(letter);
      
      return true;

    }

    else{

      RemainingAttempts--;
      return false;


    }

  }


}
